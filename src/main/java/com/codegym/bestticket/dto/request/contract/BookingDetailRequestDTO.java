package com.codegym.bestticket.dto.request.contract;

import com.codegym.bestticket.entity.contract.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class BookingDetailRequestDTO {
    private UUID id;
    private Booking booking;
    private List<Ticket> tickets;
    private Boolean isDeleted;
}
