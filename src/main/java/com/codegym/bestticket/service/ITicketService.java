package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface ITicketService {


    ResponsePayload showTicket(Pageable pageable);
    ResponsePayload getTicketById(UUID id);
    ResponsePayload createTicket(TicketResponse ticketResponse);
    ResponsePayload updateTicket(TicketResponse ticketResponse);
    ResponsePayload deleteTicketById(UUID id);

    ResponsePayload findAllTicketFinishedByCustomerId(UUID customerId, Pageable pageable, String status);
    ResponsePayload findAllTicketUpcomingByCustomerId(UUID customerId, Pageable pageable, String status);
    ResponsePayload findAllTicketByCustomerId(UUID customerId, Pageable pageable);

    ResponsePayload findTicketByEventId(UUID eventId,Pageable pageable);
    ResponsePayload findTicketByTimeId(UUID timeId,Pageable pageable);
    ResponsePayload updateStatusSuccess(List<String> selectedSeats,Pageable pageable);
    ResponsePayload updateStatusFail(List<String> selectedSeats,Pageable pageable);
}
