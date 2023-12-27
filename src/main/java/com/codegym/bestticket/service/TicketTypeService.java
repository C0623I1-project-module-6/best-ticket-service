package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;

import java.util.List;

public interface TicketTypeService {

    List<TicketTypeRequestDTO> getAllTicketType();
}
