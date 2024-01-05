package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.CustomerRequest;
import com.codegym.bestticket.service.ICustomerService;
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
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private final ICustomerService customerService;

    @GetMapping()
    public ResponseEntity<ResponsePayload> shows(Pageable pageable) {
        return new ResponseEntity<>(customerService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> show(@PathVariable UUID id) {
        if (id == null) {
            new ResponseEntity<>("Id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ResponsePayload> addInfo(@PathVariable UUID id,
                                                   @RequestBody CustomerRequest customerRequest) {
        if (customerRequest == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(customerService.addInfo(id, customerRequest), HttpStatus.CREATED);


    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePayload> update(@PathVariable UUID id,
                                                  @RequestBody CustomerDto customerDto) {

        if (customerDto == null) {
            new ResponseEntity<>("Request not found or id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(customerService.update(id, customerDto), HttpStatus.OK);
    }

}
