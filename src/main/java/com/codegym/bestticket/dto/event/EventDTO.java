package com.codegym.bestticket.dto.event;


import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.ticket.Ticket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class EventDTO {
    private UUID id;
    private String name;
    private String address;
    private String description;
    private String image;
    private String duration;
    private Integer ticketAmount;
    private Boolean isDeleted;
    private Time time;
}
