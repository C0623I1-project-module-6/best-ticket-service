package com.codegym.bestticket.dto.request;

import lombok.Data;

import java.util.UUID;

@Data
public class IndividualRegisterRequest {
    private String username;
    private String password;
    private UUID user;
}
