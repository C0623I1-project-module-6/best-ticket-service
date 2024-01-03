package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.constant.ETicketMessage;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.ticket.TicketRequestDTO;
import com.codegym.bestticket.payload.response.ticket.TicketResponseDTO;
import com.codegym.bestticket.service.ITicketService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
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

@RestController
@RequestMapping("/api/tickets")
@AllArgsConstructor
public class TicketController {

    private final ITicketService ticketService;

    @GetMapping
    public ResponseEntity<ResponsePayload> getAllTicket(@PageableDefault(page = 0,size = 0)Pageable pageable) {
        Iterable<TicketRequestDTO> ticketRequestDTOS = ticketService.getAllTicket(pageable);
        ResponsePayload responsePayload;
        if (ticketRequestDTOS == null) {
            responsePayload = ResponsePayload.builder()
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
        }
        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketRequestDTOS)
                .build();

        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getTicketById(@PathVariable UUID id) {
        TicketResponseDTO ticketResponseDTO = ticketService.getTicketById(id);
        ResponsePayload responsePayload;
        if (ticketResponseDTO == null) {
            responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
        }
        responsePayload = ResponsePayload.builder()
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .status(HttpStatus.OK)
                .data(ticketResponseDTO)
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PostMapping
    public ResponseEntity<ResponsePayload> createTicket(@RequestBody TicketResponseDTO ticketResponseDTO) {

        if (ticketResponseDTO == null) {
            ResponsePayload responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responsePayload.getStatus());
        }

        TicketRequestDTO ticketRequestDTO = TicketRequestDTO.builder().build();
        BeanUtils.copyProperties(ticketResponseDTO, ticketRequestDTO);

        ResponsePayload responsePayload;
        ticketRequestDTO = ticketService.createTicket(ticketRequestDTO);

        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.CREATED)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketRequestDTO)
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> updateTicket(@PathVariable UUID id, @RequestBody TicketResponseDTO ticketResponseDTO) {
        ResponsePayload responsePayload;
        if (ticketResponseDTO != null) {
            ticketResponseDTO.setId(id);

            ticketService.updateTicket(ticketResponseDTO);

            responsePayload = ResponsePayload.builder()
                    .status(HttpStatus.OK)
                    .message(String.valueOf(ETicketMessage.SUCCESS))
                    .data(ticketResponseDTO)
                    .build();
            return new ResponseEntity<>(responsePayload, HttpStatus.OK);
        }

        responsePayload = ResponsePayload.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());

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
}
