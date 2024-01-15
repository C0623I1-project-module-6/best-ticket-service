package com.codegym.bestticket.dto.user;

import lombok.Data;

import java.util.UUID;

@Data
public class OrganizerDto {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
    private String taxCode;
    private UUID organizerType;
    private UUID user;
}
