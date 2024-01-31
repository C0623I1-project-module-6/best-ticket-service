package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.converter.user.IUserConverter;
import com.codegym.bestticket.converter.user.impl.constant.ETicketMessage;
import com.codegym.bestticket.dto.admin.BookingAdminDto;
import com.codegym.bestticket.dto.admin.UserAdminDto;
import com.codegym.bestticket.dto.ticket.TicketDto;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.repository.event.IEventRepository;
import com.codegym.bestticket.repository.event.IEventTypeRepository;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.repository.ticket.ITicketTypeRepository;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IOrganizerTypeRepository;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IAdminService;
import com.codegym.bestticket.service.IBookingDetailService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class AdminService implements IAdminService {
    private final IUserConverter userConverter;
    private final IUserRepository userRepository;
    private final IRoleRepository roleRepository;
    private final ICustomerRepository customerRepository;
    private final IOrganizerRepository organizerRepository;
    private final IOrganizerTypeRepository organizerTypeRepository;
    private final IBookingRepository bookingRepository;
    private final IBookingDetailService bookingDetailService;
    private final IEventRepository eventRepository;
    private final IEventTypeRepository eventTypeRepository;
    private final ITicketRepository ticketRepository;
    private final ITicketTypeRepository ticketTypeRepository;


    @Override
    public ResponsePayload showBookings(Pageable pageable) {
        try {
            Page<Booking> bookings = bookingRepository.findAllByIsDeletedFalse(pageable);
            Page<BookingAdminDto> bookingResponses = bookings.map(booking -> {
                BookingAdminDto adminDto = new BookingAdminDto();
                BeanUtils.copyProperties(booking, adminDto);
                adminDto.setCustomerName(booking.getCustomer().getFullName());
                adminDto.setCustomerId(booking.getCustomer().getId());
                return adminDto;
            });
            return ResponsePayload.builder()
                    .data(bookingResponses)
                    .message("Booking page")
                    .status(HttpStatus.OK)
                    .build();
        } catch (Exception e) {
            return ResponsePayload.builder()
                    .status(HttpStatus.NO_CONTENT)
                    .message(e.getMessage())
                    .build();
        }
    }

    public ResponsePayload createResponsePayload(String message, HttpStatus status, Object data) {
        return ResponsePayload.builder()
                .message(message)
                .status(status)
                .data(data)
                .build();
    }

    @Override
    public ResponsePayload showTickets(Pageable pageable) {
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
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketDtos);
    }

    @Override
    public ResponsePayload showUsers(Pageable pageable) {
        try {
            Page<User> users = userRepository.findAllByIsDeletedFalse(pageable);
            Page<UserAdminDto> userDtos = users.map(user -> {
                UserAdminDto adminDto = new UserAdminDto();
                BeanUtils.copyProperties(user, adminDto);
                Optional<Customer> customer = customerRepository.findByUserIdAndIsDeletedFalse(user.getId());
                Optional<Organizer> organizer = organizerRepository.findByUserIdAndIsDeletedFalse(user.getId());
                if (customer.isPresent()) {
                    adminDto.setCustomerId(customer.get().getId());
                    adminDto.setCustomerName(customer.get().getFullName());
                }
                organizer.ifPresent(value -> adminDto.setOrganizerId(value.getId()));
                return adminDto;
            });
            return ResponsePayload.builder()
                    .message("User list!!!")
                    .status(HttpStatus.OK)
                    .data(userDtos)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("User list not found")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload showEvents(Pageable pageable) {
        return null;
    }
}
