package com.codegym.bestticket.exception;

public class RegisterFailedException extends RuntimeException {
    public RegisterFailedException(String message) {
        super(message);
    }
}
