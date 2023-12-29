package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;
import com.codegym.bestticket.service.TicketTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ticket_type")
public class TicketTypeController {
    @Autowired
    private TicketTypeService ticketTypeService;

    @GetMapping()
    public ResponseEntity<ResponseDto> getAllTicketType() {
        List<TicketTypeRequestDTO> ticketTypeRequestDTOS = ticketTypeService.getAllTicketType();

        ResponseDto responseDto = ResponseDto.builder().build();

        if (ticketTypeRequestDTOS.isEmpty()) {
            responseDto.setMessage("Not found");
            responseDto.setStatus(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }

        responseDto.setData(ticketTypeRequestDTOS);
        responseDto.setStatus(HttpStatus.OK);
        responseDto.setMessage("Success");

        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }

    @GetMapping("/id")
    public ResponseEntity<ResponseDto> getTicketTypeById(@RequestBody TicketTypeResponseDTO ticketTypeResponseDTO) {
        TicketTypeResponseDTO ticketTypeResponseDTO1 = ticketTypeService.getTicketTypeById(ticketTypeResponseDTO);
        ResponseDto responseDto = ResponseDto.builder().build();
        if (ticketTypeResponseDTO1 == null) {
            responseDto.setStatus(HttpStatus.NO_CONTENT);
            responseDto.setMessage("Not found");
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }

        responseDto.setData(ticketTypeResponseDTO1);
        responseDto.setMessage("Success");
        responseDto.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createTicketType(@RequestBody TicketTypeRequestDTO ticketTypeRequestDTO) {
        ResponseDto responseDto = ResponseDto.builder().build();
        if (ticketTypeRequestDTO == null) {
            responseDto.setStatus(HttpStatus.NO_CONTENT);
            responseDto.setMessage("Create fail");
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }
        TicketTypeResponseDTO ticketTypeResponseDTO = TicketTypeResponseDTO.builder().build();
        TicketTypeRequestDTO ticketTypeRequestDTO1 = ticketTypeService.createTicketType(ticketTypeRequestDTO);
        BeanUtils.copyProperties(ticketTypeRequestDTO1, ticketTypeResponseDTO);

        responseDto.setData(ticketTypeResponseDTO);
        responseDto.setMessage("Create success");
        responseDto.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> deleteTicketType(@PathVariable UUID id) {
        ResponseDto responseDto = ResponseDto.builder().build();
        if (id == null) {
            responseDto.setStatus(HttpStatus.NOT_FOUND);
            responseDto.setMessage("Not found ID");
        }

        responseDto.setMessage("Delete success");
        responseDto.setStatus(HttpStatus.OK);
        ticketTypeService.deleteTicketType(id);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDto> updateTicketType(@PathVariable UUID id, @RequestBody TicketTypeResponseDTO ticketTypeResponseDTO) {

    ticketTypeResponseDTO.setId(id);
        ticketTypeService.updateTicketType(ticketTypeResponseDTO);

        ResponseDto responseDto = ResponseDto.builder().build();
        if (ticketTypeResponseDTO == null) {
            responseDto.setStatus(HttpStatus.NOT_FOUND);
            responseDto.setMessage("Update failed");
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }
        responseDto.setData(ticketTypeResponseDTO);
        responseDto.setMessage("Success");
        responseDto.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }

}
