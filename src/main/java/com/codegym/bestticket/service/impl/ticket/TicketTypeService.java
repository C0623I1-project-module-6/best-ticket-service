package com.codegym.bestticket.service.impl.ticket;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.repository.ITicketTypeRepository;
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
    public List<TicketTypeRequestDTO> getAllTicketType() {
        Iterable<TicketType> ticketTypes = ticketTypeRepository.findAll();

        return StreamSupport.stream(ticketTypes.spliterator(), true)
                .filter(ticketType -> !ticketType.getIsDelete())
                .map(ticketType -> {
                    TicketTypeRequestDTO ticketTypeRequestDTO = TicketTypeRequestDTO.builder().build();
                    BeanUtils.copyProperties(ticketType, ticketTypeRequestDTO);
                    return ticketTypeRequestDTO;
                })
                .toList();

    }

    @Override
    public TicketTypeResponseDTO getTicketTypeById(UUID id) {
        TicketType ticketType = ticketTypeRepository.findById(id).orElse(null);

        TicketTypeResponseDTO ticketTypeResponseDTO = TicketTypeResponseDTO.builder().build();
        assert ticketType != null;
        if (Boolean.FALSE.equals(ticketType.getIsDelete())) {
            BeanUtils.copyProperties(ticketType, ticketTypeResponseDTO);
            return ticketTypeResponseDTO;
        }
        return null;

    }

    @Override
    public TicketTypeRequestDTO createTicketType(TicketTypeRequestDTO ticketTypeRequestDTO) {
        TicketType ticketType = new TicketType();
        BeanUtils.copyProperties(ticketTypeRequestDTO, ticketType);
        ticketType = ticketTypeRepository.save(ticketType);
        TicketTypeRequestDTO resultTicketRequestDTO = TicketTypeRequestDTO.builder().build();
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
    public void updateTicketType(TicketTypeResponseDTO ticketTypeResponseDTO) {
        TicketType ticketType = ticketTypeRepository.findById(ticketTypeResponseDTO.getId()).orElse(null);
        assert ticketType != null;
        BeanUtils.copyProperties(ticketTypeResponseDTO, ticketType);

        ticketTypeRepository.save(ticketType);
    }


}