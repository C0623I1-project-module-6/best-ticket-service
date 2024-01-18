package com.codegym.bestticket.payload.response.user;

import lombok.Data;

import java.util.UUID;

@Data
public class ExistsUserResponse {
    private UUID id;
    private String username;
    private String email;
    private String phoneNumber;
}
