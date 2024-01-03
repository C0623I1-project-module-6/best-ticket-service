package com.codegym.bestticket.payload.response.organizer;

import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.entity.user.User;
import lombok.Data;

import java.util.UUID;

@Data
public class OrganizerResponseDTO {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
    private String idCard;
    private String taxCode;
    private OrganizerType organizerType;
    private User user;
    private Boolean isDeleted;
}
