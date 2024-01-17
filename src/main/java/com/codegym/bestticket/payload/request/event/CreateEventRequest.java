package com.codegym.bestticket.payload.request.event;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class CreateEventRequest {
    private String name;
    private String description;
    private String status;
    private String duration;
    private String image;
    private String province;
    private String district;
    private String address;
    private List<String> eventTypeNames;
    private LocalDateTime startDateTime;
}
