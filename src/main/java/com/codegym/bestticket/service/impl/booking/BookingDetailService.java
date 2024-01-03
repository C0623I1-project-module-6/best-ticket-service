package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.payload.request.booking.BookingDetailRequest;
import com.codegym.bestticket.payload.response.booking.BookingDetailResponse;
import com.codegym.bestticket.repository.booking.IBookingDetailRepository;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.service.IBookingDetailService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Log
@Service
public class BookingDetailService implements IBookingDetailService {
    private final IBookingDetailRepository iBookingDetailRepository;
    private final IBookingRepository iBookingRepository;
    private final ITicketRepository iTicketRepository;

    @Override
    public Iterable<BookingDetailResponse> findAll() {
        Iterable<BookingDetail> bookingDetails = iBookingDetailRepository.findAll();
        return StreamSupport.stream(bookingDetails.spliterator(), false)
                .filter(bookingDetail -> !bookingDetail.getIsDeleted())
                .map(bookingDetail -> {
                    BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
                    BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
                    return bookingDetailResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BookingDetailResponse> findById(UUID id) {
        Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findById(id);
        return getBookingDetailResponse(bookingDetail);
    }

    private Optional<BookingDetailResponse> getBookingDetailResponse(Optional<BookingDetail> optionalBookingDetail) {
        if (optionalBookingDetail.isPresent() && !optionalBookingDetail.get().getIsDeleted()) {
            BookingDetail bookingDetail = optionalBookingDetail.get();
            BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
            BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
            return Optional.of(bookingDetailResponse);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Iterable<BookingDetailResponse> findAllByBookingId(UUID bookingId) {
        Optional<Booking> bookingOptional = iBookingRepository.findById(bookingId);

        Iterable<BookingDetail> bookingDetailsOfBooking = iBookingDetailRepository.findAllByBookingId(bookingId);
        updateBookingTotalAmount(bookingDetailsOfBooking, bookingOptional);
        return StreamSupport.stream(bookingDetailsOfBooking.spliterator(), false)
                .filter(bookingDetail -> !bookingDetail.getIsDeleted())
                .map(bookingDetail -> {
                    BookingDetailResponse bookingDetailResponse = new BookingDetailResponse();
                    BeanUtils.copyProperties(bookingDetail, bookingDetailResponse);
                    return bookingDetailResponse;
                })
                .collect(Collectors.toList());
    }

    private void updateBookingTotalAmount(Iterable<BookingDetail> bookingDetailsOfBooking, Optional<Booking> booking) {
        double amount = 0.0;
        for (BookingDetail bookingDetail : bookingDetailsOfBooking) {
            if (!bookingDetail.getIsDeleted()) {
                amount = bookingDetail.getTickets().stream()
                        .mapToDouble(ticket -> ticket.getQuantity() * ticket.getPrice())
                        .sum();
            }
        }
        double finalAmount = amount;
        booking.ifPresent(value -> {
            value.setTotalAmount(finalAmount);
            iBookingRepository.save(value);
        });
    }

    @Override
    public Optional<BookingDetailResponse> findByBookingIdAndId(UUID bookingId, UUID id) {
        Optional<BookingDetail> bookingDetailOptional = iBookingDetailRepository.findByBookingIdAndId(bookingId, id);
        return getBookingDetailResponse(bookingDetailOptional);
    }

    @Override
    public void save(BookingDetailRequest bookingDetailRequest) {
        Optional<Booking> booking = Optional.ofNullable(bookingDetailRequest.getBooking());
        assert bookingDetailRequest.getBooking() != null;
        Iterable<BookingDetail> bookingDetailsOfBooking = iBookingDetailRepository.findAllByBookingId(bookingDetailRequest.getBooking().getId());
        calculateAmount(bookingDetailRequest);
        updateBookingTotalAmount(bookingDetailsOfBooking, booking);
        saveBookingDetail(bookingDetailRequest);
    }

    private void calculateAmount(BookingDetailRequest bookingDetailRequest) {

        double amount = 0.0;
        for (Ticket ticket : bookingDetailRequest.getTickets()) {
            amount += ticket.getQuantity() * ticket.getPrice();
        }
        bookingDetailRequest.getBooking().setTotalAmount(amount);
        Booking booking = bookingDetailRequest.getBooking();
        Iterable<BookingDetail> bookingDetails = iBookingDetailRepository.findAllByBookingId(booking.getId());
        updateBookingTotalAmount(bookingDetails, Optional.of(booking));
    }

    private void saveBookingDetail(BookingDetailRequest bookingDetailRequest) {
        BookingDetail bookingDetail = new BookingDetail();
        BeanUtils.copyProperties(bookingDetailRequest, bookingDetail);
        iBookingDetailRepository.save(bookingDetail);
        setTicketBookingDetail(bookingDetail);
    }

    private void setTicketBookingDetail(BookingDetail bookingDetail) {
        List<Ticket> allTickets = iTicketRepository.findAll();
        bookingDetail.getTickets().forEach(bookingTicket -> allTickets.stream()
                .filter(ticket -> ticket.getId().equals(bookingTicket.getId()))
                .findFirst()
                .ifPresent(ticket -> {
                    BeanUtils.copyProperties(ticket, bookingTicket);
                    bookingTicket.setBookingDetail(bookingDetail);
                    iTicketRepository.save(bookingTicket);
                }));
    }

    @Override
    public void remove(UUID id) {
        Optional<BookingDetail> bookingDetail = iBookingDetailRepository.findById(id);
        bookingDetail.ifPresent(value -> value.setIsDeleted(true));
        bookingDetail.ifPresent(value -> {
            double totalAmount = value.getBooking().getTotalAmount() - value.getTickets().stream()
                    .mapToDouble(ticket -> ticket.getQuantity() * ticket.getPrice())
                    .sum();
            value.getBooking().setTotalAmount(totalAmount);
        });
        bookingDetail.ifPresent(iBookingDetailRepository::save);
    }

    @Override
    public void delete(UUID id) {
        iBookingDetailRepository.deleteById(id);
    }
}
