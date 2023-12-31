package com.codegym.bestticket.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CustomerDTO {
    private String fullName;
    private String gender;
    private String idCard;
    private Date dateOfBirth;
    private UUID userId;
}
