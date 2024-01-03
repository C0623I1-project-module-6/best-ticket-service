package com.codegym.bestticket.payload.response.user.customer;

import com.codegym.bestticket.entity.user.User;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CustomerResponse {
    private UUID id;
    private String fullName;
    private String gender;
    private String idCard;
    private Date dateOfBirth;
    private User user;
    private Boolean isDeleted;
}
