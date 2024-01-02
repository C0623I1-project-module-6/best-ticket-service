package com.codegym.bestticket.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDTO {
    private UUID id;
    private String password;
    private String phoneNumber;
    private String email;

}
