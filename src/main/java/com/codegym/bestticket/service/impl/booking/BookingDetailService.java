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
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
            updateBookingTotalAmount(bookingId);
            Iterable<BookingDetail> bookingDetailList = iBookingDetailRepository.findAllByBookingIdAndIsDeletedFalse(bookingId, pageable);
            Iterable<BookingDetailResponse> bookingDetailResponseList = StreamSupport.stream(bookingDetailList.spliterator(), false)
                    .map(bookingDetail -> {
                        BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
                        BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
                        return bookingDetailResponse;
                    })
                    .collect(Collectors.toList());
            return createBookingDetailResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingDetailResponseList);
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
    public ResponsePayload save(UUID bookingId, UUID id, BookingDetailRequest bookingDetailRequest) {
        try {
            Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findByBookingIdAndId(bookingId, id);
            if (bookingDetail.isEmpty()) {
                BookingDetail newBookingDetail = new BookingDetail();
                newBookingDetail.setIsDeleted(false);
                BeanUtils.copyProperties(bookingDetailRequest, newBookingDetail);
                iBookingDetailRepository.save(newBookingDetail);
                updateBookingTotalAmount(bookingId);
                return createBookingDetailResponsePayload("Booking detail added successfully!", HttpStatus.OK, newBookingDetail);
            } else {
                BookingDetail existingBookingDetail = bookingDetail.get();
                BeanUtils.copyProperties(bookingDetailRequest, existingBookingDetail);
                existingBookingDetail.setTickets(bookingDetailRequest.getTickets());
                iTicketRepository.saveAll(existingBookingDetail.getTickets());
                iBookingDetailRepository.save(existingBookingDetail);
                updateBookingTotalAmount(bookingId);
                return createBookingDetailResponsePayload("Booking detail updated successfully!", HttpStatus.OK, existingBookingDetail);
            }
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Save/update Booking detail failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    @Override
    public ResponsePayload remove(UUID id) {
        try {
            Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findById(id);
            UUID bookingId;
            if (bookingDetail.isPresent() && !bookingDetail.get().getIsDeleted()) {
                bookingDetail.get().setIsDeleted(true);
                iBookingDetailRepository.save(bookingDetail.get());
                bookingId = bookingDetail.get().getBooking().getId();
                updateBookingTotalAmount(bookingId);
                return createBookingDetailResponsePayload("Remove Booking detail successfully!", HttpStatus.OK, null);
            }
            return createBookingDetailResponsePayload("Booking not found!", HttpStatus.NOT_FOUND, null);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Remove booking detail remove failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    //Developing function
    private void updateBookingTotalAmount(UUID bookingId) {
        Optional<Booking> optionalBooking = iBookingRepository.findById(bookingId);
        Iterable<BookingDetail> bookingDetailList = iBookingDetailRepository.findAllByBookingIdAndIsDeletedFalse(bookingId);
        optionalBooking.ifPresent(booking -> {
            double totalAmount = StreamSupport.stream(bookingDetailList.spliterator(), false)
                    .filter(bookingDetail -> !bookingDetail.getIsDeleted())
                    .mapToDouble(BookingDetail::getAmount)
                    .sum();
            booking.setTotalAmount(totalAmount);
            iBookingRepository.save(booking);
        });
    }
}
