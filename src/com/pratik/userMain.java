/**********************************************************************
 * This code implements user registration program and gives custom
 * exception if user input is wrong.
 *
 * @author Pratik Chaudhari
 * @since 04/07/2021
 **********************************************************************/
package com.pratik;

public class userMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the user registration program");
        UserValidation userValidation = new UserValidation();

        userValidation.isFirstnameValid();
        userValidation.isLastnameValid();
        userValidation.isEmailValid();
        userValidation.isMobileFormatValid();
        userValidation.isPasswordValid();
    }
}
