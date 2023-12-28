package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;

import java.util.List;
import java.util.ListIterator;


public interface TicketTypeService {

    List<TicketTypeRequestDTO> getAllTicketType();
}
