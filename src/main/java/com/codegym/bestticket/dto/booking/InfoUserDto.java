package com.codegym.bestticket.dto.booking;

import com.codegym.bestticket.entity.user.Customer;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class InfoUserDto {
    private String id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private List<String> listRoles;
    private String customerPhoneNumber;
    private String organizer;
    private Customer customer;
    private Boolean isDeleted;
}
