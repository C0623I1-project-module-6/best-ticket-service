package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.converter.user.IUserConverter;
import com.codegym.bestticket.dto.user.UserDto;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.Role;
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
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class AdminService implements IAdminService {
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
    private final IUserConverter userConverter;


    @Override
    public Page<Booking> showBookings(Pageable pageable) {
        return bookingRepository.findAllByIsDeletedFalse(pageable);
    }

    @Override
    public Page<Ticket> showTickets(Pageable pageable) {
        return ticketRepository.findAllByIsDeletedFalse(pageable);
    }

    @Override
    public Page<User> showUsers(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Event> showEvents(Pageable pageable) {
        return null;
    }

    @Override
    public ResponsePayload filterUsers(Pageable pageable, String status, String filterType) {
        try {
            Iterable<User> result;
            switch (filterType) {
                case "username":
                    result = userRepository.searchUserByIsDeletedFalseAndUsernameContaining(pageable, status);
                    break;
                case "role":
                    Role role = new Role(status);
                    result = userRepository.searchUserByIsDeletedFalseAndRolesContaining(pageable, status, String.valueOf(role));
                    break;
                case "customer":
                    result = userRepository.searchUserByIsDeletedFalseAndCustomerFullNameContaining(pageable, status);
                    break;
                case "organizer":
                    result = userRepository.searchUserByIsDeletedFalseAndOrganizerNameContaining(pageable, status);
                    break;
                case "organizerType":
                    result = organizerRepository.searchUserByIsDeletedFalseAndOrganizerTypeContaining(pageable, status);
                    break;
                case "created":
                    result = userRepository.searchUserByIsDeletedFalseAndCreatedContaining(pageable, status);
                    break;
                case "active":
                    result = userRepository.searchUserByIsDeletedFalseAndIsActivedContaining(pageable, status);
                    break;
                default:
                    return findAll(pageable);
            }
            if (result == null | !result.iterator().hasNext()) {
                return ResponsePayload.builder()
                        .message("List user not found!")
                        .status(HttpStatus.NOT_FOUND)
                        .build();
            }
            Iterable<User> sortedUser = StreamSupport.stream(result.spliterator(), false)
                    .sorted(Comparator.comparing(User::getCreated).reversed())
                    .collect(Collectors.toList());
            return ResponsePayload.builder()
                    .message("List users")
                    .status(HttpStatus.OK)
                    .data(sortedUser)
                    .build();
        } catch (EntityNotFoundException e) {
            return ResponsePayload.builder()
                    .message("FAILED")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public ResponsePayload findAll(Pageable pageable) {
        try {
            Page<User> users = userRepository.findAllByIsDeletedFalse(pageable);
            Page<UserDto> userDtos = users.map(user -> {
                UserDto userDto = userConverter.entityToDto(user);
                Customer customer = customerRepository.findByUserIdAndIsDeletedFalse(userDto.getId())
                        .orElse(null);
                userDto.setCustomer(customer);
                Organizer organizer = organizerRepository.findByUserIdAndIsDeletedFalse(userDto.getId())
                        .orElse(null);
                userDto.setOrganizer(organizer);
                return userDto;
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
}
