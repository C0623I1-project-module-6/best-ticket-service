package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.constant.ETicketMessage;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.ticket.TicketTypeRequest;
import com.codegym.bestticket.payload.response.ticket.TicketTypeResponse;
import com.codegym.bestticket.service.ITicketTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
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
@RequestMapping("/api/ticket_types")
public class TicketTypeController {

    private final ITicketTypeService ticketTypeService;

    @GetMapping()
    public ResponseEntity<ResponsePayload> getAllTicketType() {
        Iterable<TicketTypeRequest> ticketTypeRequestDTOS = ticketTypeService.getAllTicketType();

        ResponsePayload responsePayload;

        if (ticketTypeRequestDTOS == null) {
            responsePayload = ResponsePayload.builder()
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
        }

        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketTypeRequestDTOS)
                .build();

        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());

    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getTicketTypeById(@PathVariable UUID id) {
        TicketTypeResponse ticketTypeResponse = ticketTypeService.getTicketTypeById(id);
        ResponsePayload responsePayload;

        if (ticketTypeResponse == null) {
            responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
        }

        responsePayload = ResponsePayload.builder()
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .status(HttpStatus.OK)
                .data(ticketTypeResponse)
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());

    }

    @PostMapping("/create")
    public ResponseEntity<ResponsePayload> createTicketType(@RequestBody TicketTypeRequest ticketTypeRequest) {
        if (ticketTypeRequest == null) {
            ResponsePayload responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responsePayload.getStatus());
        }
        TicketTypeResponse ticketTypeResponse = new TicketTypeResponse();
        TicketTypeRequest ticketTypeRequest1 = ticketTypeService.createTicketType(ticketTypeRequest);
        BeanUtils.copyProperties(ticketTypeRequest1, ticketTypeResponse);

        ResponsePayload responsePayload;

        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.CREATED)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketTypeRequest)
                .build();
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

        ticketTypeService.deleteTicketType(id);
        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponsePayload> updateTicketType(@PathVariable UUID id, @RequestBody TicketTypeResponse ticketTypeResponse) {
        ResponsePayload responsePayload;
        if (ticketTypeResponse != null) {
            ticketTypeResponse.setId(id);
            ticketTypeService.updateTicketType(ticketTypeResponse);

            responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.OK)
                    .message(String.valueOf(ETicketMessage.SUCCESS))
                    .data(ticketTypeResponse)
                    .build();
            return new ResponseEntity<>(responsePayload, HttpStatus.OK);
        }
        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());

    }

}
