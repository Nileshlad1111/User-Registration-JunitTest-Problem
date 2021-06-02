package com.brigelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    //DECLARE PATTER
    private String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private String EMAIL_PATTERN = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private String MOBILE_NUMBER_PATTERN = "^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$";
    private String PASSWORD_PATTERN = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";


    //first name method
    public boolean validateFirstName(String name){
        return (Pattern.matches(FIRST_NAME_PATTERN , name));
    }

    //last name method
    public boolean validateLastName(String name) {
        return (Pattern.matches(LAST_NAME_PATTERN , name));
    }

    //email method
    public boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN , email);
    }

    //mobile number method
    public boolean isValidPhonemes(String phoneNumber) {
        return (Pattern.matches(MOBILE_NUMBER_PATTERN, phoneNumber));
    }

    //password method
    public boolean isValidPassword(String password) {
        return (Pattern.matches(PASSWORD_PATTERN , password));
    }

    //to check mood method(happy and sad)
    public String moodAnalyse(String firstName, String lastName, String phoneNumber, String email, String password ) {
        if(validateFirstName(firstName) == true && validateLastName(lastName) == true && isValidEmail(email) == true && isValidPhonemes(phoneNumber) == true && isValidPassword(password) == true){
            return "HAPPY";
        }
        else {
            return "SAD";
        }
    }

}
