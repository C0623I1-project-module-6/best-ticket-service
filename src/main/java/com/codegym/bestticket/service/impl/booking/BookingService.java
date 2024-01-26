package com.codegym.bestticket.service.impl.booking;

import com.codegym.bestticket.converter.user.impl.constant.EBookingStatus;
import com.codegym.bestticket.dto.booking.BookingDto;
import com.codegym.bestticket.entity.booking.Booking;
import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.exception.BookingSaveException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.booking.BookingRequest;
import com.codegym.bestticket.payload.response.booking.BookingResponse;
import com.codegym.bestticket.repository.booking.IBookingRepository;
import com.codegym.bestticket.service.IBookingService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
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
    @Autowired
    private JavaMailSender emailSender;

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

    private ResponsePayload getBookingResponsePayload(Iterable<Booking> bookings) {
        Iterable<BookingResponse> bookingResponses = StreamSupport.stream(bookings.spliterator(), false).filter(booking -> !booking.getIsDeleted()).map(booking -> {
            BookingResponse bookingResponse = new BookingResponse();
            bookingResponse.setUserEmail(booking.getCustomer().getUser().getEmail());
            updateBookingTotalAmount(booking);
            iBookingRepository.save(booking);
            BeanUtils.copyProperties(booking, bookingResponse);
            return bookingResponse;
        }).sorted(Comparator.comparing(BookingResponse::getCreatedAt).reversed()).collect(Collectors.toList());
        return createBookingResponsePayload("Fetch data successfully!", HttpStatus.OK, bookingResponses);
    }

    private void updateBookingTotalAmount(Booking booking) {
        double totalAmount = 0.0;
        if (!booking.getBookingDetailList().isEmpty()) {
            for (BookingDetail bookingDetail : booking.getBookingDetailList()) {
                double amount = bookingDetail.getAmount();
                totalAmount += amount;
            }
            booking.setTotalAmount(totalAmount);
            iBookingRepository.save(booking);
        }
    }

    @Override
    public ResponsePayload findById(UUID id) {
        Optional<Booking> bookingOptional = iBookingRepository.findById(id);
        if (bookingOptional.isPresent() && !bookingOptional.get().getIsDeleted()) {
            Booking booking = bookingOptional.get();
            BookingResponse bookingResponse = new BookingResponse();
            updateBookingTotalAmount(booking);
            BeanUtils.copyProperties(booking, bookingResponse);
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

    public String creatHTMLMail(){
        return "<div>Đá chết cha giờ</div>";
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

            String from = "mfdat2015@gmail.com";

            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);

            try {
                helper.setSubject("This is an HTML email");
                helper.setFrom(from);
                helper.setTo(bookingDto.getInfoUser().getEmail());
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }


            boolean html = true;
            try {
                helper.setText(creatHTMLMail(), html);
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }

            emailSender.send(message);
        }
        return createBookingResponsePayload("Success", HttpStatus.CREATED, booking);
    }

}
