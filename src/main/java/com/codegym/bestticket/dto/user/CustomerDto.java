package com.codegym.bestticket.dto.user;

import lombok.Data;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Data
public class CustomerDto {
    private UUID id;
    private String fullName;
    private String gender;
    private String idCard;
    private Date dateOfBirth;
    private String phoneNumber;
    private Map<String, Object> result;

}
