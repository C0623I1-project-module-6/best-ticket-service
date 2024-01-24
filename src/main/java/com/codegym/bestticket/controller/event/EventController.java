package com.codegym.bestticket.controller.event;

import com.codegym.bestticket.dto.event.EventDTO;
import com.codegym.bestticket.payload.request.event.CreateEventRequest;
import com.codegym.bestticket.payload.response.event.EventResponse;
import com.codegym.bestticket.service.IEventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/events")
public class EventController {

    private final IEventService eventService;

    public EventController(IEventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public ResponseEntity<EventResponse> getAllEvent(@RequestParam(defaultValue = "0") int page,
                                                     @RequestParam(defaultValue = "10") int pageSize) {
        EventResponse eventResponse = eventService.findAll(page, pageSize);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<EventResponse> getEventById(@PathVariable("eventId") UUID eventId) {
        EventResponse eventResponse = eventService.findEventById(eventId);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }

    @DeleteMapping("/{eventId}")
    public ResponseEntity<EventResponse> deleteEvent(@PathVariable("eventId") UUID eventId) {
        EventResponse eventResponse = eventService.removeEvent(eventId);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }

    @PutMapping("/{eventId}")
    public ResponseEntity<EventResponse> editEvent(@PathVariable("eventId") UUID eventId,
                                                   @RequestBody EventDTO eventDTO) {
        EventResponse eventResponse = eventService.updateEvent(eventId, eventDTO);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }


    @PostMapping
    public ResponseEntity<EventResponse> createEvent(@RequestBody CreateEventRequest eventRequest) {
        EventResponse eventResponse = eventService.createEvent(eventRequest);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }

    @GetMapping("/eventTypeNames")
    public ResponseEntity<EventResponse> findByEventTypeNames(
            @RequestParam(name = "eventTypeNames") List<String> eventTypeNames,
            @RequestParam(name = "page") int page,
            @RequestParam(name = "pageSize") int pageSize
    ) {
        EventResponse eventResponse = eventService.findByEventTypeNamesAndIsDeletedFalse(eventTypeNames, page, pageSize);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }

    @GetMapping("/textAndEventTypeNames")
    public ResponseEntity<EventResponse> findBySearchTermAndEventTypeNames(
            @RequestParam(name = "searchTerm") String searchTerm,
            @RequestParam(name = "eventTypeNames") List<String> eventTypeNames,
            @RequestParam(name = "page") int page,
            @RequestParam(name = "pageSize") int pageSize) {
        EventResponse eventResponse = eventService.findBySearchTermAndEventTypeNames(searchTerm, eventTypeNames, page, pageSize);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }

    @GetMapping("/search")
    public ResponseEntity<EventResponse> findByNameContaining(
            @RequestParam(name = "text") String text,
            @RequestParam(name = "page") int page,
            @RequestParam(name = "pageSize") int pageSize) {
        EventResponse eventResponse = eventService.findByNameContaining(text, page, pageSize);
        return new ResponseEntity<>(eventResponse, eventResponse.getHttpStatus());
    }

    @GetMapping("/location")
    public ResponseEntity<EventResponse> getEventsByLocationProvince(
            @RequestParam(name = "searchTerm", required = false) String searchTerm,
            @RequestParam(name = "province") String province,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "pageSize",defaultValue = "20") int pageSize) {
        EventResponse response = eventService.findBySearchTermAndLocationProvince(searchTerm, province, page, pageSize);
        return new ResponseEntity<>(response, response.getHttpStatus());
    }

    @GetMapping("/searchCriteria")
    public ResponseEntity<EventResponse> findEventsBySearchCriteria(
            @RequestParam(name = "searchTerm", required = false) String searchTerm,
            @RequestParam(name = "province", required = false) String province,
            @RequestParam(name = "eventTypeNames", required = false) List<String> eventTypeNames,
            @RequestParam(name = "time", required = false) String timeString,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "pageSize", defaultValue = "20") int pageSize) {

        LocalDateTime time = null;
        if (timeString != null && !timeString.isEmpty()) {
            time = LocalDateTime.parse(timeString);
        }

        EventResponse response = eventService.findBySearchCriteria(
                searchTerm, province, eventTypeNames, time, page, pageSize);
        return new ResponseEntity<>(response, response.getHttpStatus());
    }

}
