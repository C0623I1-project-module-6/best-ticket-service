package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.ticket.TicketTypeResponse;
import org.springframework.data.domain.Pageable;

import java.util.UUID;


public interface ITicketTypeService {

    ResponsePayload getAllTicketType(Pageable pageable);

    ResponsePayload getTicketTypeById(UUID id);

    ResponsePayload createTicketType(TicketTypeResponse ticketTypeResponse);

    ResponsePayload updateTicketType(TicketTypeResponse ticketTypeResponse);

    ResponsePayload deleteTicketTypeById(UUID id);

}
