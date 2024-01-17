package com.codegym.bestticket.dto.user;

import lombok.Data;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Data
public class OrganizerDto {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
    private String idCard;
    private String taxCode;
    private String businessCode;
    private Date dateRange;
    private String issuedBy;
    private String organizerType;
    private Map<String, Object> result;
}
