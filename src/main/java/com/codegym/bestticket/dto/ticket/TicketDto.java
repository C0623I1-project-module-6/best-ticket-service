package com.codegym.bestticket.dto.ticket;

import com.codegym.bestticket.entity.location.Location;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class TicketDto {
    private UUID id;
    private String eventName;
    private String ticketCode;
    private String status;
    private String seat;
    private LocalDateTime time;
    private Location location;
}
