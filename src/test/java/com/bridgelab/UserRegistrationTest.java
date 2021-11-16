package com.bridgelab;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {
    @Test
    public void firstName_ShouldReturnHappy_IfValid() {
        String expectedResult = "Happy";
        String actualResult = UserRegistration.firstName("Antara");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void firstName_ShouldReturnSad_IfInValid() {
        String expectedResult = "Sad";
        String actualResult = UserRegistration.firstName("antara");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lastName_ShouldReturnHappy_IfValid() {
        String expectedResult = "Happy";
        String actualResult = UserRegistration.lastName("Paul");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lastName_ShouldReturnSad_IfInValid() {
        String expectedResult = "Sad";
        String actualResult = UserRegistration.lastName("paul");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void emailId_ShouldReturnHappy_IfValid(){
        String expectedResult="Happy";
        String actualResult = UserRegistration.email("abc.xyz@bl.co");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void emailId_ShouldReturnSad_IfInValid() {
        String expectedResult = "Sad";
        String actualResult = UserRegistration.lastName("antara@gmail.com");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void mobile_ShouldReturnHappy_IfValid(){
        String expectedResult="Happy";
        String actualResult = UserRegistration.mobile("91 8561234789");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void mobile_ShouldReturnSad_IfInValid() {
        String expectedResult = "Sad";
        String actualResult = UserRegistration.mobile("91-4686876463");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void passWord_ShouldReturnHappy_IfValid(){
        String expectedResult="Happy";
        String actualResult = UserRegistration.passwordRule4("antarA&5555");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void passWord_ShouldReturnSad_IfInValid(){
        String expectedResult="Sad";
        String actualResult = UserRegistration.passwordRule4("abc123");
        Assert.assertEquals(expectedResult, actualResult);
    }

}

