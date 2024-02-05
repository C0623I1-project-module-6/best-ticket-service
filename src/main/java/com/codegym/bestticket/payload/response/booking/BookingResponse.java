package com.codegym.bestticket.payload.response.booking;


import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.entity.user.Customer;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
public class BookingResponse {
    private UUID id;
    private Double totalAmount;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Customer customer;
    private List<BookingDetailResponse> bookingDetailResponseList;
    private Boolean isDeleted;
}
