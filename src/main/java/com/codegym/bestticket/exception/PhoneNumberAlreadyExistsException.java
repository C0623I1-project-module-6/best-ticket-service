package com.codegym.bestticket.exception;

public class PhoneNumberAlreadyExistsException extends RuntimeException{
    public PhoneNumberAlreadyExistsException(String message){
        super(message);
    }
}
