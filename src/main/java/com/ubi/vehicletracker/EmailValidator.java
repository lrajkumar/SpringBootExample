package com.ubi.vehicletracker;

import com.ubi.vehicletracker.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailValidator {

    private final ValidatorService validatorService;

    @Autowired
    public EmailValidator(ValidatorService validatorService) {
        this.validatorService = validatorService;
    }

    public boolean validate(String value) {
        if (value == null || value.equals("")) {
            return false;
        }

        if(!value.contains("@") || !value.contains(".")) {
            return false;
        }

        if(value.indexOf('@') != value.lastIndexOf('@')) {
            return false;
        }

        return validatorService.doValidate(value);
    }
}
