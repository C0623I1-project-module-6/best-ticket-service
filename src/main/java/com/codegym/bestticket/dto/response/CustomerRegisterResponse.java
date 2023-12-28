package com.codegym.bestticket.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class CustomerRegisterResponse {
    private UUID id;
    private String username;
    private String phoneNumber;
    private String email;
    private UUID user;
}
