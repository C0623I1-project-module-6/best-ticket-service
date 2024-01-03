package com.codegym.bestticket.service.impl.ticket;

import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.request.ticket.TicketRequest;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.service.ITicketService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class TicketService implements ITicketService {

    private final ITicketRepository ticketRepository;

    @Override
    public Iterable<TicketRequest> showTicket(Pageable pageable) {
        Iterable<Ticket> tickets = ticketRepository.findAll();

        return StreamSupport.stream(tickets.spliterator(), true)
                .filter(ticket -> !ticket.getIsDeleted())
                .map(ticket -> {
                    TicketRequest ticketRequest = new TicketRequest();
                    BeanUtils.copyProperties(ticket, ticketRequest);
                    return ticketRequest;
                })
                .toList();
    }

    @Override
    public TicketResponse getTicketById(UUID id) {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        assert ticket != null;
        if (Boolean.FALSE.equals(ticket.getIsDeleted())) {
            TicketResponse ticketResponse1 = new TicketResponse();

            BeanUtils.copyProperties(ticket, ticketResponse1);
            return ticketResponse1;
        }
        return null;
    }

    @Override
    public TicketRequest createTicket(TicketRequest ticketRequest) {
        Ticket ticket = Ticket.builder().build();

        BeanUtils.copyProperties(ticketRequest, ticket);
        ticket = ticketRepository.save(ticket);

        TicketRequest ticketRequest1 =  new TicketRequest();
        BeanUtils.copyProperties(ticket, ticketRequest1);

        return ticketRequest1;
    }

    @Override
    public void updateTicket(TicketResponse ticketResponse) {
        Ticket ticket = ticketRepository.findById(ticketResponse.getId()).orElse(null);
        assert ticket != null;
        BeanUtils.copyProperties(ticketResponse, ticket);

        ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicketById(UUID id) {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        assert ticket != null;
        ticket.setIsDeleted(false);
        ticketRepository.save(ticket);

    }

    @Override
    public Iterable<Ticket> searchTicketByStatus(String status) {

        return ticketRepository.searchTicketByStatus(status);
    }

    @Override
    public Iterable<Ticket> searchAllByTimeBefore() {
        return ticketRepository.searchTicketByTimeBefore();
    }


//    @Override
//    public Iterable<Ticket> searchAllByTimeBefore() {
//        LocalDate currentDate = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String formattedDate = currentDate.format(formatter);
//        return ticketRepository.searchAllByTimeBefore(formattedDate);
//    }

    @Override
    public Iterable<Ticket> searchTicketByTimeBefore() {
        LocalDate currentDate = LocalDate.now();
        return ticketRepository.searchTicketByTimeBefore(currentDate);
    }
}
