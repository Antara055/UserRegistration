package com.bridgelab;


        import java.util.regex.Pattern;

/**
 * The UserRegistration program implements an application that take user details with proper pattern or condition
 * @author Antara
 * @since 2021-11-12
 */

public class UserRegistration {
    public static String firstName(String fName){
        /**
         *This method is used to add First Name with proper pattern
         */
        boolean checkingCondition = Pattern.matches("[A-Z][a-z]{3,}", fName);
        if (checkingCondition==true) {
            System.out.println("Valid First Name : " + fName);
            System.out.println(analyseMood("Happy"));
            return "Happy";
        }
        else {
            System.out.println("Please Enter a Valid First name which start with Capital letter" +
                    " and has minimum 3 characters");
            System.out.println(analyseMood("Sad"));
            return "Sad";
        }

    }

    public static String lastName(String lName){
        /**
         *This method is used to add Last Name with proper pattern
         */
        boolean checkingCondition = Pattern.matches("[A-Z][a-z]{3,}", lName);
        if (checkingCondition==true){
            System.out.println("Valid Last Name : "+lName);
            System.out.println(analyseMood("Happy"));
            return "Happy";}
        else {
            System.out.println("Please Enter a Valid Last name which start with Capital letter" +
                    " and has minimum 3 characters");
            System.out.println(analyseMood("Sad"));
            return "Sad";
        }
    }

    public static String email(String email){
        /**
         *This method is used to add Email with proper pattern
         */

        boolean checkingCondition = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*$", email);
        if (checkingCondition==true){
            System.out.println("Valid Email Id : "+email);
            System.out.println(analyseMood("Happy"));
            return "Happy";}

        else {
            System.out.println("Please Enter a Valid Email Id");
            System.out.println(analyseMood("Sad"));
            return "Sad";
        }
    }

    public static String mobile(String mobile){
        /**
         *This method is used to add Mobile Number with proper format
         */

        boolean checkingCondition = Pattern.matches("^91\\s[6789][0-9]{9}", mobile);
        if (checkingCondition==true){
            System.out.println("Valid Mobile Number : "+mobile);
            System.out.println(analyseMood("Happy"));
            return "Happy";
        }
        else {
            System.out.println("Please Enter a Valid Mobile Number");
            System.out.println(analyseMood("Sad"));
            return "Sad";
        }
    }



    public static String passwordRule4(String password) {
        /**
         *This method is used to add Password
         * Rule1-minimun 8 characters
         * Rule2-at least 1 upper case
         * Rule3-at least 1 numeric number
         * Rule4-at least 1 special character
         */

        boolean check= Pattern.matches("^(?=.*?[A-Z])[a-z](?=.*?[0-9])(?=.*?[~!@#$%^&*]).{8,}$", password);
        if (check){
            System.out.println("#Valid Password : "+password);
            System.out.println(analyseMood("Happy"));
            return "Happy";
        }
        else {
            System.out.println("#Invalid Password");
            System.out.println(analyseMood("Sad"));
            return "Sad";
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
    public static void main(String[] args) {
        /**
         * This is main method which makes use of firstName, lastName, email, mobile, password methods
         * @return nothing
         */
        //System.out.println("Welcome To User Registration Problem");
        UserRegistration userRegistration=new UserRegistration();
        firstName("Antara");
        lastName("Chowdhury");
        email("abc.xyz@bl.co");
        mobile("91 8725648308");
        passwordRule4("antarA&5555");

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