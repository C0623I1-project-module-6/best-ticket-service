package com.codegym.bestticket.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class CustomerDto {
    private String avatar;
    @NotBlank(message = "Full name is mandatory!")
    private String fullName;
    @NotBlank(message = "Receipt email is mandatory!")
    @Email(message = "Invalid receipt email format!")
    private String receiptEmail;
    @NotBlank(message = "Gender is mandatory!")
    private String gender;
    @NotBlank(message = "Id card is mandatory!")
    private String idCard;
    @NotBlank(message = "Date of birth is mandatory!")
    private Date dateOfBirth;
    @NotBlank(message = "Phone number is mandatory!")
    @Pattern(regexp = "0\\d{9}", message = "Phone number must start with 0 and contain 10 digits")
    private String phoneNumber;
    private Map<String, Object> result;

}
