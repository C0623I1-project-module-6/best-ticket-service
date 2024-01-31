package com.codegym.bestticket.exception;

public class BookingSaveException extends RuntimeException {

    public BookingSaveException(String message) {
        super(message);
    }

    public BookingSaveException(String message, Throwable cause) {
        super(message, cause);
    }
}
