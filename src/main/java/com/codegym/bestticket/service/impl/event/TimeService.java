package com.codegym.bestticket.service.impl.event;

import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.event.ITimeRepository;
import com.codegym.bestticket.service.ITimeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TimeService implements ITimeService {
    private final ITimeRepository timeRepository;

    public ResponsePayload createResponsePayload(String message, HttpStatus status, Object data) {
        return ResponsePayload
                .builder()
                .status(status)
                .message(message)
                .data(data)
                .build();
    }

    @Override
    public ResponsePayload findTimeByEventId(UUID eventId, Pageable pageable) {
        Page<Time> times = timeRepository.findTimesByEventId(eventId, pageable);
        if (times == null) {
            return createResponsePayload("fail", HttpStatus.NOT_FOUND, null);

        }
        return createResponsePayload("success", HttpStatus.OK, times);
    }
}
