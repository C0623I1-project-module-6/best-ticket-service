package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.EventDTO;
import com.codegym.bestticket.dto.response.event.EventResponse;
import com.codegym.bestticket.service.IEventService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/events")
public class EventController {

    private final IEventService IEventService;

    public EventController(IEventService IEventService) {
        this.IEventService = IEventService;
    }

    @GetMapping
    public ResponseEntity<EventResponse> getAllEvent(){
        EventResponse eventResponse=new EventResponse();
        eventResponse.setEventDTOS(IEventService.findAll());
        return new ResponseEntity<>(eventResponse, HttpStatus.OK);
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<EventResponse> getEventById(@PathVariable("eventId") UUID eventId){
        EventResponse eventResponse = new EventResponse();
        eventResponse.setEventDTO(IEventService.findEventById(eventId));
        return new ResponseEntity<>(eventResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{eventId}")
    public ResponseEntity<String> deleteEvent(@PathVariable("eventId") UUID eventId) {
        try {
            IEventService.removeEvent(eventId);
            return new ResponseEntity<>("Event deleted successfully", HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>("Event not found", HttpStatus.NOT_FOUND);

        }
    }
    @PutMapping("/{eventId}")
    public ResponseEntity<EventResponse> editEvent(@PathVariable("eventId") UUID eventId,
                                                   @RequestBody EventDTO eventDTO){
        EventResponse eventResponse = new EventResponse();
        try {
            EventDTO event = IEventService.updateEvent(eventId, eventDTO);
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

    @PostMapping
    public ResponseEntity<EventResponse> createEvent(@RequestBody EventDTO eventDTO) {
        EventResponse eventResponse = new EventResponse();

        try {
            if (eventDTO == null) { // Optional
                throw new IllegalArgumentException("EventDTO is not null");
            }

            EventDTO createdEventDTO = IEventService.createEvent(eventDTO);
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

    @GetMapping("/search")
    public ResponseEntity<EventResponse> getEventBySearchTerm(@RequestParam("searchTerm") String searchTerm){
        EventResponse eventResponse = EventResponse.builder() // service build response
                .eventDTOS(IEventService.findByNameContaining(searchTerm))
                .build();
        return new ResponseEntity<>(eventResponse,HttpStatus.OK);
    }

    @PostMapping("/eventTypes")
    public ResponseEntity<EventResponse> findByEventTypeNames(@RequestBody List<String> eventTypeNames) {
        System.out.println("helllo");
        EventResponse eventResponse = EventResponse.builder()
                .eventDTOS(IEventService.findByEventTypeNames(eventTypeNames))
                .build();
        System.out.println(eventTypeNames.size());
        return new ResponseEntity<>(eventResponse, HttpStatus.OK);
    }

}
