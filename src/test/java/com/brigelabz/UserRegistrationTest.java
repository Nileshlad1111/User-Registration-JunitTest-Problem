package com.brigelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration Preregistration = new UserRegistration();

    //first name test cases
    @Test
    public void givenFirstName_whenValid_thenReturnTrue() {
        String name = "Nilesh";
        boolean firstName = Preregistration.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_whenValid_thenReturnFalse() {
        String name = "nilesh";
        boolean firstName = Preregistration.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_whenInvalidFirstLetterUpperCase_thenReturnFalse() {
        String name = "NILESH";
        boolean firstName = Preregistration.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //last name test cases
    @Test
    public void givenLastName_whenValid_thenReturnTrue() {
        String name="Lad";
        boolean lastName = Preregistration.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_whenValid_thenReturnFalse() {
        String name="lad";
        boolean lastName = Preregistration.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_whenInvalidLastLetterUpperCase_thenReturnFalse() {
        String name = "LAD";
        boolean lastName = Preregistration.validateLastName(name);
        Assert.assertFalse(lastName);
    }
    //test cases email
    @Test
    public void givenEmail_WhenValid_ThenReturnTrue() {
        String email = "ladnilesh1994@gmail.com";
        boolean emailID = Preregistration.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturnFalse() {
        String email = "ladnilesh1994@gmail";
        boolean emailID = Preregistration.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    //test case mobile number
    @Test
    public void givenPhoneNumber_WhenValid_ThenReturn() {
        String phoneNumber = "+91 8888310299";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertTrue(phoneNumber1);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ThenReturnTrue() {
        String phoneNumber = "8888310299";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertTrue(phoneNumber1);
    }

    @Test
    public void givenPhoneNumberIncomplete_WhenInValid_ThenReturnFalse() {
        String phoneNumber = "88883102";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertFalse(phoneNumber1);
    }

    @Test
    public void givenPhoneNumber_WhenInValid_ThenReturnFalse() {
        String phoneNumber = "918888310299";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertFalse(phoneNumber1);
    }

    //password test cases
    @Test
    public void givenPassword_WhenValid_ThenReturnTrue() {
        String password = "NILESLad1111@gmail.co.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPassword_WhenInValid_ThenReturnFalse() {
        String password = "nilesh1@.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }
}
