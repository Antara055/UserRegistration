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
        boolean checkingCondition = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*$", email);
        if (checkingCondition==true)
            System.out.println("Email Id : "+email);
        else
            System.out.println("Please Enter a Valid Email Id");
    }

    public void mobile(){
        /**
         *This method is used to add Mobile Number with proper format
         */
        System.out.println("Enter the Mobile Number");
        String mobile=user_input.nextLine();
        boolean checkingCondition = Pattern.matches("^91\\s[6789][0-9]{9}", mobile);
        if (checkingCondition==true)
            System.out.println("Mobile Number : "+mobile);
        else
            System.out.println("Please Enter a Valid Mobile Number");
    }


    public void passwordRule1(){
        /**
         *This method is used to add Password
         * Rule1-minimun 8 characters
      */
        System.out.print("Enter password which have minimun 8 characters :  ");
        String passwordRule1 = user_input.nextLine();
        boolean check = Pattern.matches("[a-zA-Z]{8,}", passwordRule1);
        if (check)
            System.out.println("#Valid Password");
        else
            System.out.println("#Invalid Password");
    }


    public void passwordRule2(){
        /**
         *This method is used to add Password
         * Rule1-minimun 8 characters
         * Rule2-at least 1 upper case
         */
        System.out.print("Enter password which have at least 1 upper case:  ");
        String passwordRule2 = user_input.nextLine();
        boolean check = Pattern.matches("^(?=.*?[A-Z])[a-z].{8,}$", passwordRule2);
        if (check==true)
            System.out.println("#Valid Password");
        else
            System.out.println("#Invalid Password");
    }

    public void passwordRule3(){
        /**
         *This method is used to add Password
         * Rule1-minimun 8 characters
         * Rule2-at least 1 upper case
         * Rule3-at least 1 numeric number
         */
        System.out.print("Enter password which have at least 1 numeric number:  ");
        String passwordRule3 = user_input.nextLine();
        boolean check = Pattern.matches("^(?=.*?[A-Z])[a-z](?=.*?[0-9]).{8,}$", passwordRule3);
        if (check)
            System.out.println("#Valid Password");
        else
            System.out.println("#Invalid Password");
    }

    public void passwordRule4() {
        /**
         *This method is used to add Password
         * Rule1-minimun 8 characters
         * Rule2-at least 1 upper case
         * Rule3-at least 1 numeric number
         * Rule4-at least 1 special character
         */
        System.out.println("Enter a password which have atleast 1 uppercase,1 numeric,1 special character");
        String passwordRule4=user_input.nextLine();
        boolean check= Pattern.matches("^(?=.*?[A-Z])[a-z](?=.*?[0-9])(?=.*?[~!@#$%^&*]).{8,}$", passwordRule4);
        if (check)
            System.out.println("#Valid Password");
        else
            System.out.println("#Invalid Password");
    }

    private void emailSampleCheck(String email) {
        /**
         *This method is used to check some email which are passed through parameter
         */
        boolean check= Pattern.matches("^[a-z0-9+_.-]+@[a-z0-9.]+$", email);
        if (check)
            System.out.println("#Valid Email");
        else
            System.out.println("#Invalid Email");
    }

    // main method
    public static void main(String[] args) {
        /**
         * This is main method which makes use of firstName, lastName, email, mobile, password methods
         * @return nothing
         */
        //System.out.println("Welcome To User Registration Problem");
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.email();
        userRegistration.mobile();
        userRegistration.passwordRule1();
        userRegistration.passwordRule2();
        userRegistration.passwordRule3();
        userRegistration.passwordRule4();

        // this is code for SAMPLE EMAIL TEST
        userRegistration.emailSampleCheck("abc@yahoo.com");
        userRegistration.emailSampleCheck("abc-100@yahoo.com");
        userRegistration.emailSampleCheck("abc.100@yahoo.com");
        userRegistration.emailSampleCheck("abc111@abc.com");
        userRegistration.emailSampleCheck("abc-100@abc.net");
        userRegistration.emailSampleCheck("abc.100@abc.com.au");
        userRegistration.emailSampleCheck("abc@1.com");
        userRegistration.emailSampleCheck("abc@gmail.com.com");
        userRegistration.emailSampleCheck("abc+100@gmail.com.com");
    }

