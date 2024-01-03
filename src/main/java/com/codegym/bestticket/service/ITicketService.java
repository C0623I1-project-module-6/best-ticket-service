package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.request.ticket.TicketRequest;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ITicketService {

    Iterable<TicketRequest> showTicket(Pageable pageable);
    TicketResponse getTicketById(UUID id);
    TicketRequest createTicket(TicketRequest ticketRequest);
    void updateTicket(TicketResponse ticketResponse);
    void deleteTicketById(UUID id);

    Iterable<Ticket> searchTicketByStatus(String status);
    Iterable<Ticket> searchAllByTimeBefore();
    Iterable<Ticket> searchTicketByTimeBefore();



}
