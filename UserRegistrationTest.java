package com.UserRegistrationLa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private URLambda urlambda;

    @BeforeEach
    public void setup() {
        urlambda = new URLambda();
    }

    // Happy Test Cases

    @Test
    public void givenValidFirstName_whenValidateFirstName_thenTrue() throws InvalidFirstNameException {
        boolean isValid = urlambda.validateFirstName("John");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenValidLastName_whenValidateLastName_thenTrue() throws InvalidLastNameException {
        boolean isValid = urlambda.validateLastName("Doe");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenValidEmail_whenValidateEmail_thenTrue() throws InvalidEmailException {
        boolean isValid = urlambda.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenValidMobile_whenValidateMobile_thenTrue() throws InvalidMobileException {
        boolean isValid = urlambda.validateMobile("91 9919819801");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenValidPassword_whenValidatePassword_thenTrue() throws InvalidPasswordException {
        boolean isValid = urlambda.validatePassword("Password1@");
        Assertions.assertTrue(isValid);
    }

    // Sad Test Cases

    @Test
    public void givenInvalidFirstName_whenValidateFirstName_thenFalse() throws InvalidFirstNameException {
        boolean isValid = urlambda.validateFirstName("j");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenInvalidLastName_whenValidateLastName_thenFalse() throws InvalidLastNameException {
        boolean isValid = urlambda.validateLastName("d");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenInvalidEmail_whenValidateEmail_thenFalse() throws InvalidEmailException {
        boolean isValid = urlambda.validateEmail("invalid.email");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenInvalidMobile_whenValidateMobile_thenFalse() throws InvalidMobileException {
        boolean isValid = urlambda.validateMobile("123");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenInvalidPassword_whenValidatePassword_thenFalse() throws InvalidPasswordException {
        boolean isValid = urlambda.validatePassword("pass");
        Assertions.assertFalse(isValid);
    }
    // Happy Test Cases

    @Test
    public void givenValidFirstName_whenValidateFirstName_thenNoExceptionThrown() {
        Assertions.assertDoesNotThrow(() -> urlambda.validateFirstName("John"));
    }

    @Test
    public void givenValidLastName_whenValidateLastName_thenNoExceptionThrown() {
        Assertions.assertDoesNotThrow(() -> urlambda.validateLastName("Doe"));
    }

    @Test
    public void givenValidEmail_whenValidateEmail_thenNoExceptionThrown() {
        Assertions.assertDoesNotThrow(() -> urlambda.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenValidMobile_whenValidateMobile_thenNoExceptionThrown() {
        Assertions.assertDoesNotThrow(() -> urlambda.validateMobile("91 9919819801"));
    }

    @Test
    public void givenValidPassword_whenValidatePassword_thenNoExceptionThrown() {
        Assertions.assertDoesNotThrow(() -> urlambda.validatePassword("Password1@"));
    }

// Sad Test Cases

    @Test
    public void givenInvalidFirstName_whenValidateFirstName_thenInvalidFirstNameExceptionThrown() {
        Assertions.assertThrows(InvalidFirstNameException.class, () -> urlambda.validateFirstName("j"));
    }

    @Test
    public void givenInvalidLastName_whenValidateLastName_thenInvalidLastNameExceptionThrown() {
        Assertions.assertThrows(InvalidLastNameException.class, () -> urlambda.validateLastName("d"));
    }

    @Test
    public void givenInvalidEmail_whenValidateEmail_thenInvalidEmailExceptionThrown() {
        Assertions.assertThrows(InvalidEmailException.class, () -> urlambda.validateEmail("invalid.email"));
    }

    @Test
    public void givenInvalidMobile_whenValidateMobile_thenInvalidMobileExceptionThrown() {
        Assertions.assertThrows(InvalidMobileException.class, () -> urlambda.validateMobile("123"));
    }

    @Test
    public void givenInvalidPassword_whenValidatePassword_thenInvalidPasswordExceptionThrown() {
        Assertions.assertThrows(InvalidPasswordException.class, () -> urlambda.validatePassword("pass"));
    }

}


