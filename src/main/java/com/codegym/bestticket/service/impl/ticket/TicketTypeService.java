package com.codegym.bestticket.service.impl.ticket;

import com.codegym.bestticket.converter.user.impl.constant.ETicketMessage;
import com.codegym.bestticket.entity.ticket.TicketType;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.ticket.TicketTypeRequest;
import com.codegym.bestticket.payload.response.ticket.TicketTypeResponse;
import com.codegym.bestticket.repository.ticket.ITicketTypeRepository;
import com.codegym.bestticket.service.ITicketTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Service
public class TicketTypeService implements ITicketTypeService {

    private final ITicketTypeRepository ticketTypeRepository;

    public ResponsePayload createResponsePayload(String message, HttpStatus status, Object data) {
        return ResponsePayload
                .builder()
                .status(status)
                .message(message)
                .data(data)
                .build();
    }

    @Override
    public ResponsePayload getAllTicketType(Pageable pageable) {
        Page<TicketType> ticketTypes = ticketTypeRepository.findAll(pageable);

        Iterable<TicketTypeRequest> ticketTypeRequests = StreamSupport.stream(ticketTypes.spliterator(), true)
                .filter(ticketType -> !ticketType.getIsDeleted())
                .map(ticketType -> {
                    TicketTypeRequest ticketTypeRequest = new TicketTypeRequest();
                    BeanUtils.copyProperties(ticketType, ticketTypeRequest);
                    return ticketTypeRequest;
                })
                .toList();
        return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketTypeRequests);

    }

    @Override
    public ResponsePayload getTicketTypeById(UUID id) {
        TicketType ticketType = ticketTypeRepository.findById(id).orElse(null);
        assert ticketType != null;
        if (Boolean.FALSE.equals(ticketType.getIsDeleted())) {
            TicketTypeResponse ticketTypeResponse = new TicketTypeResponse();
            BeanUtils.copyProperties(ticketType, ticketTypeResponse);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketTypeResponse);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.BAD_REQUEST, null);

    }

    @Override
    public ResponsePayload createTicketType(TicketTypeResponse ticketTypeResponse) {
        TicketType ticketType = TicketType.builder().build();
        if (ticketTypeResponse != null) {
            BeanUtils.copyProperties(ticketTypeResponse, ticketType);
            ticketType = ticketTypeRepository.save(ticketType);
            TicketTypeRequest resultTicketTypeRequestDTO = new TicketTypeRequest();
            BeanUtils.copyProperties(ticketType, resultTicketTypeRequestDTO);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.CREATED, resultTicketTypeRequestDTO);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.NO_CONTENT, null);
    }

    @Override
    public ResponsePayload deleteTicketTypeById(UUID id) {
        TicketType ticketType = ticketTypeRepository.findById(id).orElse(null);
        if (ticketType != null) {
            ticketType.setIsDeleted(true);
            TicketType ticketTypeSave = ticketTypeRepository.save(ticketType);
            TicketTypeRequest ticketTypeRequest = new TicketTypeRequest();
            BeanUtils.copyProperties(ticketTypeSave, ticketTypeRequest);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketTypeRequest);

        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.BAD_REQUEST, null);
    }

    @Override
    public ResponsePayload updateTicketType(TicketTypeResponse ticketTypeResponse) {
        TicketType ticketType = ticketTypeRepository.findById(ticketTypeResponse.getId()).orElse(null);
        if (ticketType != null) {
            BeanUtils.copyProperties(ticketTypeResponse, ticketType);
            TicketType ticketType1 = ticketTypeRepository.save(ticketType);
            return createResponsePayload(String.valueOf(ETicketMessage.SUCCESS), HttpStatus.OK, ticketType1);
        }
        return createResponsePayload(String.valueOf(ETicketMessage.FAIL), HttpStatus.BAD_REQUEST, null);

    }
}
