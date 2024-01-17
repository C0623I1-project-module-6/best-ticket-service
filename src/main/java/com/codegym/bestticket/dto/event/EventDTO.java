package com.codegym.bestticket.dto.event;


import com.codegym.bestticket.entity.user.Organizer;
import lombok.Data;

import java.util.UUID;

@Data
public class EventDTO {
    private UUID id;
    private String name;
    private String address;
    private String description;
    private String image;
    private String duration;
    private Boolean isDeleted;
    private Organizer organizer;

}
