package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.EventDTO;
import com.codegym.bestticket.dto.response.event.EventResponse;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.service.EventService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public ResponseEntity<EventResponse> getAllEvent(){
        EventResponse eventResponse=new EventResponse();
        eventResponse.setEventDTOS(eventService.findAll());
        return new ResponseEntity<>(eventResponse, HttpStatus.OK);
    }

    @GetMapping("/{event_id}")
    public ResponseEntity<EventResponse> getEventById(@PathVariable("event_id") UUID event_id){
        EventResponse eventResponse = new EventResponse();
        eventResponse.setEventDTO(eventService.findEventById(event_id));
        return new ResponseEntity<>(eventResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{event_id}")
    public ResponseEntity<String> deleteEvent(@PathVariable("event_id") UUID event_id) {
        try {
            eventService.removeEvent(event_id);
            return new ResponseEntity<>("Event deleted successfully", HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>("Event not found", HttpStatus.NOT_FOUND);

        }
    }
    @PutMapping("/{event_id}")
    public ResponseEntity<EventResponse> editEvent(@PathVariable("event_id") UUID event_id,
                                                   @RequestBody EventDTO eventDTO){
        EventResponse eventResponse = new EventResponse();
        try {
            EventDTO event = eventService.updateEvent(event_id, eventDTO);
            eventResponse.setEventDTO(event);
            eventResponse.setMessage("Update successfully");
            return new ResponseEntity<>(eventResponse, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            eventResponse.setMessage("EventDTO is null");
            return new ResponseEntity<>(eventResponse, HttpStatus.BAD_REQUEST);
        } catch (EntityNotFoundException e) {
            eventResponse.setMessage("Not found Event");
            return new ResponseEntity<>(eventResponse, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<EventResponse> createEvent(@RequestBody EventDTO eventDTO) {
        EventResponse eventResponse = new EventResponse();

        try {
            if (eventDTO == null) {
                throw new IllegalArgumentException("EventDTO is not null");
            }

            EventDTO createdEventDTO = eventService.createEvent(eventDTO);
            eventResponse.setEventDTO(createdEventDTO);
            eventResponse.setMessage("Event created successfully");

            return new ResponseEntity<>(eventResponse, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            eventResponse.setMessage("Input not null: " + e.getMessage());
            return new ResponseEntity<>(eventResponse, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            eventResponse.setMessage("Failed to create event");
            return new ResponseEntity<>(eventResponse, HttpStatus.BAD_REQUEST);
        }
    }


}
