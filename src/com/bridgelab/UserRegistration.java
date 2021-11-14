package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The UserRegistration program implements an application that take user details with proper pattern or condition
 * @author Antara
 * @since 2021-11-12
 */

public class UserRegistration {
    Scanner user_input = new Scanner(System.in);
    public void firstName(){
        /**
         *This method is used to add First Name with proper pattern
         */
        System.out.println("Enter the First Name");
        String fName=user_input.nextLine();
        boolean checkingCondition = Pattern.matches("[A-Z][a-z]{3,}", fName);
        if (checkingCondition==true)
            System.out.println("First Name : "+fName);
        else
            System.out.println("Please Enter a Valid First name which start with Capital letter" +
                    " and has minimum 3 characters");
    }

    public void lastName(){
        /**
         *This method is used to add Last Name with proper pattern
         */
        System.out.println("Enter the Last Name");
        String lName=user_input.nextLine();
        boolean checkingCondition = Pattern.matches("[A-Z][a-z]{3,}", lName);
        if (checkingCondition==true)
            System.out.println("Last Name : "+lName);
        else
            System.out.println("Please Enter a Valid Last name which start with Capital letter" +
                    " and has minimum 3 characters");
    }

    public void email(){
        /**
         *This method is used to add Email with proper pattern
         */
        System.out.println("Enter the Email Id");
        String email=user_input.nextLine();
        boolean checkingCondition = Pattern.matches("^^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*$", email);
        if (checkingCondition==true)
            System.out.println("Email Id : "+email);
        else
            System.out.println("Please Enter a Valid Email Id");
    }
    public static void main(String[] args) {
        /**
         * This is main method which makes use of firstName, lastName, email methods
         * @return nothing
         */
        //System.out.println("Welcome To User Registration Problem");
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.email();
    }
}
