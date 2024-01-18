package com.codegym.bestticket.dto.ticket;

import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.location.Location;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.user.Customer;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
public class TicketDto {
    private UUID id;
    private Set<Ticket> slticket;
    private String eventName;
    private String ticketCode;
    private String status;
    private String seat;
    private Time time;
    private Event event;
    private Location location;
    private Integer ticketAmount;
    private Customer customer;

}
