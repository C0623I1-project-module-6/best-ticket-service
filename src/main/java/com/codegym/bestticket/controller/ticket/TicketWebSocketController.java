package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.ITicketService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@Controller
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class TicketWebSocketController {
    private final ITicketService ticketService;

    @MessageMapping("/findTicketByTimeId")
    @SendTo("/topic/ticketResponse")
    public ResponsePayload showTicketByTimeId(UUID timeId, Pageable pageable) {
        return ticketService.findTicketByTimeId(timeId, pageable);
    }

}
