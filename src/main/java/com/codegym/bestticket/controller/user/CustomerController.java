package com.codegym.bestticket.controller.user;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private final ICustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addInfo(@RequestBody CustomerDto customerRequest
    ) {
        if (customerRequest == null) {
            new ResponseEntity<>("Request not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(customerService.create(customerRequest).getStatus());
    }

    @PutMapping("/edit")
    public ResponseEntity<ResponsePayload> update(@RequestBody CustomerDto customerRequest) {

        if (customerRequest == null) {
            new ResponseEntity<>("Request not found or id not found!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(customerService.update(customerRequest).getStatus());
    }

}
