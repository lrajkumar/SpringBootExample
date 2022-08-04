package com.ubi.vehicletracker;

import com.ubi.vehicletracker.service.ValidatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmailValidatorTest {

    private ValidatorService validatorService = Mockito.mock(ValidatorService.class);

    private EmailValidator validator;

    @BeforeEach
    void setUp() {
        validator = new EmailValidator(validatorService);
    }

    @Test
    void validate_emptyValue() {
        String value = "";

        boolean result = validator.validate(value);

        Assertions.assertFalse(result);
    }

    @Test
    void validate_nullValue() {
        String value = null;

        boolean result = validator.validate(value);

        Assertions.assertFalse(result);
    }

    @Test
    void validate_withInvalidEmail() {
        String value = "test_gmail.com";
        Mockito.when(validatorService.doValidate(value)).thenReturn(false);

        boolean result = validator.validate(value);

        Assertions.assertFalse(result);
    }

    @Test
    void validate_withInvalidEmailWithMultipleAtCharacter() {
        String value = "test@gmail@com";
        Mockito.when(validatorService.doValidate(value)).thenReturn(false);

        boolean result = validator.validate(value);

        Assertions.assertFalse(result);
    }

    @Test
    void validate_withValidEmail() {
        String value = "test@gmail.com";
        Mockito.when(validatorService.doValidate(value)).thenReturn(true);

        boolean result = validator.validate(value);

        Assertions.assertTrue(result);
        Mockito.verify(validatorService).doValidate(value);
    }

    @Test
    void validate_withInvalidEmailWithoutDot() {
        String value = "test@gmailcom";

        boolean result = validator.validate(value);

        Assertions.assertFalse(result);
        Mockito.verifyNoInteractions(validatorService);
    }

}
