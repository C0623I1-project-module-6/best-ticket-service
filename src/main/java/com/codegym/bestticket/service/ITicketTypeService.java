package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.payload.response.ticket_type.TicketTypeResponseDTO;

import java.util.UUID;


public interface ITicketTypeService {

    Iterable<TicketTypeRequestDTO> getAllTicketType();
    TicketTypeResponseDTO getTicketTypeById(UUID id);
    TicketTypeRequestDTO createTicketType(TicketTypeRequestDTO ticketTypeRequestDTO);
    void deleteTicketType(UUID id);
    void updateTicketType(TicketTypeResponseDTO ticketTypeResponseDTO);
}
