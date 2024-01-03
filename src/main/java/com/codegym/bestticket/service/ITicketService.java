package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.ticket.TicketRequest;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;

import java.util.UUID;

public interface ITicketService {
    Iterable<TicketRequest> getAllTicket();
    TicketResponse getTicketById(UUID id);
    TicketRequest createTicket(TicketRequest ticketRequest);
    void updateTicket(TicketResponse ticketResponse);
    void deleteTicketById(UUID id);
}
