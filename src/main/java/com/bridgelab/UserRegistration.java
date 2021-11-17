package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The UserRegistration program implements an application that take user details with proper pattern or condition
 * @author Antara
 * @since 2021-11-12
 */

public class UserRegistration{
    Scanner scanner=new Scanner(System.in);

    public String firstName(String fName) throws UserRegistrationException {
        /**
         *This method is used to add First Name with proper pattern
         */
        String regex = "[A-Z][a-z]{3,}";
        try {
            //code may raise exception
            Pattern pattern = Pattern.compile(regex);
            if (fName.isEmpty()) {
                throw new UserRegistrationException("Enter a valid first name");
            }
            Matcher matcher = pattern.matcher(fName);
            if (matcher.matches()) {
                System.out.println("Valid First Name : " + fName);
                System.out.println(analyseMood("Happy"));
                return "Happy";
            } else {
                System.out.println("Please Enter a Valid First name which start with Capital letter" +
                        " and has minimum 3 characters");
                System.out.println(analyseMood("Sad"));
                return "Sad";
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please enter valid First Name!");
        }
    }
    public String lastName(String lName) throws UserRegistrationException {
        /**
         *This method is used to add Last Name with proper pattern
         */
        String regex = "[A-Z][a-z]{3,}";
        try {
            //code may raise exception
            Pattern pattern = Pattern.compile(regex);
            if (lName.isEmpty()) {
                throw new UserRegistrationException("enter a valid last name");
            }
            Matcher matcher = pattern.matcher(lName);
            if (matcher.matches()) {
                System.out.println("Valid Last Name : " + lName);
                System.out.println(analyseMood("Happy"));
                return "Happy";
            } else {
                System.out.println("Please Enter a Valid Last name which start with Capital letter" +
                        " and has minimum 3 characters");
                System.out.println(analyseMood("Sad"));
                return "Sad";
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("enter a valid last name");
        }
    }
    public String email(String email) throws UserRegistrationException{
        /**
         *This method is used to add Email with proper pattern
         */
        String regex="^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*$";
        try {
            //code may raise exception
            Pattern pattern = Pattern.compile(regex);
            if (email.isEmpty()) {
                throw new UserRegistrationException("enter a valid last name");
            }
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Valid Email Id : "+email);
                System.out.println(analyseMood("Happy"));
                return "Happy";
            } else {
                System.out.println("Please Enter a Valid Email Id");
                System.out.println(analyseMood("Sad"));
                return "Sad";
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("enter a valid email");
        }
    }


    public String mobile(String mobile) throws UserRegistrationException{
        /**
         *This method is used to add Mobile Number with proper format
         */
        String regex="^91\\s[6789][0-9]{9}";
        try {
            //code may raise exception
            Pattern pattern = Pattern.compile(regex);
            if (mobile.isEmpty()) {
                throw new UserRegistrationException("enter a valid last name");
            }
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches()) {
                System.out.println("Valid Mobile Number : "+mobile);
                System.out.println(analyseMood("Happy"));
                return "Happy";
            } else
            {
                System.out.println("Please Enter a Valid Mobile Number");
                System.out.println(analyseMood("Sad"));
                return "Sad";
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("enter a valid mobile");
        }
    }

    public String password(String password) throws UserRegistrationException{
        /**
         *This method is used to add Password
         * Rule1-minimun 8 characters
         * Rule2-at least 1 upper case
         * Rule3-at least 1 numeric number
         * Rule4-at least 1 special character
         */
        String regex = "^(?=.*?[A-Z])[a-z](?=.*?[0-9])(?=.*?[~!@#$%^&*]).{8,}$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if (password.isEmpty()) {
                throw new UserRegistrationException("enter a valid last name");
            }
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("#Valid Password : " + password);
                System.out.println(analyseMood("Happy"));
                return "Happy";
            } else {
                System.out.println("#Invalid Password");
                System.out.println(analyseMood("Sad"));
                return "Sad";
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("enter a valid password");
        }
    }
    public static boolean emailSampleCheck(String email) {
        /**
         *This method is used to check some email which are passed through parameter
         */
        boolean check= Pattern.matches("^^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-.]+)*$", email);
        if (check)
            System.out.println("#Valid Email : "+email);
        else
            System.out.println("#Invalid Email");
        return check;
    }

    // main method
    public static void main(String[] args) throws UserRegistrationException {
        /**
         * This is main method which makes use of firstName, lastName, email, mobile, password methods
         * @return nothing
         */
        //System.out.println("Welcome To User Registration Problem");
        UserRegistration userRegistration=new UserRegistration();
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the first name : ");
        userRegistration.firstName(userInput.next());
        System.out.println("Enter the last name : ");
        userRegistration.lastName(userInput.next());
        System.out.println("Enter the email : ");
        userRegistration.email(userInput.next());
        System.out.println("Enter the mobile no : ");
        userRegistration.mobile(userInput.next());
        System.out.println("Enter the password : ");
        userRegistration.password(userInput.next());

        // this is code for SAMPLE EMAIL TEST
        emailSampleCheck("abc@yahoo.com");
        emailSampleCheck("abc-100@yahoo.com");
        emailSampleCheck("abc.100@yahoo.com");
        emailSampleCheck("abc111@abc.com");
        emailSampleCheck("abc-100@abc.net");
        emailSampleCheck("abc.100@abc.com.au");
        emailSampleCheck("abc@1.com");
        emailSampleCheck("abc@gmail.com.com");
        emailSampleCheck("abc+100@gmail.com.com");
    }

    public static String analyseMood(String message) {
        if(message.contains("Happy")) {
            return "Entry Successful";
        }
        else {
            return "Entry Failed";
        }
    }
}