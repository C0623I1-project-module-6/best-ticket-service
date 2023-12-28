package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.repository.ITicketTypeRepository;
import com.codegym.bestticket.service.TicketTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Service
public class TicketTypeServiceImpl implements TicketTypeService {


    private final ITicketTypeRepository ticketTypeRepository;


//    public TicketTypeServiceImpl(ITicketTypeRepository ticketTypeRepository) {
//        this.ticketTypeRepository = ticketTypeRepository;
//    }

    @Override
    public List<TicketTypeRequestDTO> getAllTicketType() {
        Iterable<TicketType> tickets = ticketTypeRepository.findAll();

        return StreamSupport.stream(tickets.spliterator(), true)
                .map(ticketType -> {
                    TicketTypeRequestDTO ticketTypeRequestDTO = new TicketTypeRequestDTO();
                    BeanUtils.copyProperties(ticketType, ticketTypeRequestDTO);
                    return ticketTypeRequestDTO;
                })
                .collect(Collectors.toList());

    }
}