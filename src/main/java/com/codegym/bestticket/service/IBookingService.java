package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import org.springframework.data.domain.Pageable;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;

import java.util.Optional;
import java.util.UUID;

public interface IBookingService {
//    Iterable<BookingResponse> findAll();
    Optional<BookingResponse> findById(UUID id);
//    void save(BookingRequest bookingRequest);
    void save(BookingRequest bookingRequest, UUID input);
    void remove(UUID id);
    void delete(UUID id);
    Iterable<BookingResponse> searchAllByCustomer(Customer customer);
    Iterable<BookingResponse> searchAllByOrganizer(Organizer organizer);
    Iterable<BookingResponse> searchByInput(String input);

    //Developing functions
    ResponsePayload findAll(Pageable pageable);
}
