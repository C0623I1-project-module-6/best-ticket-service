package com.codegym.bestticket.controller.contract;

import com.codegym.bestticket.constant.EContractStatus;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.contract.ContractRequest;
import com.codegym.bestticket.payload.response.contract.ContractResponse;
import com.codegym.bestticket.payload.response.user.CustomerResponse;
import com.codegym.bestticket.service.IContractService;
import com.codegym.bestticket.service.ICustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
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

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;

@AllArgsConstructor
@CrossOrigin(value = "*")
@Log
@RestController
@RequestMapping("/api/contracts")
public class ContractController {
    private final IContractService contractService;
    private final ICustomerService customerService;

    @GetMapping()
    public ResponseEntity<ResponsePayload> getContractList() {
        Iterable<ContractResponse> contractResponseDTOS = contractService.findAll();
        ResponsePayload responsePayload = ResponsePayload.builder()
                .message("Fetch data successfully.")
                .status(HttpStatus.OK)
                .data(contractResponseDTOS)
                .build();
        return ResponseEntity.ok(responsePayload);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getContract(@PathVariable UUID id) {
        Optional<ContractResponse> contractOptional = contractService.findById(id);
        if (contractOptional.isPresent()) {
            ContractResponse contractResponse = contractOptional.get();
            ResponsePayload responsePayload = ResponsePayload.builder()
                    .message("Contract found.")
                    .status(HttpStatus.OK)
                    .data(contractResponse)
                    .build();
            return ResponseEntity.ok(responsePayload);
        } else {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("Contract not found.")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @GetMapping("/contracts-by-customer/{id}")
    public ResponseEntity<ResponsePayload> getContractsByCustomer(@PathVariable UUID id) {
        CustomerResponse customerResponse = customerService.findById(id);
        Iterable<ContractResponse> contractList = contractService.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(ResponsePayload.builder()
                        .message("Test")
                        .status(HttpStatus.OK)
                        .data(null)
                .build());
    }


    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addContract(@RequestBody ContractRequest contractRequest) {
        try {
            contractRequest.setStatus(String.valueOf(EContractStatus.ACTIVE));
            contractRequest.setIsDeleted(false);
            contractService.save(contractRequest);
            return ResponseEntity.ok(ResponsePayload.builder()
                    .message("Add successfully.")
                    .status(HttpStatus.OK)
                    .data(contractRequest)
                    .build());
        } catch (Exception e) {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("An error occurred while adding the contract.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponsePayload> updateContract(@PathVariable UUID id, @RequestBody ContractRequest contractRequest) {
        try {
            Optional<ContractResponse> contractOptional = contractService.findById(id);
            if (contractOptional.isPresent()) {
                contractRequest.setId(id);
                contractRequest.setIsDeleted(false);
                contractService.save(contractRequest);
                Optional<ContractResponse> updatedContract = contractService.findById(id);
                ResponsePayload responsePayload = ResponsePayload.builder()
                        .message("Update successfully.")
                        .status(HttpStatus.OK)
                        .data(updatedContract)
                        .build();
                return ResponseEntity.ok(responsePayload);
            } else {
                ResponsePayload errorResponse = ResponsePayload.builder()
                        .message("Update failed. Contract not found.")
                        .status(HttpStatus.NOT_FOUND)
                        .build();
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
            }
        } catch (Exception e) {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("An error occurred while updating the contract.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ResponsePayload> remove(@PathVariable UUID id) {
        Optional<ContractResponse> contractOptional = contractService.findById(id);
        if (contractOptional.isPresent()) {
            contractService.remove(id);
            return ResponseEntity.ok(ResponsePayload.builder()
                    .message("Remove successfully.")
                    .status(HttpStatus.OK)
                    .data(contractOptional)
                    .build());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponsePayload.builder()
                            .message("Contract not found.")
                            .status(HttpStatus.NOT_FOUND)
                            .build());
        }
    }

    @GetMapping("/search/{input}")
    public ResponseEntity<ResponsePayload> search(@PathVariable String input) {
        ResponsePayload responsePayload = ResponsePayload.builder()
                .message("Test")
                .data(contractService.searchByInput(input))
                .status(HttpStatus.OK)
                .build();
        return ResponseEntity.ok(responsePayload);
    }
}
