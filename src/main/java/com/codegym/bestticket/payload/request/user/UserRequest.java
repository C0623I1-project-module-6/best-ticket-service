package com.codegym.bestticket.payload.request.user;

import lombok.Data;

import java.util.UUID;

@Data
public class UserRequest {
    private UUID id;
    private String password;
    private String phoneNumber;
    private String email;

}
