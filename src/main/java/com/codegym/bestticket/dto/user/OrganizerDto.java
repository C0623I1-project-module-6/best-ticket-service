package com.codegym.bestticket.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Data
public class OrganizerDto {
    private UUID id;
    @NotBlank(message = "Name is mandatory!")
    private String name;
    @NotBlank(message = "Phone number is mandatory!")
    @Pattern(regexp = "0\\d{9}", message = "Phone number must start with 0 and contain 10 digits")
    private String phoneNumber;
    @NotBlank(message = "Email is mandatory!")
    @Email(message = "Invalid email format!")
    private String email;
    @NotBlank(message = "Id card is mandatory!")
    private String idCard;
    @NotBlank(message = "Tax code is mandatory!")
    private String taxCode;
    @NotBlank(message = "Business code is mandatory!")
    private String businessCode;
    @NotBlank(message = "Date range is mandatory!")
    private Date dateRange;
    @NotBlank(message = "Issued by is mandatory!")
    private String issuedBy;
    private String organizerType;
    private Map<String, Object> result;
    @NotBlank(message = "Company name is mandatory!")
    private String companyName;
    @NotBlank(message = "Company phone is mandatory!")
    @Pattern(regexp = "0\\d{9}", message = "Phone number must start with 0 and contain 10 digits")
    private String companyPhone;
    @NotBlank(message = "Company email is mandatory!")
    @Email(message = "Invalid email format!")
    private String companyEmail;
    @NotBlank(message = "Date range tax code email is mandatory!")
    private String dateRangeTaxCode;
    @NotBlank(message = "Issued by is mandatory!")
    private String issuedByTaxCode;
}
