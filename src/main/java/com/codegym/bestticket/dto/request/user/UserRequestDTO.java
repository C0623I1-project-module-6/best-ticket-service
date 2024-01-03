package com.codegym.bestticket.dto.request.user;

import lombok.Data;

import java.util.UUID;

@Data
public class UserRequestDTO {
    private UUID id;
    private String password;
    private String phoneNumber;
    private String email;

}
