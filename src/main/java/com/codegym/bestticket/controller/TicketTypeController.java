package com.codegym.bestticket.controller;

import com.codegym.bestticket.constant.EMessage;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;
import com.codegym.bestticket.service.ITicketTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/ticket_types")
public class TicketTypeController {

    private final ITicketTypeService ticketTypeService;

    @GetMapping()
    public ResponseEntity<ResponseDto> getAllTicketType() {
        List<TicketTypeRequestDTO> ticketTypeRequestDTOS = ticketTypeService.getAllTicketType();

        ResponseDto responseDto = ResponseDto.builder().build();

        if (ticketTypeRequestDTOS.isEmpty()) {
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
            responseDto.setStatus(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }

        responseDto.setData(ticketTypeRequestDTOS);
        responseDto.setStatus(HttpStatus.OK);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));

        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }



    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getTicketTypeById(@PathVariable UUID id) {
        TicketTypeResponseDTO ticketTypeResponseDTO = ticketTypeService.getTicketTypeById(id);
        ResponseDto responseDto = ResponseDto.builder().build();
        if (ticketTypeResponseDTO == null) {
            responseDto.setStatus(HttpStatus.NO_CONTENT);
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }

        responseDto.setData(ticketTypeResponseDTO);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        responseDto.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createTicketType(@RequestBody TicketTypeRequestDTO ticketTypeRequestDTO) {
        ResponseDto responseDto = ResponseDto.builder().build();
        if (ticketTypeRequestDTO == null) {
            responseDto.setStatus(HttpStatus.NO_CONTENT);
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
            return new ResponseEntity<>( responseDto.getStatus());
        }
        TicketTypeResponseDTO ticketTypeResponseDTO = TicketTypeResponseDTO.builder().build();
        TicketTypeRequestDTO ticketTypeRequestDTO1 = ticketTypeService.createTicketType(ticketTypeRequestDTO);
        BeanUtils.copyProperties(ticketTypeRequestDTO1, ticketTypeResponseDTO);

        responseDto.setData(ticketTypeResponseDTO);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        responseDto.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> deleteTicketType(@PathVariable UUID id) {
        ResponseDto responseDto = ResponseDto.builder().build();
        if (id == null) {
            responseDto.setStatus(HttpStatus.NOT_FOUND);
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
        }

        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        responseDto.setStatus(HttpStatus.OK);
        ticketTypeService.deleteTicketType(id);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDto> updateTicketType(@PathVariable UUID id, @RequestBody TicketTypeResponseDTO ticketTypeResponseDTO) {

        ticketTypeResponseDTO.setId(id);
        ticketTypeService.updateTicketType(ticketTypeResponseDTO);

        ResponseDto responseDto = ResponseDto.builder().build();
        responseDto.setData(ticketTypeResponseDTO);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        responseDto.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

}
