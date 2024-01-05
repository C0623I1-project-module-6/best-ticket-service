package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.entity.booking.Booking;
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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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


    @Override
    public Page<Booking> showBookings(Pageable pageable) {
        return bookingRepository.findAllByIsDeletedFalse(pageable);
    }
}
