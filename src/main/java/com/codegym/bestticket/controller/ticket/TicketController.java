package com.codegym.bestticket.controller.ticket;

import com.codegym.bestticket.constant.EMessage;
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
    public ResponseEntity<ResponseDto> getAllTicket(){
        Iterable<TicketRequestDTO> ticketRequestDTOS = ticketService.getAllTicket();
        ResponseDto responseDto = ResponseDto.builder().build();

        if (ticketRequestDTOS == null) {
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
            responseDto.setStatus(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }

        responseDto.setData(ticketRequestDTOS);
        responseDto.setStatus(HttpStatus.OK);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));

        return new ResponseEntity<>(responseDto, responseDto.getStatus());
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getTicketById(@PathVariable UUID id){
        TicketResponseDTO ticketResponseDTO = ticketService.getTicketById(id);
        ResponseDto responseDto = ResponseDto.builder().build();
        if (ticketResponseDTO == null){
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
            responseDto.setStatus(HttpStatus.NOT_FOUND);
            return new ResponseEntity<>(responseDto, responseDto.getStatus());
        }
        responseDto.setData(ticketResponseDTO);
        responseDto.setStatus(HttpStatus.OK);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        return new ResponseEntity<>(responseDto,responseDto.getStatus());
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createTicket(@RequestBody TicketResponseDTO ticketResponseDTO){
        ResponseDto responseDto = ResponseDto.builder().build();
        if (ticketResponseDTO == null){
            responseDto.setStatus(HttpStatus.NOT_FOUND);
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
            return new ResponseEntity<>(responseDto.getStatus());
        }
        TicketRequestDTO ticketRequestDTO = TicketRequestDTO.builder().build();
        BeanUtils.copyProperties(ticketResponseDTO,ticketRequestDTO);

        ticketRequestDTO = ticketService.createTicket(ticketRequestDTO);
        BeanUtils.copyProperties(ticketRequestDTO,responseDto);

        responseDto.setStatus(HttpStatus.CREATED);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        responseDto.setData(ticketRequestDTO);
        return new ResponseEntity<>(responseDto,responseDto.getStatus());
    }

    @PutMapping("update/{id}")
    public ResponseEntity<ResponseDto> updateTicket(@PathVariable UUID id, @RequestBody TicketResponseDTO ticketResponseDTO){
        ticketResponseDTO.setId(id);

        ticketService.updateTicket(ticketResponseDTO);

        ResponseDto responseDto = ResponseDto.builder().build();
        responseDto.setStatus(HttpStatus.OK);
        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        responseDto.setData(ticketResponseDTO);
        return new ResponseEntity<>(responseDto,HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> deleteTicket(@PathVariable UUID id){
        ResponseDto responseDto = ResponseDto.builder().build();
        if (id == null){
            responseDto.setStatus(HttpStatus.NOT_FOUND);
            responseDto.setMessage(String.valueOf(EMessage.FAIL));
        }
        ticketService.deleteTicketById(id);

        responseDto.setMessage(String.valueOf(EMessage.SUCCESS));
        responseDto.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(responseDto,responseDto.getStatus());
    }
}
