package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.constant.EBookingStatus;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.exception.BookingSaveException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.service.IBookingService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Log
@Service
public class BookingService implements IBookingService {
    private final IBookingRepository iBookingRepository;

    public ResponsePayload createBookingResponsePayload(String message, HttpStatus status, Object data) {
        return ResponsePayload.builder()
                .message(message)
                .status(status)
                .data(data)
                .build();
    }

    @Override
    public ResponsePayload findAllByIsDeletedFalse(Pageable pageable) {
        try {
            Iterable<Booking> bookings = iBookingRepository.findAllByIsDeletedFalse(pageable);
            Iterable<BookingResponse> bookingResponses = StreamSupport.stream(bookings.spliterator(), false)
                    .map(booking -> {
                        BookingResponse bookingResponse = new BookingResponse();
                        BeanUtils.copyProperties(booking, bookingResponse);
                        return bookingResponse;
                    })
                    .collect(Collectors.toList());
            return createBookingResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingResponses);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    @Override
    public ResponsePayload findById(UUID id) {
        Optional<Booking> bookingOptional = iBookingRepository.findById(id);
        if (bookingOptional.isPresent() && !bookingOptional.get().getIsDeleted()) {
            Booking booking = bookingOptional.get();
            BookingResponse bookingResponse = new BookingResponse();
            BeanUtils.copyProperties(booking, bookingResponse);
            return createBookingResponsePayload("Booking found!", HttpStatus.OK, booking);
        } else {
            return createBookingResponsePayload("Booking not found!", HttpStatus.NOT_FOUND, null);
        }
    }

    @Override
    public ResponsePayload save(BookingRequest bookingRequest, UUID id) {
        try {
            bookingRequest.setId(id);
            if (bookingRequest.getId() == null) {
                createNewBooking(bookingRequest);
            }
            if (id != null) {
                Optional<Booking> bookingOptional = iBookingRepository.findById(id);
                if (bookingOptional.isPresent()) {
                    updateExistingBooking(bookingRequest, bookingOptional.get());
                    return createBookingResponsePayload("Save booking successfully!", HttpStatus.OK, bookingOptional);
                }
            }
            return createBookingResponsePayload("Save booking failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            throw new BookingSaveException("Failed to save booking", e);
        }
    }

    private void createNewBooking(BookingRequest bookingRequest) {
        bookingRequest.setDate(String.valueOf(Timestamp.from(Instant.now())));
        bookingRequest.setCreatedAt(Timestamp.from(Instant.now()));
        bookingRequest.setStatus(String.valueOf(EBookingStatus.ACTIVE));
        bookingRequest.setIsDeleted(false);
        Booking booking = new Booking();
        BeanUtils.copyProperties(bookingRequest, booking);
        iBookingRepository.save(booking);
    }

    private void updateExistingBooking(BookingRequest bookingRequest, Booking existingBooking) {
        BeanUtils.copyProperties(bookingRequest, existingBooking);
        existingBooking.setUpdatedAt(Timestamp.from(Instant.now()));
        iBookingRepository.save(existingBooking);
    }

    @Override
    public ResponsePayload remove(UUID id) {
        try {
            Optional<Booking> booking = iBookingRepository.findById(id);
            booking.ifPresent(value -> {
                value.setStatus(String.valueOf(EBookingStatus.INACTIVE));
                value.setIsDeleted(true);
            });
            booking.ifPresent(iBookingRepository::save);
            return createBookingResponsePayload("Booking remove successfully!", HttpStatus.OK, null);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Booking remove failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    @Override
    public ResponsePayload searchBookingsByIsDeletedFalseAndCustomerContainingIgnoreCaseOrOrganizerContaining(String category, String keyword, Pageable pageable) {
        try {
            Iterable<Booking> searchedBookings;
            if (category.equals("customers")) {
                searchedBookings = iBookingRepository.searchBookingsByIsDeletedFalseAndCustomerFullNameContaining(keyword, pageable);
            } else if (category.equals("organizers")) {
                searchedBookings = iBookingRepository.searchBookingsByIsDeletedFalseAndOrganizerNameContainingIgnoreCase(keyword, pageable);
            } else return createBookingResponsePayload("Invalid category!", HttpStatus.INTERNAL_SERVER_ERROR, null);
            if (!searchedBookings.iterator().hasNext()) {
                return createBookingResponsePayload("No bookings found!", HttpStatus.NOT_FOUND, null);
            }
            return createBookingResponsePayload("Bookings found!", HttpStatus.OK, searchedBookings);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Searching failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }
}
