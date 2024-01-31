package com.codegym.bestticket.dto.admin;

import lombok.Data;

import java.util.UUID;

@Data
public class UserAdminDto {
    private String username;
    private String fullName;
    private String email;
    private String avatar;
    private UUID customerId;
    private String customerName;
    private String organizerName;
    private UUID organizerId;
    private Boolean isActivated;
}
