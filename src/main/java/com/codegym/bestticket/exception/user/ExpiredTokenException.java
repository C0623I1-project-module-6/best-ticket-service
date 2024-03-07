package com.codegym.bestticket.exception.user;

public class ExpiredTokenException extends Exception {
    public ExpiredTokenException(String message, Throwable cause) {
        super(message,cause);
    }
}
