package com.codegym.bestticket.dto.response.user;

import lombok.Data;

import java.util.UUID;

@Data
public class RegisterDtoResponse {
    private UUID id;
    private String phoneNumber;
    private String email;
}
