package com.codegym.bestticket.dto.booking;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoUserInputDto {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String confirmEmail;
}
