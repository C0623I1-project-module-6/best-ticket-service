package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.converter.user.impl.constant.ETicketMessage;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.ticket.TicketTypeResponse;
import com.codegym.bestticket.service.ITicketTypeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/ticket-types")
public class TicketTypeController {

    private final ITicketTypeService ticketTypeService;

    @GetMapping()
    public ResponseEntity<ResponsePayload> getAllTicketType(@PageableDefault Pageable pageable) {
        ResponsePayload responsePayload = ticketTypeService.getAllTicketType(pageable);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getTicketTypeById(@PathVariable UUID id) {
        ResponsePayload responsePayload = ticketTypeService.getTicketTypeById(id);
        if (responsePayload == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());

    }

    @PostMapping()
    public ResponseEntity<ResponsePayload> createTicketType(@RequestBody TicketTypeResponse ticketTypeResponse) {
        ResponsePayload responsePayload = ticketTypeService.createTicketType(ticketTypeResponse);
        if (responsePayload == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> deleteTicketType(@PathVariable UUID id) {
        ResponsePayload responsePayload;
        if (id == null) {
            responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            responsePayload.setMessage(String.valueOf(ETicketMessage.FAIL));
        }

        ticketTypeService.deleteTicketTypeById(id);
        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponsePayload> updateTicketType(@PathVariable UUID id, @RequestBody TicketTypeResponse ticketTypeResponse) {
        if (ticketTypeResponse != null) {
            ticketTypeResponse.setId(id);
            ResponsePayload responsePayload = ticketTypeService.updateTicketType(ticketTypeResponse);
            return new ResponseEntity<>(responsePayload, HttpStatus.OK);

        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }

}
