package com.codegym.bestticket.exception.user;

import jakarta.persistence.EntityNotFoundException;

public class CustomerNotFoundException extends EntityNotFoundException {
    public CustomerNotFoundException (String message){
        super(message);
    }
}
