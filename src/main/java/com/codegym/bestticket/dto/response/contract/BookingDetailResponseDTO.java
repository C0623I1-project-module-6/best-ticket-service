package com.codegym.bestticket.dto.response.contract;

import com.codegym.bestticket.entity.contract.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class BookingDetailResponseDTO {
    private UUID id;
    private Booking booking;
    private List<Ticket> tickets;
    private Double amount;
    private Boolean isDeleted;
}
