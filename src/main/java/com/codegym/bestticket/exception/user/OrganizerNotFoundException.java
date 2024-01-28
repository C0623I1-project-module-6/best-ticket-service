package com.codegym.bestticket.exception.user;

import jakarta.persistence.EntityNotFoundException;

public class OrganizerNotFoundException extends EntityNotFoundException {
    public OrganizerNotFoundException(String message) {
        super(message);
    }
}
