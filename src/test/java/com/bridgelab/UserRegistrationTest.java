package com.bridgelab;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void firstName_ShouldReturnHappy_IfValid() throws UserRegistrationException {
        String expectedResult = "Happy";
        String actualResult = userRegistration.firstName("Antara");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void firstName_ShouldReturnSad_IfInValid() throws UserRegistrationException{
        String expectedResult = "Sad";
        String actualResult = userRegistration.firstName("antara");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lastName_ShouldReturnHappy_IfValid() throws UserRegistrationException{
        String expectedResult = "Happy";
        String actualResult = userRegistration.lastName("Paul");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lastName_ShouldReturnSad_IfInValid() throws UserRegistrationException{
        String expectedResult = "Sad";
        String actualResult = userRegistration.lastName("paul");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void emailId_ShouldReturnHappy_IfValid() throws UserRegistrationException{
        String expectedResult="Happy";
        String actualResult = userRegistration.email("abc.xyz@bl.co");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void emailId_ShouldReturnSad_IfInValid() throws UserRegistrationException{
        String expectedResult = "Sad";
        String actualResult = userRegistration.email("antara@gmail.com");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void mobile_ShouldReturnHappy_IfValid() throws UserRegistrationException{
        String expectedResult="Happy";
        String actualResult = userRegistration.mobile("91 8561234789");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void mobile_ShouldReturnSad_IfInValid() throws UserRegistrationException{
        String expectedResult = "Sad";
        String actualResult = userRegistration.mobile("91-4686876463");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void passWord_ShouldReturnHappy_IfValid() throws UserRegistrationException{
        String expectedResult="Happy";
        String actualResult = userRegistration.password("antarA&5555");
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void passWord_ShouldReturnSad_IfInValid() throws UserRegistrationException{
        String expectedResult="Sad";
        String actualResult = userRegistration.password("abc123");
        Assert.assertEquals(expectedResult, actualResult);
    }

}

