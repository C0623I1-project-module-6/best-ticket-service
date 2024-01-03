package com.codegym.bestticket.service.impl.ticket;

import com.codegym.bestticket.payload.request.ticket.TicketRequestDTO;
import com.codegym.bestticket.payload.response.ticket.TicketResponseDTO;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.service.ITicketService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class TicketService implements ITicketService {

    private final ITicketRepository ticketRepository;


    @Override
    public Iterable<TicketRequestDTO> getAllTicket() {
        Iterable<Ticket> tickets = ticketRepository.findAll();

        return StreamSupport.stream(tickets.spliterator(), true)
                .filter(ticket -> !ticket.getIsDeleted())
                .map(ticket -> {
                    TicketRequestDTO ticketRequestDTO = TicketRequestDTO.builder().build();
                    BeanUtils.copyProperties(ticket, ticketRequestDTO);
                    return ticketRequestDTO;
                })
                .toList();
    }

    @Override
    public TicketResponseDTO getTicketById(UUID id) {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        assert ticket != null;
        if (Boolean.FALSE.equals(ticket.getIsDeleted())) {
            TicketResponseDTO ticketResponseDTO1 = TicketResponseDTO.builder().build();

            BeanUtils.copyProperties(ticket, ticketResponseDTO1);
            return ticketResponseDTO1;
        }
        return null;
    }

    @Override
    public TicketRequestDTO createTicket(TicketRequestDTO ticketRequestDTO) {
        Ticket ticket = Ticket.builder().build();

        BeanUtils.copyProperties(ticketRequestDTO, ticket);
        ticket = ticketRepository.save(ticket);

        TicketRequestDTO ticketRequestDTO1 = TicketRequestDTO.builder().build();
        BeanUtils.copyProperties(ticket, ticketRequestDTO1);

        return ticketRequestDTO1;
    }

    @Override
    public void updateTicket(TicketResponseDTO ticketResponseDTO) {
        Ticket ticket = ticketRepository.findById(ticketResponseDTO.getId()).orElse(null);
        assert ticket != null;
        BeanUtils.copyProperties(ticketResponseDTO, ticket);

        ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicketById(UUID id) {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        assert ticket != null;
        ticket.setIsDeleted(false);
        ticketRepository.save(ticket);

    }
}
