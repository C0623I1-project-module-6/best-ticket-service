package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.ticket.TicketTypeRequest;
import com.codegym.bestticket.payload.response.ticket.TicketTypeResponse;

import java.util.UUID;


public interface ITicketTypeService {

    Iterable<TicketTypeRequest> getAllTicketType();
    TicketTypeResponse getTicketTypeById(UUID id);
    TicketTypeRequest createTicketType(TicketTypeRequest ticketTypeRequest);
    void deleteTicketType(UUID id);
    void updateTicketType(TicketTypeResponse ticketTypeResponse);
}
