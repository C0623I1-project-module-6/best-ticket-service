package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.constant.ETicketMessage;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.response.ticket.TicketResponse;
import com.codegym.bestticket.service.ITicketService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/tickets")
@AllArgsConstructor
public class TicketController {

    private final ITicketService ticketService;

    @GetMapping
    public ResponseEntity<ResponsePayload> getAllTicket(@PageableDefault(size = 1, page = 0) Pageable pageable) {
        ResponsePayload responsePayload = ticketService.showTicket(pageable);
        if (responsePayload == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getTicketById(@PathVariable UUID id) {
        ResponsePayload responsePayload = ticketService.getTicketById(id);
        if (responsePayload == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ResponsePayload> createTicket(@RequestBody TicketResponse ticketResponse) {
        ResponsePayload responsePayload = ticketService.createTicket(ticketResponse);
        if (responsePayload == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> updateTicket(@PathVariable UUID id, @RequestBody TicketResponse ticketResponse) {
        if (ticketResponse != null) {
            ticketResponse.setId(id);
            ResponsePayload responsePayload = ticketService.updateTicket(ticketResponse);
            return new ResponseEntity<>(responsePayload, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> deleteTicket(@PathVariable UUID id) {
        ResponsePayload responsePayload;
        if (id == null) {
            responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            responsePayload.setMessage(String.valueOf(ETicketMessage.FAIL));
        }


        ticketService.deleteTicketById(id);

        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/search")
    public ResponseEntity<Iterable<ResponsePayload>> searchTicketByStatus(@RequestParam String status) {
        Iterable<ResponsePayload> responsePayload  = ticketService.searchTicketByStatus(status);
        return new ResponseEntity<>(responsePayload,HttpStatus.OK);
    }

    @GetMapping("/search/time/before")
    public ResponseEntity<Iterable<ResponsePayload>> searchTicketByTimeBefore() {
        Iterable<ResponsePayload> responsePayload = ticketService.searchTicketByTimeBefore();
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @GetMapping("/search/time/after")
    public ResponseEntity<Iterable<ResponsePayload>> searchTicketByTimeAfter() {
        Iterable<ResponsePayload> responsePayload = ticketService.searchTicketByTimeAfter();
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }
}
