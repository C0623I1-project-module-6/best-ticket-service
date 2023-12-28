package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.dto.response.ticket_type.TicketTypeResponseDTO;
import com.codegym.bestticket.service.TicketTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket_type")
public class TicketTypeController {
    @Autowired
    private TicketTypeService ticketTypeService;

    @GetMapping()
    public ResponseEntity<List<TicketTypeRequestDTO>> getAllTicketType(){
        List<TicketTypeRequestDTO> ticketTypeRequestDTOS = ticketTypeService.getAllTicketType();
        if (ticketTypeRequestDTOS.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(ticketTypeRequestDTOS,HttpStatus.OK);

    }

    @GetMapping("/id")
    public ResponseEntity<TicketTypeResponseDTO> getTicketTypeById(@RequestBody TicketTypeResponseDTO ticketTypeResponseDTO){
        TicketTypeResponseDTO ticketTypeResponseDTO1 = ticketTypeService.getTicketTypeById(ticketTypeResponseDTO);
        if (ticketTypeResponseDTO1 == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(ticketTypeResponseDTO1,HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<TicketTypeResponseDTO> createTicketType(@RequestBody TicketTypeRequestDTO ticketTypeRequestDTO){
        if (ticketTypeRequestDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        TicketTypeResponseDTO ticketTypeResponseDTO = TicketTypeResponseDTO.builder().build();
        TicketTypeRequestDTO ticketTypeRequestDTO1 = ticketTypeService.createTicketType(ticketTypeRequestDTO);
        BeanUtils.copyProperties(ticketTypeRequestDTO1,ticketTypeResponseDTO);
        return new ResponseEntity<>(ticketTypeResponseDTO,HttpStatus.OK);
    }
}
