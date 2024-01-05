package com.codegym.bestticket.entity.ticket;

import com.codegym.bestticket.entity.booking.BookingDetail;
import com.codegym.bestticket.entity.event.Event;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String ticketCode;
    private String seat;
    private String time;
    private String location;
    private String promotion;
    private String barcode;
    private Long quantity;
    private Boolean isDeleted;
    private String status;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "booking_detail_id")
    private BookingDetail bookingDetail;

    @ManyToOne
    @JoinColumn(name = "ticket_type_id", nullable = false)
    @JsonIgnore
    private TicketType ticketType;
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    @JsonIgnore
    private Event event;

    private Double price;
}
