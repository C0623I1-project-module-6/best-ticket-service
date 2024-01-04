package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingDetailRequest;
import com.codegym.bestticket.payload.response.booking.BookingDetailResponse;
import com.codegym.bestticket.repository.booking.IBookingDetailRepository;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.service.IBookingDetailService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;

@AllArgsConstructor
@Log
@Service
public class BookingDetailService implements IBookingDetailService {
    private final IBookingDetailRepository iBookingDetailRepository;
    private final IBookingRepository iBookingRepository;
    private final ITicketRepository iTicketRepository;

    public ResponsePayload createBookingDetailResponsePayload(String message, HttpStatus status, Object data) {
        return ResponsePayload.builder()
                .message(message)
                .status(status)
                .data(data)
                .build();
    }

    @Override
    public ResponsePayload findAllByBookingIdAndIsDeletedFalse(UUID bookingId, Pageable pageable) {
        try {
            Page<BookingDetail> bookingDetailPage = iBookingDetailRepository.findAllByBookingIdAndIsDeletedFalse(bookingId, pageable);
            Page<BookingDetailResponse> bookingDetailResponsePage = bookingDetailPage.map(bookingDetail -> {
                BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
                BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
                return bookingDetailResponse;
            });
            return createBookingDetailResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingDetailResponsePage);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    @Override
    public ResponsePayload findByBookingIdAndId(UUID bookingId, UUID id) {
        try {
            Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findByBookingIdAndId(bookingId, id);
            return createBookingDetailResponsePayload("Booking detail found!", HttpStatus.OK, bookingDetail);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Booking detail not found!", HttpStatus.NOT_FOUND, null);
        }
    }

    @Override
    public ResponsePayload save(UUID id, BookingDetailRequest bookingDetailRequest) {
        try {
            Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findById(id);
            //Add calculate functions here
            if () {

            } else if () {

            } else if () {

            } else {

            }
            return createBookingDetailResponsePayload("Booking detail save/update successfully!", HttpStatus.OK, bookingDetailPage);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Booking detail save/update failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    @Override
    public ResponsePayload remove(UUID id) {
        try {
            Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findById(id);
            if (bookingDetail.isPresent() && bookingDetail.get().getIsDeleted()) {
                return createBookingDetailResponsePayload("Booking detail not found!", HttpStatus.NOT_FOUND, null);
            }
            bookingDetail.ifPresent(value -> {
                value.setIsDeleted(true);
                double totalAmount = value.getBooking().getTotalAmount() - value.getTickets().stream()
                        .mapToDouble(ticket -> ticket.getQuantity() * ticket.getPrice())
                        .sum();
                value.getBooking().setTotalAmount(totalAmount);
                iBookingDetailRepository.save(value);
            });
            return createBookingDetailResponsePayload("Booking detail remove successfully", HttpStatus.OK, null);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Booking detail remove failed", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }
}
