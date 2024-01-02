package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.constant.ETicketMessage;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.ticket.TicketRequestDTO;
import com.codegym.bestticket.dto.response.ticket.TicketResponseDTO;
import com.codegym.bestticket.service.ITicketService;
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

@RestController
@RequestMapping("/api/tickets")
@AllArgsConstructor
public class TicketController {

    private final ITicketService ticketService;

    @GetMapping()
    public ResponseEntity<ResponseDto> getAllTicket() {
        Iterable<TicketRequestDTO> ticketRequestDTOS = ticketService.getAllTicket();
        ResponseDto responseDto;
        if (ticketRequestDTOS == null) {
            responseDto = ResponseDto.builder()
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }
        responseDto = ResponseDto.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketRequestDTOS)
                .build();

        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getTicketById(@PathVariable UUID id) {
        TicketResponseDTO ticketResponseDTO = ticketService.getTicketById(id);
        ResponseDto responseDto;
        if (ticketResponseDTO == null) {
            responseDto = ResponseDto.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }
        responseDto = ResponseDto.builder()
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .status(HttpStatus.OK)
                .data(ticketResponseDTO)
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createTicket(@RequestBody TicketResponseDTO ticketResponseDTO) {

        if (ticketResponseDTO == null) {
            ResponseDto responseDto = ResponseDto.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responseDto.getStatus());
        }

        TicketRequestDTO ticketRequestDTO = TicketRequestDTO.builder().build();
        BeanUtils.copyProperties(ticketResponseDTO, ticketRequestDTO);

        ResponseDto responseDto;
        ticketRequestDTO = ticketService.createTicket(ticketRequestDTO);

        responseDto = ResponseDto.builder()
                .status(HttpStatus.CREATED)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketRequestDTO)
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @PutMapping("update/{id}")
    public ResponseEntity<ResponseDto> updateTicket(@PathVariable UUID id, @RequestBody TicketResponseDTO ticketResponseDTO) {
        ResponseDto responseDto;
        if (ticketResponseDTO != null) {
            ticketResponseDTO.setId(id);

            ticketService.updateTicket(ticketResponseDTO);

            responseDto = ResponseDto.builder()
                    .status(HttpStatus.OK)
                    .message(String.valueOf(ETicketMessage.SUCCESS))
                    .data(ticketResponseDTO)
                    .build();
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }

        responseDto = ResponseDto.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteTicket(@PathVariable UUID id) {
        ResponseDto responseDto;
        if (id == null) {
            responseDto = ResponseDto.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            responseDto.setMessage(String.valueOf(ETicketMessage.FAIL));
        }


        ticketService.deleteTicketById(id);

        responseDto = ResponseDto.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }
}
