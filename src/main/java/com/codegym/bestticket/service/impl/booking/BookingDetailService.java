package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.ticket.Ticket;
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
            Iterable<BookingDetail> bookingDetailList = iBookingDetailRepository.findAllByBookingIdAndIsDeletedFalse(bookingId, pageable);
            Iterable<BookingDetailResponse> bookingDetailResponseList = StreamSupport.stream(bookingDetailList.spliterator(), false)
                    .map(bookingDetail -> {
                        BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
                        BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
                        return bookingDetailResponse;
                    })
                    .collect(Collectors.toList());
//            checkBookingTotalAmount(bookingId);
            return createBookingDetailResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingDetailResponseList);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

//    protected void checkBookingTotalAmount(UUID bookingId) {
//        Optional<Booking> booking = iBookingRepository.findById(bookingId);
//        Iterable<BookingDetail> bookingDetailList = iBookingDetailRepository.findAllByBookingIdAndIsDeletedFalse(bookingId);
//        double bookingDetailAmount = 0.0;
//        double totalAmount = 0.0;
//        for (BookingDetail bookingDetail : bookingDetailList) {
//            bookingDetail.setAmount(bookingDetailAmount);
//            for (Ticket ticket : bookingDetail.getTickets()) {
//                bookingDetailAmount += ticket.getPrice() * ticket.getQuantity();
//                bookingDetail.setAmount(bookingDetailAmount);
//            }
//            totalAmount += bookingDetail.getAmount();
//        }
//        double finalAmount = totalAmount;
//        booking.ifPresent(value -> {
//            value.setTotalAmount(finalAmount);
//            iBookingRepository.save(value);
//        });
//    }

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
            Optional<Booking> booking = iBookingRepository.findById(bookingId);
            Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findByBookingIdAndId(bookingId, id);
            if (bookingDetail.isEmpty()) {
                BookingDetail newBookingDetail = new BookingDetail();
                newBookingDetail.setIsDeleted(false);
                BeanUtils.copyProperties(bookingDetailRequest, newBookingDetail);
                iBookingDetailRepository.save(newBookingDetail);
//                booking.ifPresent(value -> checkBookingTotalAmount(bookingId));
                return createBookingDetailResponsePayload("Booking detail saved/updated successfully!", HttpStatus.OK, newBookingDetail);
            } else {
                BookingDetail existingBookingDetail = bookingDetail.get();
                BeanUtils.copyProperties(bookingDetailRequest, existingBookingDetail);
                existingBookingDetail.setTickets(bookingDetailRequest.getTickets());
                iTicketRepository.saveAll(existingBookingDetail.getTickets());
                iBookingDetailRepository.save(existingBookingDetail);
//                booking.ifPresent(value -> checkBookingTotalAmount(bookingId));
                return createBookingDetailResponsePayload("Booking detail saved/updated successfully!", HttpStatus.OK, existingBookingDetail);
            }
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
//            bookingDetail.ifPresent(value -> {
//                value.setIsDeleted(true);
//                double totalAmount = value.getBooking().getTotalAmount() - value.getTickets().stream()
//                        .mapToDouble(ticket -> ticket.getQuantity() * ticket.getPrice())
//                        .sum();
//                value.getBooking().setTotalAmount(totalAmount);
//                iBookingDetailRepository.save(value);
//            });
            return createBookingDetailResponsePayload("Booking detail remove successfully", HttpStatus.OK, null);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Booking detail remove failed", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }
}
