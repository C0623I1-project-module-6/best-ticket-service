package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IOrganizerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api/organizers")
public class OrganizerController {
    private final IOrganizerService organizerService;

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> registerProfile(@RequestBody OrganizerDto organizerRequest) {
        if (organizerRequest == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerService.create(organizerRequest).getStatus());
    }

    @PutMapping("/edit/")
    public ResponseEntity<ResponsePayload> edit(@RequestBody OrganizerDto organizerDto) {
        if (organizerDto == null) {
            new ResponseEntity<>("Request not found or id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerService.update(organizerDto).getStatus());

    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> findByUserId(@PathVariable UUID id) {
        return new ResponseEntity<>(organizerService.findByUserId(id), HttpStatus.OK);
    }
}





