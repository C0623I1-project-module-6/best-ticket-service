package com.codegym.bestticket.dto.user;

import com.codegym.bestticket.validation.UniqueOrganizer;
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
    @Pattern(regexp = "\\d{10}", message = "Phone number must contain 10 digits!")
    @UniqueOrganizer
    private String phoneNumber;
    @NotBlank(message = "Email is mandatory!")
    @Email(message = "Invalid email format!")
    private String email;
    private String idCard;
    private String taxCode;
    private String businessCode;
    @NotBlank(message = "Date range is mandatory!")
    private Date dateRange;
    @NotBlank(message = "Issued by is mandatory!")
    private String issuedBy;
    private String organizerType;
    private Map<String, Object> result;
    private String companyName;
    private String companyPhone;
    private String companyEmail;
    private String dateRangeTaxCode;
    private String issuedByTaxCode;
}
