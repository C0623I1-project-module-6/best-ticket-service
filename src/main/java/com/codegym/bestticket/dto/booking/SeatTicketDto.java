package com.codegym.bestticket.dto.booking;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class SeatTicketDto {
    private List<String> idSeats;
    private List<Double> price;
    private List<String> seats;
    private List<String> ticketTypes;
    private Double totalPrice;
}
