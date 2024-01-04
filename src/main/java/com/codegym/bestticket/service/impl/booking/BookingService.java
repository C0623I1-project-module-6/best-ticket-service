package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.constant.EBookingStatus;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.user.customer.Customer;
import com.codegym.bestticket.entity.user.organizer.Organizer;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.service.IBookingService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Log
@Service
public class BookingService implements IBookingService {
    private final IBookingRepository iBookingRepository;

    @Override
    public Iterable<BookingResponse> findAll() {
        Iterable<Booking> bookings = iBookingRepository.findAll();
        return StreamSupport.stream(bookings.spliterator(), false)
                .filter(booking -> !booking.getIsDeleted())
                .map(booking -> {
                    BookingResponse bookingResponse = new BookingResponse();
                    BeanUtils.copyProperties(booking, bookingResponse);
                    return bookingResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BookingResponse> findById(UUID id) {
        Optional<Booking> bookingOptional = iBookingRepository.findById(id);
        if (bookingOptional.isPresent() && !bookingOptional.get().getIsDeleted()) {
            Booking booking = bookingOptional.get();
            BookingResponse bookingResponse = new BookingResponse();
            BeanUtils.copyProperties(booking, bookingResponse);
            return Optional.of(bookingResponse);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void save(BookingRequest bookingRequest) {
        if (bookingRequest.getId() == null) {
            bookingRequest.setDate(String.valueOf(Timestamp.from(Instant.now())));
            bookingRequest.setCreatedAt(Timestamp.from(Instant.now()));
        }
        bookingRequest.setUpdatedAt(Timestamp.from(Instant.now()));
        Booking booking = new Booking();
        BeanUtils.copyProperties(bookingRequest, booking);
        iBookingRepository.save(booking);
    }

    @Override
    public void remove(UUID id) {
        Optional<Booking> booking = iBookingRepository.findById(id);
        booking.ifPresent(value -> value.setStatus(String.valueOf(EBookingStatus.INACTIVE)));
        booking.ifPresent(value -> value.setIsDeleted(true));
        booking.ifPresent(iBookingRepository::save);
    }

    @Override
    public void delete(UUID id) {
        iBookingRepository.deleteById(id);
    }

    @Override
    public Iterable<BookingResponse> searchAllByCustomer(Customer customer) {
        Iterable<Booking> bookings = iBookingRepository.searchAllByCustomer(customer);
        return StreamSupport.stream(bookings.spliterator(), false)
                .filter(booking -> !booking.getIsDeleted())
                .map(booking -> {
                    BookingResponse bookingResponse = new BookingResponse();
                    BeanUtils.copyProperties(booking, bookingResponse);
                    return bookingResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<BookingResponse> searchAllByOrganizer(Organizer organizer) {
        Iterable<Booking> bookings = iBookingRepository.searchAllByOrganizer(organizer);
        return StreamSupport.stream(bookings.spliterator(), false)
                .filter(booking -> !booking.getIsDeleted())
                .map(booking -> {
                    BookingResponse bookingResponse = new BookingResponse();
                    BeanUtils.copyProperties(booking, bookingResponse);
                    return bookingResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<BookingResponse> searchByInput(String input) {
        Iterable<Booking> bookings = iBookingRepository.findAll();
        List<BookingResponse> bookingResponses = new ArrayList<>();
        for (Booking booking : bookings) {
            if (input.contains(booking.getCustomer().getFullName())
                    || input.contains(booking.getOrganizer().getName())) {
                BookingResponse bookingResponse = new BookingResponse();
                BeanUtils.copyProperties(booking, bookingResponse);
                bookingResponses.add(bookingResponse);
            }
        }
        return bookingResponses;
    }

}
