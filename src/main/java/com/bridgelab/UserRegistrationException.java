package com.bridgelab;

public class UserRegistrationException extends Exception{
    public UserRegistrationException(String msg){
        //calling the constructor of parent Exception
        super(msg);
        System.out.println(msg);
    }
}
