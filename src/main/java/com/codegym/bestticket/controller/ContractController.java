package com.codegym.bestticket.controller;

import com.codegym.bestticket.constant.EContractStatus;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.contract.ContractRequestDTO;
import com.codegym.bestticket.dto.response.contract.ContractResponseDTO;
import com.codegym.bestticket.service.impl.ContractService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
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

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;

@AllArgsConstructor
@CrossOrigin(value = "*")
@Log
@RestController
@RequestMapping("/api/contracts")
public class ContractController {
    private final ContractService contractService;

    @GetMapping()
    public ResponseEntity<ResponseDto> getContractList() {
        Iterable<ContractResponseDTO> contractResponseDTOS = contractService.findAll();
        ResponseDto responseDto = ResponseDto.builder()
                .message("Fetch data successfully.")
                .status(HttpStatus.OK)
                .data(contractResponseDTOS)
                .build();
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getContract(@PathVariable UUID id) {
        Optional<ContractResponseDTO> contractOptional = contractService.findById(id);
        if (contractOptional.isPresent()) {
            ContractResponseDTO contractResponseDTO = contractOptional.get();
            ResponseDto responseDto = ResponseDto.builder()
                    .message("Contract found.")
                    .status(HttpStatus.OK)
                    .data(contractResponseDTO)
                    .build();
            return ResponseEntity.ok(responseDto);
        } else {
            ResponseDto errorResponse = ResponseDto.builder()
                    .message("Contract not found.")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addContract(@RequestBody ContractRequestDTO contractRequestDTO) {
        try {
            contractRequestDTO.setStatus(String.valueOf(EContractStatus.ACTIVE));
            contractRequestDTO.setIsDelete(false);
            contractService.save(contractRequestDTO);
            return ResponseEntity.ok(ResponseDto.builder()
                    .message("Add successfully.")
                    .status(HttpStatus.OK)
                    .data(contractRequestDTO)
                    .build());
        } catch (Exception e) {
            ResponseDto errorResponse = ResponseDto.builder()
                    .message("An error occurred while adding the contract.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @PutMapping("/contract-detail/update/{id}")
    public ResponseEntity<ResponseDto> updateContract(@PathVariable UUID id, @RequestBody ContractRequestDTO contractRequestDTO) {
        try {
            Optional<ContractResponseDTO> contractOptional = contractService.findById(id);
            if (contractOptional.isPresent()) {
                contractRequestDTO.setId(id);
                contractService.save(contractRequestDTO);
                Optional<ContractResponseDTO> updatedContract = contractService.findById(id);
                ResponseDto responseDto = ResponseDto.builder()
                        .message("Update successfully.")
                        .status(HttpStatus.OK)
                        .data(updatedContract)
                        .build();
                return ResponseEntity.ok(responseDto);
            } else {
                ResponseDto errorResponse = ResponseDto.builder()
                        .message("Update failed. Contract not found.")
                        .status(HttpStatus.NOT_FOUND)
                        .build();
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
            }
        } catch (Exception e) {
            ResponseDto errorResponse = ResponseDto.builder()
                    .message("An error occurred while updating the contract.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @PutMapping("/remove/{id}")
    public ResponseEntity<ResponseDto> remove(@PathVariable UUID id) {
        Optional<ContractResponseDTO> contractOptional = contractService.findById(id);
        if (contractOptional.isPresent()) {
            contractService.remove(id);
            return ResponseEntity.ok(ResponseDto.builder()
                    .message("Remove successfully.")
                    .status(HttpStatus.OK)
                    .data(contractOptional)
                    .build());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponseDto.builder()
                            .message("Contract not found.")
                            .status(HttpStatus.NOT_FOUND)
                            .build());
        }
    }
}
