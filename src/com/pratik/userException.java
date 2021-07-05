package com.pratik;

public class userException extends Exception {
    String errorMessage;

    public userException(String message) {
        this.errorMessage = message;
    }
}
