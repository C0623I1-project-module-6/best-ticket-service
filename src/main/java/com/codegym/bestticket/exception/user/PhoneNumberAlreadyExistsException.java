package com.codegym.bestticket.exception.user;

public class PhoneNumberAlreadyExistsException extends RuntimeException{
    public PhoneNumberAlreadyExistsException(String message){
        super(message);
    }

}
