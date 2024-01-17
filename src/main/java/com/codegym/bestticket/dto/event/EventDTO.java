package com.codegym.bestticket.dto.event;

import lombok.Data;
import java.util.UUID;

@Data
public class EventDTO {
    private UUID id;
    private String name;
    private String description;
    private String image;
    private String duration;
    private Integer ticketAmount;
    private Boolean isDeleted;

}
