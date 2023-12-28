package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;

import java.util.List;


public interface TicketTypeService {

    List<TicketTypeRequestDTO> getAllTicketType();
    TicketTypeResponseDTO getTicketTypeById(TicketTypeResponseDTO ticketTypeResponseDTO);
    TicketTypeRequestDTO createTicketType(TicketTypeRequestDTO ticketTypeRequestDTO);
}
