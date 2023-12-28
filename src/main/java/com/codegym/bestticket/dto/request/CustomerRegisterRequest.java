package com.codegym.bestticket.dto.request;

import lombok.Data;

import java.util.UUID;

@Data
public class CustomerRegisterRequest {
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private UUID user;
}
