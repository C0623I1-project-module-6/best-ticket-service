package com.codegym.bestticket.dto.ticket;

import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.location.Location;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.entity.user.Customer;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketDto {
    private UUID id;
    private String ticketCode;
    private String seat;
    private String promotion;
    private Boolean isDeleted;
    private String description;
    private String status;
    private String eventName;
    private Time time;
    private Event event;
    private Customer customer;
    private TicketType ticketType;
}
