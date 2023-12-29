package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;

import java.util.List;
import java.util.UUID;


public interface TicketTypeService {

    List<TicketTypeRequestDTO> getAllTicketType();
    TicketTypeResponseDTO getTicketTypeById(TicketTypeResponseDTO ticketTypeResponseDTO);
    TicketTypeRequestDTO createTicketType(TicketTypeRequestDTO ticketTypeRequestDTO);
    void deleteTicketType(UUID id);
    TicketTypeResponseDTO updateTicketType(TicketTypeResponseDTO ticketTypeResponseDTO);
}
