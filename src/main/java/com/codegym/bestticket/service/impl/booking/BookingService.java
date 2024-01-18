package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.converter.user.impl.constant.EBookingStatus;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.exception.BookingSaveException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.service.IBookingService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Comparator;
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
            Page<Booking> bookings = iBookingRepository.findAllByIsDeletedFalse(pageable);
            if (bookings.isEmpty()) {
                return createBookingResponsePayload("There is no bookings.", HttpStatus.OK, bookings);
            }
            return getBookingResponsePayload(bookings);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    @Override
    public ResponsePayload findAllByCustomerIdAndIsDeletedFalse(UUID customerId, Pageable pageable) {
        try {
            Page<Booking> bookings = iBookingRepository.findAllByCustomerIdAndIsDeletedFalse(customerId, pageable);
            if (bookings.isEmpty()) {
<<<<<<< HEAD
=======

>>>>>>> 6cc88539fcdfc31c50e12031b8e78da0c0cbe223
                return createBookingResponsePayload("There is no bookings.", HttpStatus.OK, bookings);
            }
            return getBookingResponsePayload(bookings);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }


    @Override
    public ResponsePayload findAllByEventId(UUID eventId, Pageable pageable) {
        try {
            Page<Booking> bookings = iBookingRepository.findAllByEventId(eventId, pageable);
            if (bookings.isEmpty()) {
                return createBookingResponsePayload("There is no bookings.", HttpStatus.OK, bookings);
            }
            return getBookingResponsePayload(bookings);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    private ResponsePayload getBookingResponsePayload(Iterable<Booking> bookings) {
        Iterable<BookingResponse> bookingResponses = StreamSupport.stream(bookings.spliterator(), false)
                .filter(booking -> !booking.getIsDeleted())
                .map(booking -> {
                    BookingResponse bookingResponse = new BookingResponse();
                    bookingResponse.setUserEmail(booking.getCustomer().getUser().getEmail());
                    updateBookingTotalAmount(booking);
                    BeanUtils.copyProperties(booking, bookingResponse);
                    return bookingResponse;
                })
                .sorted(Comparator.comparing(BookingResponse::getCreatedAt).reversed())
                .collect(Collectors.toList());
        return createBookingResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingResponses);
    }

    private void updateBookingTotalAmount(Booking booking) {
        double totalAmount = booking.getBookingDetailList()
                .stream()
                .peek(this::updateBookingDetailAmount)
                .mapToDouble(BookingDetail::getAmount)
                .sum();

        booking.setTotalAmount(totalAmount);
    }

    private void updateBookingDetailAmount(BookingDetail bookingDetail) {
        double amount = bookingDetail.getTickets().stream()
                .mapToDouble(ticket -> {
                    TicketType ticketType = ticket.getTicketType();
                    int quantityAvailable = countTicketTypeQuantity(bookingDetail, ticketType);
                    return ticketType.getPrice() * quantityAvailable;
                })
                .sum();

        bookingDetail.setAmount(amount);
    }

    private int countTicketTypeQuantity(BookingDetail bookingDetail, TicketType ticketType) {
        int count = 0;
        for (Ticket ticket : bookingDetail.getTickets()) {
            if (ticket.getTicketType().equals(ticketType)) {
                count++;
            }
        }
        return count;
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
    public ResponsePayload search(String category, String keyword, Pageable pageable) {
        try {
            Iterable<Booking> searchedBookings;
            if (category.equals("customers")) {
                searchedBookings = iBookingRepository.searchBookingsByIsDeletedFalseAndCustomerFullNameContaining(keyword, pageable);
            } else return createBookingResponsePayload("Invalid category!", HttpStatus.INTERNAL_SERVER_ERROR, null);
            if (!searchedBookings.iterator().hasNext()) {
                return createBookingResponsePayload("No bookings found!", HttpStatus.NOT_FOUND, null);
            }
            Iterable<Booking> sortedBookings = StreamSupport.stream(searchedBookings.spliterator(), false)
                    .sorted(Comparator.comparing(Booking::getCreatedAt).reversed())
                    .collect(Collectors.toList());
            return createBookingResponsePayload("Bookings found!", HttpStatus.OK, sortedBookings);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Searching failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 6cc88539fcdfc31c50e12031b8e78da0c0cbe223
    public ResponsePayload findBookingByTimeId(UUID timeId) {
        Booking booking = iBookingRepository.findBookingByTimeId(timeId);
        if (booking == null) {
            return createBookingResponsePayload("Fail", HttpStatus.NO_CONTENT, null);
        }
        return createBookingResponsePayload("Success", HttpStatus.OK, booking);
    }
<<<<<<< HEAD

=======
>>>>>>> 6cc88539fcdfc31c50e12031b8e78da0c0cbe223
}
