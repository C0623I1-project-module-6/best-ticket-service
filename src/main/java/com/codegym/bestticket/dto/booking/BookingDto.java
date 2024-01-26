package com.codegym.bestticket.dto.booking;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookingDto {
    private InfoUserDto userEdit;
    private SeatTicketDto seatTickets;
    private InfoUserInputDto infoUser;
}
