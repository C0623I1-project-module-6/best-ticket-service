package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.ICustomerService;
import com.codegym.bestticket.service.IOrganizerService;
import com.codegym.bestticket.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.AccessDeniedException;
import java.util.UUID;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserController {
    private final IUserService userService;
    private final ICustomerService customerService;

    @PostMapping("/customer/add")
    public ResponseEntity<ResponsePayload> addInfo(@RequestBody CustomerDto customerRequest) {
        if (customerRequest == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        ResponsePayload responsePayload = customerService.create(customerRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PutMapping("/customer/edit")
    public ResponseEntity<ResponsePayload> editProfile(@RequestBody CustomerDto customerRequest) {

        if (customerRequest == null) {
            new ResponseEntity<>("Request not found or id not found!", HttpStatus.BAD_REQUEST);
        }
        ResponsePayload responsePayload = (customerService.update(customerRequest));
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    private final IOrganizerService organizerService;

    @PostMapping("/organizer/add")
    public ResponseEntity<ResponsePayload> registerProfile(@RequestBody OrganizerDto organizerRequest) {
        if (organizerRequest == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        ResponsePayload responsePayload = organizerService.create(organizerRequest);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PutMapping("/organizer/edit")
    public ResponseEntity<ResponsePayload> edit(@RequestBody OrganizerDto organizerDto) {
        if (organizerDto == null) {
            new ResponseEntity<>("Request not found !", HttpStatus.BAD_REQUEST);
        }
        ResponsePayload responsePayload = organizerService.update(organizerDto);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.NOT_FOUND);
        }
        ResponsePayload responsePayload = userService.delete(id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @GetMapping("/exists")
    public ResponseEntity<ResponsePayload> showValidateExists() {
        return new ResponseEntity<>(userService.showExistsUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getInfo(@PathVariable UUID id) throws AccessDeniedException {
        ResponsePayload responsePayload = userService.findById(id);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

}
