package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The UserRegistration program implements an application that take user details with proper pattern or condition
 * @author Antara
 * @since 2021-11-12
 */

public class UserRegistration {
    /**
    *This method is used to add First Name with proper pattern
    */
    public void firstName(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String fName=user_input.nextLine();
        boolean checkingCondition = Pattern.matches("[A-Z][a-z]{3,}", fName);
        if (checkingCondition==true)
            System.out.println("First Name : "+fName);
        else
            System.out.println("Please Enter a Valid First name which start with Capital letter" +
                    " and has minimum 3 characters");
    }
    public static void main(String[] args) {
        /**
         * This is main method which makes use of firstName method
         * @return nothing
         */
        //System.out.println("Welcome To User Registration Problem");
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.firstName();
    }
}
