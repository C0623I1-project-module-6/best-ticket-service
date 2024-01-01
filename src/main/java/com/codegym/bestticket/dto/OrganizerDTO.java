package com.codegym.bestticket.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OrganizerDTO {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
    private String taxCode;
    private UUID organizerType;
    private UUID user;

}
