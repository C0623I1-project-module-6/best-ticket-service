package com.codegym.bestticket.entity.ticket.user;

import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IOrganizerService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api/organizers")
public class OrganizerController {
    private final IOrganizerService organizerService;

    @GetMapping()
    public ResponseEntity<ResponsePayload> shows(Pageable pageable) {
        return new ResponseEntity<>(organizerService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> show(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ResponsePayload> add(@RequestBody OrganizerDto organizerDto) {
        if (organizerDto == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerService.create(organizerDto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> edit(@PathVariable UUID id,
                                                @RequestBody OrganizerDto organizerDto) {
        if (organizerDto == null) {
            new ResponseEntity<>("Request not found or id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerService.update(id, organizerDto), HttpStatus.OK);

    }
}





