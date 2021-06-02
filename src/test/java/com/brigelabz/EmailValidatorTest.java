package com.brigelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidatorTest {
    private String emails;
    private String expectedResult;

    //constructor
    public EmailValidatorTest(String emails, String expectedResult) {
        this.emails = emails;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", "Success"},
                {"abc-100@yahoo.com", "Success"},
                {"abc.100@yahoo.com", "Success"},
                {"abc111@abc.com", "Success"},
                {"abc-100@abc.net", "Success"},
                {"abc.100@abc.com.au", "Success"},
                {"abc@1.com", "Success"},
                {"abc@gmail.com.com", "Success"},
                {"abc+100@gmail.com", "Success"},
        });
    }

    @Test
    public void passAllValidEmails_whenExpectedSameForall_ShouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        String email = null;
        try {
            email = userRegistration.validateEmailId(emails);
        }
        catch (InvalidDetailExceptions e)
        {
            Assert.assertEquals(expectedResult, email);
        }

    }
}