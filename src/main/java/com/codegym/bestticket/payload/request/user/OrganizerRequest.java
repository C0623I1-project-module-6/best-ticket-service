package com.codegym.bestticket.payload.request.user;

import lombok.Data;

import java.util.UUID;

@Data
public class OrganizerRequest {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
    private String taxCode;
    private UUID organizerType;
    private UUID user;

}
