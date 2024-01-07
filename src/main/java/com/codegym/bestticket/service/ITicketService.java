package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ITicketService {


    ResponsePayload showTicket(Pageable pageable);
    ResponsePayload getTicketById(UUID id);
    ResponsePayload createTicket(TicketResponse ticketResponse);
    ResponsePayload updateTicket(TicketResponse ticketResponse);
    ResponsePayload deleteTicketById(UUID id);
    ResponsePayload searchAllTicket(Pageable pageable,String status,String time);
    Iterable<ResponsePayload> searchTicketByTimeBefore();
    Iterable<ResponsePayload> searchTicketByTimeAfter();

}
