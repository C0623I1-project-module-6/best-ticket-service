package com.codegym.bestticket.dto.admin;

import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.entity.user.Customer;
import lombok.Data;

import java.util.UUID;

@Data
public class TicketAdminDto {
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
