package com.codegym.bestticket.dto.request.customer;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CustomerRequestDTO {
    private UUID id;
    private String fullName;
    private String gender;
    private String idCard;
    private Date dateOfBirth;
    private UUID user;
}
