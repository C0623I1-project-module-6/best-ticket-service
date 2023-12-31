package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ContractDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.service.impl.contract.ContractService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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

@CrossOrigin(value = "*")
@Validated
@RestController
@RequestMapping("/api/contracts")
@AllArgsConstructor
public class ContractController {
    private final ContractService contractService;

    @GetMapping()
    public ResponseEntity<Iterable<ContractDTO>> getContractList() {
        return new ResponseEntity<>(contractService.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDto> getContract(@PathVariable UUID id) {
        try {
            ResponseDto responseDto = ResponseDto.builder().build();
            responseDto.setMessage("Contract found!");
            responseDto.setStatus(HttpStatus.OK);
            responseDto.setData(contractService.findById(id));
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
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
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while updating the contract.");
        }
    }


    @PostMapping("/add")
    public ResponseEntity<String> addContract(@RequestBody ContractDTO contractDTO) {
        try {
            contractService.save(contractDTO);
            return ResponseEntity.ok("Add completed!");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while adding the contract.");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteContract(@PathVariable UUID id) {
        try {
            contractService.remove(id);
            return ResponseEntity.ok("Contract removed!");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while deleting the contract.");
        }
    }
}
