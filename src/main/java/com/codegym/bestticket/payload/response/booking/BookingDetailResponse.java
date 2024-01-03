package com.codegym.bestticket.payload.response.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class BookingDetailResponse {
    private UUID id;
    private Booking booking;
    private List<Ticket> tickets;
    private Double amount;
    private Boolean isDeleted;
}
