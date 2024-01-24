package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingDetailRequest;
import com.codegym.bestticket.payload.response.booking.BookingDetailResponse;
import com.codegym.bestticket.payload.response.ticket.TicketInBookingDetailResponse;
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

import java.util.List;
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
            if (iBookingRepository.findById(bookingId).isPresent()) {
                Page<BookingDetail> bookingDetailList = iBookingDetailRepository.findAllByBookingIdAndIsDeletedFalse(bookingId, pageable);
                Iterable<BookingDetailResponse> bookingDetailResponseList = StreamSupport.stream(bookingDetailList.spliterator(), false)
                        .map(bookingDetail -> {
                            updateBookingDetailsAmount(bookingDetail.getBooking().getId());
                            BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
                            BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
                            List<TicketInBookingDetailResponse> ticketInBookingDetailResponses = convertTicketsToTicketInBookingDetail(bookingDetail);
                            bookingDetailResponse.setTicketInBookingDetailResponses(ticketInBookingDetailResponses);
                            return bookingDetailResponse;
                        })
                        .collect(Collectors.toList());
                return createBookingDetailResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingDetailResponseList);
            } else {
                return createBookingDetailResponsePayload("Booking is not valid!", HttpStatus.NOT_FOUND, null);
            }
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Fetch data failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    private List<TicketInBookingDetailResponse> convertTicketsToTicketInBookingDetail(BookingDetail bookingDetail) {
        return bookingDetail.getTickets().stream()
                .map(ticket -> {
                    TicketInBookingDetailResponse ticketInBookingDetailResponse = new TicketInBookingDetailResponse();
                    BeanUtils.copyProperties(ticket, ticketInBookingDetailResponse);
                    ticketInBookingDetailResponse.setTicketTypeName(ticket.getTicketType().getName());
                    ticketInBookingDetailResponse.setTicketTypePrice(ticket.getTicketType().getPrice());
                    return ticketInBookingDetailResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public ResponsePayload findById(UUID id) {
        Optional<BookingDetail> bookingDetailOptional = iBookingDetailRepository.findById(id);
        if (bookingDetailOptional.isPresent() && !bookingDetailOptional.get().getIsDeleted()) {
            BookingDetail bookingDetail = bookingDetailOptional.get();
            BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
            if (bookingDetail.getTickets().isEmpty()) {
                bookingDetail.setAmount(0.0);
                iBookingDetailRepository.save(bookingDetail);
            } else {
                updateBookingDetailsAmount(bookingDetail.getBooking().getId());
                bookingDetailResponse.setTicketInBookingDetailResponses(convertTicketsToTicketInBookingDetail(bookingDetail));
            }
            BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
            return createBookingDetailResponsePayload("Booking detail found!", HttpStatus.OK, bookingDetailResponse);
        } else {
            return createBookingDetailResponsePayload("Booking detail not found!", HttpStatus.NOT_FOUND, null);
        }
    }

    @Override
    public ResponsePayload save(UUID id, BookingDetailRequest bookingDetailRequest) {
        try {
            Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findById(id);
            if (bookingDetail.isEmpty()) {
                BookingDetail newBookingDetail = new BookingDetail();
                newBookingDetail.setIsDeleted(false);
                BeanUtils.copyProperties(bookingDetailRequest, newBookingDetail);
                iBookingDetailRepository.save(newBookingDetail);
                return createBookingDetailResponsePayload("Booking detail added successfully!", HttpStatus.OK, newBookingDetail);
            } else {
                BookingDetail existingBookingDetail = bookingDetail.get();
                BeanUtils.copyProperties(bookingDetailRequest, existingBookingDetail);
                existingBookingDetail.setTickets(bookingDetailRequest.getTickets());
                iTicketRepository.saveAll(existingBookingDetail.getTickets());
                iBookingDetailRepository.save(existingBookingDetail);
                UUID bookingId = bookingDetail.get().getBooking().getId();
                updateBookingDetailsAmount(bookingId);
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
                updateBookingDetailsAmount(bookingId);
                return createBookingDetailResponsePayload("Remove Booking detail successfully!", HttpStatus.OK, null);
            }
            return createBookingDetailResponsePayload("Booking detail not found!", HttpStatus.NOT_FOUND, null);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return createBookingDetailResponsePayload("Remove booking detail remove failed!", HttpStatus.INTERNAL_SERVER_ERROR, null);
        }
    }

    private void updateBookingDetailsAmount(UUID bookingId) {
        Optional<Booking> optionalBooking = iBookingRepository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            Booking booking = optionalBooking.get();
            List<BookingDetail> bookingDetailList = booking.getBookingDetailList();
            bookingDetailList.forEach(detail -> {
                double amount = detail.getTickets().stream()
                        .mapToDouble(ticket -> {
                            TicketType ticketType = ticket.getTicketType();
                            int quantityAvailable = countTicketTypeQuantity(detail, ticketType);
                            return ticketType.getPrice() * quantityAvailable;
                        })
                        .sum();

                detail.setAmount(amount);
                iBookingDetailRepository.save(detail);
            });
        }
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
}
