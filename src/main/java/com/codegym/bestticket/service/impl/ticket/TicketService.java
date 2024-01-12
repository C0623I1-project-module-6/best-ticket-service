package com.codegym.bestticket.service.impl.ticket;

import com.codegym.bestticket.converter.user.impl.constant.ETicketMessage;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.ticket.TicketRequest;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.service.ITicketService;
import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class TicketService implements ITicketService {

    private final ITicketRepository ticketRepository;

    public ResponsePayload createResponsePayload(String message, HttpStatus status, Object data) {
        return ResponsePayload
                .builder()
                .status(status)
                .message(message)
                .data(data)
                .build();
    }

    @Override
    public ResponsePayload showTicket(Pageable pageable) {
            Iterable<Ticket> tickets = ticketRepository.findAll(pageable);
        List<TicketRequest> ticketRequests = StreamSupport.stream(tickets.spliterator(), true)
                .map(ticket -> {
                    TicketRequest ticketRequest = new TicketRequest();
                    BeanUtils.copyProperties(ticket, ticketRequest);
                    return ticketRequest;
                })
                .toList();
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.CREATED, ticketRequests);
    }

    @Override
    public ResponsePayload getTicketById(UUID id) {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        assert ticket != null;
        if (Boolean.FALSE.equals(ticket.getIsDeleted())) {
            TicketResponse ticketResponse = new TicketResponse();

            BeanUtils.copyProperties(ticket, ticketResponse);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketResponse);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.BAD_REQUEST, null);
    }

    @Override
    public ResponsePayload createTicket(TicketResponse ticketResponse) {
        Ticket ticket = Ticket.builder().build();
        if (ticketResponse != null) {
            BeanUtils.copyProperties(ticketResponse, ticket);
            ticket = ticketRepository.save(ticket);

            TicketRequest ticketRequest = new TicketRequest();
            BeanUtils.copyProperties(ticket, ticketRequest);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.CREATED, ticketRequest);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.NO_CONTENT, null);
    }

    @Override
    public ResponsePayload updateTicket(TicketResponse ticketResponse) {
        Ticket ticket = ticketRepository.findById(ticketResponse.getId()).orElse(null);
        if (ticket != null) {
            BeanUtils.copyProperties(ticketResponse, ticket);

            Ticket ticket1 = ticketRepository.save(ticket);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticket1);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.BAD_REQUEST, null);
    }

    @Override
    public ResponsePayload deleteTicketById(UUID id) {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        if (ticket != null) {
            ticket.setIsDeleted(false);
            Ticket ticketSave = ticketRepository.save(ticket);
            TicketRequest ticketRequest = new TicketRequest();
            BeanUtils.copyProperties(ticketSave, ticketRequest);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketRequest);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.BAD_REQUEST, null);

    }

    @Override
    public ResponsePayload showAllTicketUpcoming(Pageable pageable, String status) {
        Iterable<Ticket> tickets = ticketRepository.findAllByIsDeletedFalse(pageable);

        LocalDateTime currentDate = LocalDateTime.now();
        List<TicketRequest> ticketRequests = StreamSupport.stream(tickets.spliterator(), true)
                .flatMap(ticket -> {
                    if (StringUtils.isEmpty(status)) {
                        // Nếu status là rỗng, không áp dụng filter đầu tiên
                        return Stream.of(ticket);
                    } else {
                        // Nếu status không rỗng, áp dụng filter đầu tiên
                        return Stream.of(ticket).filter(t -> t.getStatus().equals(status));
                    }
                })
                .filter(ticket -> ticket.getEventTime().getTime().getTime().isAfter(currentDate))
                .map(ticket -> {
                    TicketRequest ticketRequest = new TicketRequest();
                    BeanUtils.copyProperties(ticket, ticketRequest);
                    return ticketRequest;
                })
                .toList();

        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketRequests);
    }

    @Override
    public ResponsePayload showAllTicketFinished(Pageable pageable, String status) {
        Iterable<Ticket> tickets = ticketRepository.findAllByIsDeletedFalse(pageable);
        LocalDateTime currentDate = LocalDateTime.now();

        List<TicketRequest> ticketRequests = StreamSupport.stream(tickets.spliterator(), true)

                .flatMap(ticket -> {
                    if (StringUtils.isEmpty(status)) {
                        return Stream.of(ticket);
                    } else {
                        return Stream.of(ticket).filter(t -> t.getStatus().equals(status));
                    }
                })
                .filter(ticket -> ticket.getEventTime().getTime().getTime().isBefore(currentDate))
                .map(ticket -> {
                    TicketRequest ticketRequest = new TicketRequest();
                    BeanUtils.copyProperties(ticket, ticketRequest);
                    return ticketRequest;
                })
                .toList();

        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketRequests);
    }
}
