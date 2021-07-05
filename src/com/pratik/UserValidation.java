package com.pratik;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    //UC1
    public void isFirstnameValid() {
        final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Firstname:");
            String pattern = input.nextLine();

            if(Pattern.matches(FIRST_NAME_PATTERN, pattern))
                System.out.println("Firstname is VALID.");
            else
                throw new userException("Invalid Input , first name starts with Capital and minimum 3 characters.");
            System.out.println("Firstname :-" + pattern);
        }
        catch (userException e) {
            System.out.println(e.errorMessage);
            isFirstnameValid();
        }
    }
    
    //UC2
    public void isLastnameValid() {
        final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Lastname:");
            String pattern = input.nextLine();

            if(Pattern.matches(LAST_NAME_PATTERN, pattern))
                System.out.println("Lastname is VALID.");
            else
                throw new userException("Invalid Input , Lastname starts with Capital and minimum 3 characters.");
            System.out.println("Lastname :-" + pattern);
        }
        catch (userException e) {
            System.out.println(e.errorMessage);
            isLastnameValid();
        }
    }
    
    //UC3
    public void isEmailValid() {
        final String EMAIL_PATTERN = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Email-ID:");
            String pattern = input.nextLine();

            if(Pattern.matches(EMAIL_PATTERN, pattern))
                System.out.println("Email is VALID.");
            else
                throw new userException("Invalid input, email contains 1 UpperCase, 1 LowerCase, 1 Numeric and 1 special Character.");
            System.out.println("Email-ID :-" + pattern);
        }
        catch (userException e) {
            System.out.println(e.errorMessage);
            isEmailValid();
        }
    }

    //UC4
    public void isMobileFormatValid() {
        final String MOBILE_PATTERN = "^[0-9]{2}[\\s][0-9]{10}$";

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Mobile Number:");
            String pattern = input.nextLine();

            if(Pattern.matches(MOBILE_PATTERN, pattern))
                System.out.println("Mobile Number is VALID.");
            else
                throw new userException("Invalid input, email contains country code follow by space and 10 digit number .");
            System.out.println("Mobile Number :-" + pattern);
        }
        catch (userException e) {
            System.out.println(e.errorMessage);
            isMobileFormatValid();
        }
    }
    
    //UC5 to 8
    public void isPasswordValid() {
        final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Password:");
            String pattern = input.nextLine();

            if(Pattern.matches(PASSWORD_PATTERN, pattern))
                System.out.println("Password is VALID.");
            else
                throw new userException("Please Try Again.");
            System.out.println("Password :-" + pattern);
        }
        catch (userException e) {
            System.out.println(e.errorMessage);
            isPasswordValid();
        }
    }
    
    //UC-9
    private final String MULTIPLE_EMAIL_PATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

    public boolean validateMultipleEmail(String email) {
        Pattern pattern = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher match = pattern.matcher(email);
        boolean result = match.matches();
        return result;
    }
}