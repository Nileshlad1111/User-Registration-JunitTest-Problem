package com.brigelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    //first name test cases
    @Test
    public void givenUserFirstName_whenValid_ShouldReturnSuccess() {
        String isFNameValid = null;
        try {
            isFNameValid = userRegistration.validateFirstName("Nilesh");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals("Valid", isFNameValid);
        }

    }

    @Test
    public void givenFirstName_WhenValueIsInvalid_shouldReturnException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.validateFirstName("nilesh");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testFirstName_WhenPassNullValue_shouldNullValueException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.validateFirstName(null);
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    //last name test cases
    @Test
    public void testLastName_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String islNameValid = null;
        try {
            islNameValid = userRegistration.validateLastName("Lad");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals("Valid" , islNameValid);
        }
    }

    @Test
    public void testLastName_WhenValueIsInvalid_ShouldThrowInvalidException(){
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateLastName("Lad");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testLastName_WhenValueIsNull_ShouldThrowNullPointerException(){
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateLastName(null);
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    //test cases email
    @Test
    public void testEmailId_WhenValueIsValid_ShouldReturnSuccess(){
        UserRegistration userRegistration = new UserRegistration();
        String isEmailValid = null;
        try {
            isEmailValid = userRegistration.validateEmailId("ladnilesh1994@gmail.com");
        }
        catch (InvalidDetailExceptions e)
        {
            Assert.assertEquals("Valid", isEmailValid);
        }
    }

    @Test
    public void testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateEmailId("pk.@.com");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testEmailId_WhenValueIsNull_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateEmailId(null);
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    //test case mobile number
    @Test
    public void testMobileNum_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isPhoneValid = null;
        try {
            isPhoneValid = userRegistration.validatePhoneNumber("91 8888310299");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals("Valid", isPhoneValid);
        }
    }

    @Test
    public void testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validatePhoneNumber("808337");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validatePhoneNumber(null);
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    //password test cases
    @Test
    public void testPassword_WhenNotSatisfy_AttlistOneNumberOneUppercase_OneSpecialLetterRule_ShouldThrowInvalidPassException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validatePassword("abc");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }


    @Test
    public void testPassword_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validatePassword(null);
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    //mood test cases
    @Test
    public void mood_Analyser_Test_Happy() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodHappy = null;
        try {
            isMoodHappy = userRegistration.moodAnalyse("Nilesh", "Lad", "91 8888310299", "ladnilesh1994@gmail.com", "1111@Pawan");
            Assert.assertEquals("HAPPY", isMoodHappy);
        }
        catch (InvalidDetailExceptions e) {

        }
    }

    @Test
    public void mood_Analyser_Test_Sad() {
        UserRegistration userRegistration = new UserRegistration();
       // String isMoodSad = null;
        try {
            String isMoodHappy = userRegistration.moodAnalyse("Nilesh", "Lad", "+91 8888310299", "ladnilesh1111@gmail.com", "1111@nilesh");
            Assert.assertEquals("SAD", isMoodHappy);

        }
        catch (InvalidDetailExceptions e) {

        }
    }
}
