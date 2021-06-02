package com.brigelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    //DECLARE PATTER
    private String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    //first name method
    public boolean validateFirstName(String name){
        return (Pattern.matches(FIRST_NAME_PATTERN , name));
    }

}
