package com.brigelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    //DECLARE PATTER
    private String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private String EMAIL_PATTERN = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private String MOBILE_NUMBER_PATTERN = "^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$";
    private String PASSWORD_PATTERN = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";


    //first name method
    public String validateFirstName(String firstName) throws InvalidDetailExceptions {
        try {
            if(firstName.matches(NAME_PATTERN)){
                return "Valid";
            }
            else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid format");
            }
        }catch (NullPointerException e) {
            throw new InvalidDetailExceptions (InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }

    //last name method
    public String validateLastName(String lastName) throws InvalidDetailExceptions {
        try {
            if(lastName.matches(NAME_PATTERN)){
                return "Valid";
            }
            else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid formate");
            }
        }
        catch (NullPointerException e) {
            throw new InvalidDetailExceptions (InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }

    }
    //email method
    public String validateEmailId(String emailId) throws InvalidDetailExceptions {
        try {
            if (emailId.matches(EMAIL_PATTERN)) {
                return "Valid";
            }
            else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid email");
            }
        }
        catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Don't provide null value");
        }
    }

    //mobile number method
    public String validatePhoneNumber(String phoneNo) throws InvalidDetailExceptions {
        try {
            if(phoneNo.matches(MOBILE_NUMBER_PATTERN)) {
                return "Valid";
            }
            else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid mobile number");
            }
        }
        catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Don't pass null value");
        }
    }

    //password method
    public String validatePassword(String passcode) throws InvalidDetailExceptions {
        try {
            if (passcode.matches(PASSWORD_PATTERN)) {
                return "Valid";
            }
            else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please Provide valid password");
            }
        }
        catch (NullPointerException e)
        {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Don't provide null Value");
        }
    }


    //to check mood method(happy and sad)
    public String moodAnalyse(String firstName, String lastName, String phoneNumber, String email, String password ) throws InvalidDetailExceptions {
        try{
            if(validateFirstName(firstName) == "Valid" && validateLastName(lastName) == "Valid" && validateEmailId(email) == "Valid" && validatePhoneNumber(phoneNumber) == "Valid" && validatePassword(password) == "Valid"){
                return "HAPPY";
            }
            else {
                return "SAD";
            }
        }
        catch (NullPointerException e)
        {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Dont pass null value");
        }

    }

}
