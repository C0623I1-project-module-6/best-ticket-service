package com.codegym.bestticket.dto.event;

import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.location.Location;
import com.codegym.bestticket.entity.user.Organizer;
import lombok.Data;

import java.util.UUID;

@Data
public class EventDTO {
    private UUID id;
    private String name;
    private Location location;
    private Time time;
    private String description;
    private String image;
    private String duration;
    private Integer ticketAmount;
    private Boolean isDeleted;

    private Organizer organizer;
}
