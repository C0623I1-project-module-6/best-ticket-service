package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.converter.user.impl.constant.EBookingStatus;
import com.codegym.bestticket.dto.booking.BookingDto;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.exception.BookingSaveException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.payload.response.booking.BookingDetailResponse;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import com.codegym.bestticket.payload.response.ticket.TicketInBookingDetailResponse;
import com.codegym.bestticket.repository.booking.IBookingDetailRepository;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.service.IBookingService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;

import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;

@AllArgsConstructor
@Log
@Service
public class BookingService implements IBookingService {
    private final IBookingRepository iBookingRepository;
    private final IBookingDetailRepository iBookingDetailRepository;

    public ResponsePayload createBookingResponsePayload(String message, HttpStatus status, Object data) {
        return ResponsePayload.builder().message(message).status(status).data(data).build();
    }

    @Override
    public ResponsePayload findAllByIsDeletedFalse(Pageable pageable) {
        try {
            Page<Booking> bookings = iBookingRepository.findAllByIsDeletedFalse(pageable);
            if (bookings.isEmpty()) {
                return createBookingResponsePayload("There is no bookings.", HttpStatus.NO_CONTENT, bookings);
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
                return createBookingResponsePayload("There is no bookings.", HttpStatus.NO_CONTENT, bookings);
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
                return createBookingResponsePayload("There is no bookings.", HttpStatus.NO_CONTENT, bookings);
            }
            return getBookingResponsePayload(bookings);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    private ResponsePayload getBookingResponsePayload(@NotNull Page<Booking> bookings) {
        Page<BookingResponse> bookingResponses = bookings.map(this::createNewBookingResponse);
        return createBookingResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingResponses);
    }

    private BookingResponse createNewBookingResponse(Booking booking) {
        updateBookingTotalAmount(booking);
        iBookingRepository.save(booking);
        BookingResponse bookingResponse = new BookingResponse();
        bookingResponse.setUserEmail(booking.getCustomer().getUser().getEmail());
        BeanUtils.copyProperties(booking, bookingResponse);
        List<BookingDetail> bookingDetailList = booking.getBookingDetailList();
        bookingResponse.setBookingDetailResponseList(convertBookingDetailsToBookingDetailResponses(bookingDetailList));
        return bookingResponse;
    }

    private void updateBookingTotalAmount(Booking booking) {
        double totalAmount = 0.0;
        if (!booking.getBookingDetailList().isEmpty()) {
            double sum = 0.0;
            for (BookingDetail bookingDetail : booking.getBookingDetailList()) {
                updateBookingDetailAmount(bookingDetail);
                double amount = bookingDetail.getAmount();
                sum += amount;
            }
            totalAmount = sum;
        }
        booking.setTotalAmount(totalAmount);
        iBookingRepository.save(booking);
    }

    private void updateBookingDetailAmount(BookingDetail bookingDetail) {
        double amount = 0.0;
        bookingDetail.setAmount(amount);
        for (Ticket ticket1 : bookingDetail.getTickets()) {
            TicketType ticketType = ticket1.getTicketType();
            int quantityAvailable = countTicketTypeQuantity(ticket1, ticketType);
            double totalPrice = ticketType.getPrice() * quantityAvailable;
            amount += totalPrice;
            bookingDetail.setAmount(amount);
        }
        iBookingDetailRepository.save(bookingDetail);
    }

    private int countTicketTypeQuantity(Ticket ticket, TicketType ticketType) {
        int count = 0;
        if (ticket.getTicketType().equals(ticketType)) {
            count++;
        }
        return count;
    }

    private List<BookingDetailResponse> convertBookingDetailsToBookingDetailResponses(List<BookingDetail> bookingDetails) {
        return bookingDetails.stream().map(bookingDetail -> {
            BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
            BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
            bookingDetailResponse.setBookingId(bookingDetail.getBooking().getId());
            List<TicketInBookingDetailResponse> ticketInBookingDetailResponses = convertTicketsToTicketInBookingDetail(bookingDetail);
            bookingDetailResponse.setTicketInBookingDetailResponses(ticketInBookingDetailResponses);
            return bookingDetailResponse;
        }).toList();
    }

    private List<TicketInBookingDetailResponse> convertTicketsToTicketInBookingDetail(BookingDetail bookingDetail) {
        return BookingDetailService.getTicketInBookingDetailResponses(bookingDetail);
    }

    @Override
    public ResponsePayload findById(UUID id) {
        Optional<Booking> bookingOptional = iBookingRepository.findById(id);
        if (bookingOptional.isPresent() && !bookingOptional.get().getIsDeleted()) {
            Booking booking = bookingOptional.get();
            BookingResponse bookingResponse = createNewBookingResponse(booking);
            return createBookingResponsePayload("Booking found!", HttpStatus.OK, bookingResponse);
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
    public ResponsePayload search(UUID eventId, String keyword, Pageable pageable) {
        try {
            Page<Booking> searchedBookings = iBookingRepository.searchBookingsByEventIdAndCustomerFullNameContainingOrCustomerPhoneNumberContainingOrCustomerUserEmailContaining(eventId, keyword, pageable);
            if (!searchedBookings.iterator().hasNext()) {
                return createBookingResponsePayload("No bookings found!", HttpStatus.NO_CONTENT, searchedBookings);
            }
            return getBookingResponsePayload(searchedBookings);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingResponsePayload("Searching failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    public ResponsePayload findBookingByTimeId(UUID timeId) {
        Booking booking = iBookingRepository.findBookingByTimeId(timeId);
        if (booking == null) {
            return createBookingResponsePayload("Fail", HttpStatus.NO_CONTENT, null);
        }
        return createBookingResponsePayload("Success", HttpStatus.OK, booking);
    }


    @Override
    public ResponsePayload createBooking(BookingDto bookingDto) {
        Booking booking = new Booking();
        if (bookingDto != null) {
            booking.setCreatedAt(Timestamp.from(Instant.now()));
            booking.setTotalAmount(bookingDto.getSeatTickets().getTotalPrice());
            booking.setStatus("ACTIVE");
            booking.setIsDeleted(false);
            booking.setCustomer(bookingDto.getUserEdit().getCustomer());
            iBookingRepository.save(booking);

        }
        return createBookingResponsePayload("Success", HttpStatus.CREATED, booking);
    }
}
