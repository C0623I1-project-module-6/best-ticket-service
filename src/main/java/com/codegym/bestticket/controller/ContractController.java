package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ContractDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.service.impl.ContractService;
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

import java.util.UUID;
import java.util.logging.Level;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/contracts")
@AllArgsConstructor
@Log
public class ContractController {
    private final ContractService contractService;

    @GetMapping()
    public ResponseEntity<Iterable<ContractDTO>> getContractList() {
        return new ResponseEntity<>(contractService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getContract(@PathVariable UUID id) {
        ResponseDto responseDto = ResponseDto.builder().build();
        responseDto.setData(contractService.findById(id).orElse(null));
        if (responseDto.getData() != null) {
            responseDto.setMessage("Contract found!");
            responseDto.setStatus(HttpStatus.OK);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } else {
            ResponseDto errorResponse = ResponseDto.builder()
                    .message("An error occurred while finding the contract.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @PutMapping("/contract-detail/update/{id}")
    public ResponseEntity<String> updateContract(@PathVariable UUID id, @RequestBody ContractDTO contractDTO) {
        try {
            contractDTO.setId(id);
            contractService.save(contractDTO);
            return ResponseEntity.ok("Save/Update completed!");
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while updating the contract.");
        }
    }

    @PostMapping("/add")
    public ResponseEntity<String> addContract(@RequestBody ContractDTO contractDTO) {
        try {
            contractService.save(contractDTO);
            return ResponseEntity.ok("Add completed!");
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while adding the contract.");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteContract(@PathVariable UUID id) {
        try {
            if (contractService.findById(id).isPresent()) {
                contractService.remove(id);
                return ResponseEntity.ok("Contract removed!");
            } else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Contract is not found!");
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while deleting the contract.");
        }
    }
}
