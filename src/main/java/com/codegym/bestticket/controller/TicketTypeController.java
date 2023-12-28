package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.request.ticket_type.TicketTypeRequestDTO;
import com.codegym.bestticket.service.TicketTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
