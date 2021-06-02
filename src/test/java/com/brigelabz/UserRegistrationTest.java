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

}
