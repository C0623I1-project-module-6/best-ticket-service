package com.codegym.bestticket.controller.event;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.ITimeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/times")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class TimeController {
    private ITimeService timeService;

    @GetMapping("/{eventId}")
    public ResponseEntity<ResponsePayload> getTimeByEventId(@PathVariable UUID eventId,@PageableDefault Pageable pageable) {
        ResponsePayload responsePayload = timeService.findTimeByEventId(eventId,pageable);
        if (responsePayload == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }
}
