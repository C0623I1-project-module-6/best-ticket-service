package com.codegym.bestticket.dto.ticket;

import com.codegym.bestticket.entity.location.Location;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TicketDto {
    private String eventName;
    private String ticketCode;
    private String status;
    private String seat;
    private LocalDateTime time;
    private Location location;
}
