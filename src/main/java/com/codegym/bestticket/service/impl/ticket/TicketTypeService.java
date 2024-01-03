package com.codegym.bestticket.service.impl.ticket;

import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.payload.request.ticket.TicketTypeRequest;
import com.codegym.bestticket.payload.response.ticket.TicketTypeResponse;
import com.codegym.bestticket.repository.ticket.ITicketTypeRepository;
import com.codegym.bestticket.service.ITicketTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Service
public class TicketTypeService implements ITicketTypeService {

    private final ITicketTypeRepository ticketTypeRepository;

    @Override
    public List<TicketTypeRequest> getAllTicketType() {
        Iterable<TicketType> ticketTypes = ticketTypeRepository.findAll();

        return StreamSupport.stream(ticketTypes.spliterator(), true)
                .filter(ticketType -> !ticketType.getIsDeleted())
                .map(ticketType -> {
                    TicketTypeRequest ticketTypeRequest = new TicketTypeRequest();
                    BeanUtils.copyProperties(ticketType, ticketTypeRequest);
                    return ticketTypeRequest;
                })
                .toList();

    }

    @Override
    public TicketTypeResponse getTicketTypeById(UUID id) {
        TicketType ticketType = ticketTypeRepository.findById(id).orElse(null);

        TicketTypeResponse ticketTypeResponse = new TicketTypeResponse();
        assert ticketType != null;
        if (Boolean.FALSE.equals(ticketType.getIsDeleted())) {
            BeanUtils.copyProperties(ticketType, ticketTypeResponse);
            return ticketTypeResponse;
        }
        return null;

    }

    @Override
    public TicketTypeRequest createTicketType(TicketTypeRequest ticketTypeRequest) {
        TicketType ticketType = new TicketType();
        BeanUtils.copyProperties(ticketTypeRequest, ticketType);
        ticketType = ticketTypeRepository.save(ticketType);
        TicketTypeRequest resultTicketRequestDTO = new TicketTypeRequest();
        BeanUtils.copyProperties(ticketType, resultTicketRequestDTO);

        return resultTicketRequestDTO;
    }

    @Override
    public void deleteTicketType(UUID id) {
        TicketType ticketType = ticketTypeRepository.findById(id).orElse(null);
        assert ticketType != null;
        ticketType.setIsDeleted(true);
        ticketTypeRepository.save(ticketType);
    }

    @Override
    public void updateTicketType(TicketTypeResponse ticketTypeResponse) {
        TicketType ticketType = ticketTypeRepository.findById(ticketTypeResponse.getId()).orElse(null);
        assert ticketType != null;
        BeanUtils.copyProperties(ticketTypeResponse, ticketType);

        ticketTypeRepository.save(ticketType);
    }
}
