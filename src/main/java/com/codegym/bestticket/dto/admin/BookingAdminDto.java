package com.codegym.bestticket.dto.admin;

import lombok.Data;

import java.util.UUID;

@Data
public class BookingAdminDto {
    private String organizeName;
    private String customerName;
    private UUID bookingId;

}
