package com.codegym.bestticket.service;


import com.codegym.bestticket.payload.request.ticket.TicketRequestDTO;
import com.codegym.bestticket.payload.response.ticket.TicketResponseDTO;

import java.util.UUID;

public interface ITicketService {
    Iterable<TicketRequestDTO> getAllTicket();
    TicketResponseDTO getTicketById(UUID id);
    TicketRequestDTO createTicket(TicketRequestDTO ticketRequestDTO);
    void updateTicket(TicketResponseDTO ticketResponseDTO);
    void deleteTicketById(UUID id);
}
