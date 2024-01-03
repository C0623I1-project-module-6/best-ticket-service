package com.codegym.bestticket.dto.request.organizer;

import lombok.Data;

import java.util.UUID;

@Data
public class OrganizerRequestDTO {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
    private String idCard;
    private String taxCode;
    private UUID organizerType;
    private UUID user;

}
