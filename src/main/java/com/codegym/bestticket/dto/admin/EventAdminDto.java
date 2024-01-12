package com.codegym.bestticket.dto.admin;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class EventAdminDto {
    private UUID id;
    private String name;
    private String organizerName;
    private String customerName;
    private LocalDateTime time;
    private List<String> eventType;
    private String location;
}
