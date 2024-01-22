package com.codegym.bestticket.dto.event;

import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.ticket.TicketType;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class EventDetailDto {
    private UUID id;
    private String name;
    private String description;
    private String image;
    private String duration;
    private Integer ticketAmount;
    private Boolean isDeleted;
    private Time time;
    private Ticket ticket;
}
