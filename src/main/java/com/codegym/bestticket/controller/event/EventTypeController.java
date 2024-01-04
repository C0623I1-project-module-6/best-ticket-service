package com.codegym.bestticket.controller.event;

import com.codegym.bestticket.payload.response.event.EventTypeResponse;
import com.codegym.bestticket.service.IEventTypeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/event-type")
public class EventTypeController {
    private final IEventTypeService eventTypeService;

    public EventTypeController(IEventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
    }

    @GetMapping("/")
    public ResponseEntity<EventTypeResponse> getAll() {
        EventTypeResponse eventTypeResponse = EventTypeResponse.builder()
                .eventTypeList(eventTypeService.findAll())
                .message("List EventTypeDTO")
                .build();
        return new ResponseEntity<>(eventTypeResponse, HttpStatus.OK);
    }

    @GetMapping("/{event_type_id}")
    public ResponseEntity<EventTypeResponse> getById(@PathVariable("event_type_id") UUID event_type_id) {
        try {
            EventTypeResponse eventTypeResponse = EventTypeResponse.builder()
                    .eventType(eventTypeService.findById(event_type_id))
                    .build();
            return new ResponseEntity<>(eventTypeResponse, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            EventTypeResponse eventTypeResponse = EventTypeResponse.builder()
                    .message("Not found EventType")
                    .build();
            return new ResponseEntity<>(eventTypeResponse, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{event_type_id}")
    public ResponseEntity<String> deleteEventType(@PathVariable("event_type_id") UUID event_type_id) {
        try {
            eventTypeService.removeById(event_type_id);
            return new ResponseEntity<>("Event deleted successfully", HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>("Not found EventType", HttpStatus.OK);
        }
    }
}
