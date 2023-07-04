package com.UserRegistrationLa;
import java.util.regex.Pattern;

public class URLambda {
    protected static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
        public static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([.+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";
        public static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";

        public boolean validateFirstName(String firstName) throws InvalidFirstNameException {
            return Pattern.matches(NAME_REGEX, firstName);
        }

        public boolean validateLastName(String lastName) throws InvalidLastNameException {
            return Pattern.matches(NAME_REGEX, lastName);
        }

        public boolean validateEmail(String email) throws InvalidEmailException {
            return Pattern.matches(EMAIL_REGEX, email);
        }

        public boolean validateMobile(String mobile) throws InvalidMobileException {
            return Pattern.matches(MOBILE_REGEX, mobile);
        }

        public boolean validatePassword(String password) throws InvalidPasswordException {
            return Pattern.matches(PASSWORD_REGEX, password);
        }
    }




