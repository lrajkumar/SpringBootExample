package com.ubi.vehicletracker.service;

import org.springframework.stereotype.Service;

@Service
public class ValidatorService {

    public boolean doValidate(String value) {
        return value.endsWith("@gmail.com");
    }
}
