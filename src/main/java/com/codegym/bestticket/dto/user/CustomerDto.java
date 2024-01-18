package com.codegym.bestticket.dto.user;

import com.codegym.bestticket.validation.UniqueCustomer;
import lombok.Data;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Data
public class CustomerDto {
    private UUID id;
    private String fullName;
    private String gender;
    @UniqueCustomer
    private String idCard;
    private Date dateOfBirth;
    @UniqueCustomer
    private String phoneNumber;
    private Map<String, Object> result;

}
