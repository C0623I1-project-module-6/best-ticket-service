package com.codegym.bestticket.entity.ticket;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ticket_code;

    private String seat;

    private String time;

    private String location;

    private String promotion;

    private String barcode;

    private String isDelete;

    @ManyToOne
    @JoinColumn(name = "ticketType_id", nullable = false)
    private TicketType ticketType;

    public Ticket(String ticket_code, String seat, String time, String location, String promotion, String barcode, String isDelete, TicketType ticketType) {
        this.ticket_code = ticket_code;
        this.seat = seat;
        this.time = time;
        this.location = location;
        this.promotion = promotion;
        this.barcode = barcode;
        this.isDelete = isDelete;
        this.ticketType = ticketType;
    }

    public Ticket() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTicket_code() {
        return ticket_code;
    }

    public void setTicket_code(String ticket_code) {
        this.ticket_code = ticket_code;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }
}
