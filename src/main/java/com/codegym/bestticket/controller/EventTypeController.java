package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.response.event_type.EventTypeResponse;
import com.codegym.bestticket.service.EventTypeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/event-type")
public class EventTypeController {
    private final EventTypeService eventTypeService;

    public EventTypeController(EventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
    }
    @GetMapping("/")
    public ResponseEntity<EventTypeResponse> getAll(){
        EventTypeResponse eventTypeResponse = EventTypeResponse.builder()
                .eventTypeList(eventTypeService.findAll())
                .message("List EventTypeDTO")
                .build();
        return new ResponseEntity<>(eventTypeResponse, HttpStatus.OK);
    }
    @GetMapping("/{event_type_id}")
    public  ResponseEntity<EventTypeResponse> getById(@PathVariable("event_type_id")UUID event_type_id){
        try {
            EventTypeResponse eventTypeResponse= EventTypeResponse.builder()
                    .eventType(eventTypeService.findById(event_type_id))
                    .build();
            return new  ResponseEntity<>(eventTypeResponse,HttpStatus.OK);
        }catch (EntityNotFoundException e){
            EventTypeResponse eventTypeResponse= EventTypeResponse.builder()
                    .message("Not found EventType")
                    .build();
            return new  ResponseEntity<>(eventTypeResponse,HttpStatus.OK);
        }
    }

    @DeleteMapping("/{event_type_id}")
    public ResponseEntity<String> deleteEventType(@PathVariable("event_type_id")UUID event_type_id){
        try{
            eventTypeService.removeById(event_type_id);
            return new ResponseEntity<>("Event deleted successfully", HttpStatus.OK);
        }catch (EntityNotFoundException e){
            return new ResponseEntity<>("Not found EventType",HttpStatus.OK);
        }
    }
}
