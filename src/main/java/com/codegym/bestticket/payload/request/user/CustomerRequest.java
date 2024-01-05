package com.codegym.bestticket.payload.request.user;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CustomerRequest {
    private UUID id;
    private String fullName;
    private String gender;
    private String idCard;
    private Date dateOfBirth;
    private String avatar;
}
