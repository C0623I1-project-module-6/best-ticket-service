package com.codegym.bestticket.service.impl.ticket;

import com.codegym.bestticket.converter.user.impl.constant.ETicketMessage;
import com.codegym.bestticket.dto.ticket.TicketDto;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.ticket.TicketRequest;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.service.ITicketService;
import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
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
        Page<Ticket> tickets = ticketRepository.findAllByIsDeletedFalse(pageable);
        Iterable<TicketDto> ticketDtos = StreamSupport.stream(tickets.spliterator(), true)
                .map(ticket -> {
                    TicketDto ticketDto = TicketDto
                            .builder()
                            .eventName(ticket.getEventTime().getEvent().getName())
                            .customer(ticket.getBookingDetail().getBooking().getCustomer())
                            .event(ticket.getEventTime().getEvent())
                            .time(ticket.getEventTime().getTime())
                            .build();
                    BeanUtils.copyProperties(ticket, ticketDto);
                    return ticketDto;
                })
                .toList();
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.CREATED, ticketDtos);
    }

    @Override
    public ResponsePayload getTicketById(UUID id) {
        Ticket ticket = ticketRepository.findByIdAndIsDeletedFalse(id);
        assert ticket != null;
        TicketDto ticketDto = TicketDto
                .builder()
                .eventName(ticket.getEventTime().getEvent().getName())
                .customer(ticket.getBookingDetail().getBooking().getCustomer())
                .event(ticket.getEventTime().getEvent())
                .time(ticket.getEventTime().getTime())
                .build();

        BeanUtils.copyProperties(ticket, ticketDto);
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketDto);

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
            ticket.setIsDeleted(true);
            Ticket ticketSave = ticketRepository.save(ticket);
            TicketRequest ticketRequest = new TicketRequest();
            BeanUtils.copyProperties(ticketSave, ticketRequest);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketRequest);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.BAD_REQUEST, null);

    }

    @Override
    public ResponsePayload findAllTicketFinishedByCustomerId(UUID customerId, Pageable pageable, String status) {
        Page<Ticket> tickets = ticketRepository.findAllTicketFinishedByCustomerId(customerId, pageable);
        LocalDateTime currentDate = LocalDateTime.now();
        Iterable<TicketDto> ticketDto = StreamSupport.stream(tickets.spliterator(), true)

                .flatMap(ticket -> {
                    if (StringUtils.isEmpty(status)) {
                        return Stream.of(ticket);
                    } else {
                        return Stream.of(ticket).filter(t -> t.getStatus().equals(status));
                    }
                })
                .filter(ticket -> ticket.getEventTime().getTime().getTime().isBefore(currentDate))
                .map(ticket -> {
                    TicketDto ticketDto1 = TicketDto
                            .builder()
                            .eventName(ticket.getEventTime().getEvent().getName())
                            .event(ticket.getEventTime().getEvent())
                            .customer(ticket.getBookingDetail().getBooking().getCustomer())
                            .build();
                    BeanUtils.copyProperties(ticket, ticketDto1);
                    return ticketDto1;
                })
                .toList();

        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketDto);
    }

    @Override
    public ResponsePayload findAllTicketUpcomingByCustomerId(UUID customerId, Pageable pageable, String status) {
        Page<Ticket> tickets = ticketRepository.findAllTicketUpcomingByCustomerId(customerId, pageable);

        LocalDateTime currentDate = LocalDateTime.now();
        Iterable<TicketDto> ticketDto = StreamSupport.stream(tickets.spliterator(), true)
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
                    TicketDto ticketDto1 = TicketDto
                            .builder()
                            .eventName(ticket.getEventTime().getEvent().getName())
                            .customer(ticket.getBookingDetail().getBooking().getCustomer())
                            .build();
                    BeanUtils.copyProperties(ticket, ticketDto1);
                    return ticketDto1;
                })
                .toList();
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketDto);
    }

    @Override
    public ResponsePayload findAllTicketByCustomerId(UUID customerId, Pageable pageable) {
        Page<Ticket> tickets = ticketRepository.findAllTicketByCustomerId(customerId,pageable);
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS),HttpStatus.OK,tickets);
    }

    @Override
    public ResponsePayload findTicketByEventId(UUID eventId, Pageable pageable) {
        Page<Ticket> tickets = ticketRepository.findTicketByEventId(eventId, pageable);
        return getTicketResponsePayload(tickets);
    }

    @Override
    public ResponsePayload findTicketByTimeId(UUID timeId, Pageable pageable) {
        Page<Ticket> tickets = ticketRepository.findTicketByTimeId(timeId, pageable);
        return getTicketResponsePayload(tickets);
    }

    private ResponsePayload getTicketResponsePayload(Page<Ticket> tickets) {
        Iterable<TicketDto> ticketDtos = StreamSupport.stream(tickets.spliterator(), true)
                .map(ticket -> {
                    TicketDto ticketDto1 = TicketDto
                            .builder()
                            .seat(ticket.getSeat())
                            .ticketCode(ticket.getTicketCode())
                            .isDeleted(ticket.getIsDeleted())
                            .description(ticket.getDescription())
                            .status(ticket.getStatus())
                            .ticketType(ticket.getTicketType())
                            .bookingDetailId(ticket.getBookingDetail().getId())
                            .time(ticket.getEventTime().getTime())
                            .event(ticket.getEventTime().getEvent())
                            .build();
                    BeanUtils.copyProperties(ticket, ticketDto1);
                    return ticketDto1;
                })
                .toList();
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketDtos);
    }

    @Override
    public ResponsePayload updateStatusSuccess(List<String> selectedSeats, Pageable pageable) {
        Page<Ticket> tickets = ticketRepository.findAllByIsDeletedFalse(pageable);
        tickets.forEach(ticket -> selectedSeats.forEach(seat -> {
            // So sánh ticket với seat
            if (ticket.getSeat().equals(seat)) {
                ticket.setStatus("Success");
                ticketRepository.save(ticket);
            }
        }));

        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK,tickets);
    }

    @Override
    public ResponsePayload updateStatusFail(List<String> selectedSeats, Pageable pageable) {
        Page<Ticket> tickets = ticketRepository.findAllByIsDeletedFalse(pageable);
        tickets.forEach(ticket -> selectedSeats.forEach(seat -> {
            // So sánh ticket với seat
            if (ticket.getSeat().equals(seat)) {
                ticket.setStatus("Pending");
                ticketRepository.save(ticket);
            }
        }));

        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK,tickets);

    }
}



