package com.codegym.bestticket.exception;

public class EmailNotFoundException extends RuntimeException{
    public EmailNotFoundException(String message){
        super(message);
    }
}
