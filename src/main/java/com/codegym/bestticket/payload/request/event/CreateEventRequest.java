package com.codegym.bestticket.payload.request.event;

import com.codegym.bestticket.dto.event.EventDTO;
import lombok.Data;

import java.util.List;
import java.util.UUID;
@Data
public class CreateEventRequest {
    private String name;
    private String description;
    private String image;
    private String duration;
    private List<UUID> eventTypeIds;
}
