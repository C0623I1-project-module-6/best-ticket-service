package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.constant.ETicketMessage;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;
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
    public ResponseEntity<ResponseDto> getAllTicketType() {
        Iterable<TicketTypeRequestDTO> ticketTypeRequestDTOS = ticketTypeService.getAllTicketType();

        ResponseDto responseDto;

        if (ticketTypeRequestDTOS == null) {
            responseDto = ResponseDto.builder()
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }

        responseDto = ResponseDto.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketTypeRequestDTOS)
                .build();

        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getTicketTypeById(@PathVariable UUID id) {
        TicketTypeResponseDTO ticketTypeResponseDTO = ticketTypeService.getTicketTypeById(id);
        ResponseDto responseDto;

        if (ticketTypeResponseDTO == null) {
            responseDto = ResponseDto.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }

        responseDto = ResponseDto.builder()
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .status(HttpStatus.OK)
                .data(ticketTypeResponseDTO)
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createTicketType(@RequestBody TicketTypeRequestDTO ticketTypeRequestDTO) {
        if (ticketTypeRequestDTO == null) {
            ResponseDto responseDto = ResponseDto.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            return new ResponseEntity<>(responseDto.getStatus());
        }
        TicketTypeResponseDTO ticketTypeResponseDTO = TicketTypeResponseDTO.builder().build();
        TicketTypeRequestDTO ticketTypeRequestDTO1 = ticketTypeService.createTicketType(ticketTypeRequestDTO);
        BeanUtils.copyProperties(ticketTypeRequestDTO1, ticketTypeResponseDTO);

        ResponseDto responseDto;

        responseDto = ResponseDto.builder()
                .status(HttpStatus.CREATED)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .data(ticketTypeRequestDTO)
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> deleteTicketType(@PathVariable UUID id) {
        ResponseDto responseDto;
        if (id == null) {
            responseDto = ResponseDto.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message(String.valueOf(ETicketMessage.FAIL))
                    .build();
            responseDto.setMessage(String.valueOf(ETicketMessage.FAIL));
        }

        ticketTypeService.deleteTicketType(id);
        responseDto = ResponseDto.builder()
                .status(HttpStatus.OK)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDto> updateTicketType(@PathVariable UUID id, @RequestBody TicketTypeResponseDTO ticketTypeResponseDTO) {
        ResponseDto responseDto;
        if (ticketTypeResponseDTO != null) {
            ticketTypeResponseDTO.setId(id);
            ticketTypeService.updateTicketType(ticketTypeResponseDTO);

            responseDto = ResponseDto.builder()
                    .status(HttpStatus.OK)
                    .message(String.valueOf(ETicketMessage.SUCCESS))
                    .data(ticketTypeResponseDTO)
                    .build();
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }
        responseDto = ResponseDto.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(String.valueOf(ETicketMessage.SUCCESS))
                .build();
        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }

}
