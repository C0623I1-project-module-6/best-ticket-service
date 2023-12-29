package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.repository.ITicketTypeRepository;
import com.codegym.bestticket.service.TicketTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Service
public class TicketTypeServiceImpl implements TicketTypeService {


    private final ITicketTypeRepository ticketTypeRepository;



    @Override
    public List<TicketTypeRequestDTO> getAllTicketType() {
        Iterable<TicketType> tickets = ticketTypeRepository.findAll();

        return StreamSupport.stream(tickets.spliterator(), true)
                .map(ticketType -> {
                    TicketTypeRequestDTO ticketTypeRequestDTO =  TicketTypeRequestDTO.builder().build();
                    BeanUtils.copyProperties(ticketType, ticketTypeRequestDTO);
                    return ticketTypeRequestDTO;
                })
                .collect(Collectors.toList());

    }




    @Override
    public TicketTypeResponseDTO getTicketTypeById(TicketTypeResponseDTO ticketTypeResponseDTO) {
        TicketType ticketType = ticketTypeRepository.findById(ticketTypeResponseDTO.getId()).orElse(null);
        TicketTypeResponseDTO ticketTypeResponseDTO1 =  TicketTypeResponseDTO.builder().build();
        assert ticketType != null;
        BeanUtils.copyProperties(ticketType,ticketTypeResponseDTO);
        return ticketTypeResponseDTO1;
    }

    @Override
    public TicketTypeRequestDTO createTicketType(TicketTypeRequestDTO ticketTypeRequestDTO) {
        TicketType ticketType = new TicketType();
        BeanUtils.copyProperties(ticketTypeRequestDTO,ticketType);
        ticketType = ticketTypeRepository.save(ticketType);
        TicketTypeRequestDTO resultTicketRequestDTO =  TicketTypeRequestDTO.builder().build();
        BeanUtils.copyProperties(ticketType,resultTicketRequestDTO);

        return resultTicketRequestDTO;
    }

    @Override
    public void deleteTicketType(UUID id) {
        if (id == null){
            return;
        }
        ticketTypeRepository.deleteById(id);
    }

    @Override
    public TicketTypeResponseDTO updateTicketType(TicketTypeResponseDTO ticketTypeResponseDTO) {
        TicketType ticketType = TicketType.builder().build();
        BeanUtils.copyProperties(ticketTypeResponseDTO,ticketType);

        ticketTypeRepository.save(ticketType);

        TicketTypeResponseDTO ticketTypeResponseDTO1 = TicketTypeResponseDTO.builder().build();
        BeanUtils.copyProperties(ticketType,ticketTypeResponseDTO1);
        return ticketTypeResponseDTO1;
    }


}