package com.UserRegistrationLa;

import java.util.regex.Pattern;

public class URLambdaImpl extends URLambda {
    public boolean validateFirstName(String firstName) throws InvalidFirstNameException {
        if (!Pattern.matches(NAME_REGEX, firstName)) {
            throw new InvalidFirstNameException("Invalid first name");
        }
        return false;
    }

    public boolean validateLastName(String lastName) throws InvalidLastNameException {
        if (!Pattern.matches(NAME_REGEX, lastName)) {
            throw new InvalidLastNameException("Invalid last name");
        }
        return false;
    }

    public boolean validateEmail(String email) throws InvalidEmailException {
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new InvalidEmailException("Invalid email");
        }
        return false;
    }

    public boolean validateMobile(String mobile) throws InvalidMobileException {
        if (!Pattern.matches(MOBILE_REGEX, mobile)) {
            throw new InvalidMobileException("Invalid mobile number");
        }
        return false;
    }

    public boolean validatePassword(String password) throws InvalidPasswordException {
        if (!Pattern.matches(PASSWORD_REGEX, password)) {
            throw new InvalidPasswordException("Invalid password");
        }
        return false;
    }

}


