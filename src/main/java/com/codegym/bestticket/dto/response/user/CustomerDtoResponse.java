package com.codegym.bestticket.dto.response.user;

import com.codegym.bestticket.entity.user.User;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CustomerDtoResponse {
    private String phoneNumber;
    private String email;
    private String fullName;
    private String gender;
    private String idCard;
    private UUID userId;
    private Date dateOfBirth;
}
