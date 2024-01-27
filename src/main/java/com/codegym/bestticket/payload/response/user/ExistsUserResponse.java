package com.codegym.bestticket.payload.response.user;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ExistsUserResponse {
    private String username;
    private String userEmail;

    private String customerPhoneNumber;
    private String customerIdCard;
    private String customerReceiptEmail;

    private String personPhoneNumber;
    private String personEmail;
    private String personIdCard;
    private String personTaxCode;

    private String companyBusinessCode;
    private String companyName;
    private String companyEmail;
    private String companyPhone;
}
