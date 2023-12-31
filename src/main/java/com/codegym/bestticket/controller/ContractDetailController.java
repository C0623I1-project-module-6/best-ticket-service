package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.contract.ContractDetailRequestDTO;
import com.codegym.bestticket.dto.response.contract.ContractDetailResponseDTO;
import com.codegym.bestticket.dto.response.contract.ContractResponseDTO;
import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.service.impl.ContractDetailService;
import com.codegym.bestticket.service.impl.ContractService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
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
@RequestMapping("/api/contracts/{contractId}/contract-details")
public class ContractDetailController {
    private final ContractService contractService;
    private final ContractDetailService contractDetailService;

    @GetMapping()
    public ResponseEntity<ResponseDto> getContractDetailList(@PathVariable UUID contractId) {
        Iterable<ContractDetailResponseDTO> contractDetailResponseDTOS = contractDetailService.findAllByContractId(contractId);
        ResponseDto responseDto = ResponseDto.builder()
                .message("Fetch data successfully")
                .status(HttpStatus.OK)
                .data(contractDetailResponseDTOS)
                .build();
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getContractDetail(@PathVariable UUID contractId, @PathVariable UUID id) {
        Optional<ContractDetailResponseDTO> contractDetailResponseDTO = contractDetailService.findByContractIdAndId(contractId, id);
        if (contractDetailResponseDTO.isPresent() && !contractDetailResponseDTO.get().getIsDelete()) {
            ResponseDto responseDto = ResponseDto.builder()
                    .message("Contract detail found.")
                    .status(HttpStatus.OK)
                    .data(contractDetailResponseDTO)
                    .build();
            return ResponseEntity.ok(responseDto);
        } else {
            ResponseDto errorResponse = ResponseDto.builder()
                    .message("Contract detail not found")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addContractDetail(@PathVariable UUID contractId, @RequestBody ContractDetailRequestDTO contractDetailRequestDTO) {
        try {
            Optional<ContractResponseDTO> contractOptional = contractService.findById(contractId);
            if (contractOptional.isPresent()) {
                Contract contract = new Contract();
                BeanUtils.copyProperties(contractOptional.get(), contract);
                contractDetailRequestDTO.setContract(contract);
                contractDetailService.save(contractDetailRequestDTO);
                return ResponseEntity.ok(ResponseDto.builder()
                        .message("Added successfully.")
                        .status(HttpStatus.OK)
                        .data(contractDetailRequestDTO)
                        .build());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            ResponseDto errorResponse = ResponseDto.builder()
                    .message("An error occurred while adding the contract.")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            log.log(Level.WARNING, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDto> updateContractDetail(@PathVariable UUID contractId, @PathVariable UUID id, @RequestBody ContractDetailRequestDTO contractDetailRequestDTO) {
        try {
            Optional<ContractDetailResponseDTO> contractDetailResponseDTO = contractDetailService.findByContractIdAndId(contractId, id);
            if (contractDetailResponseDTO.isPresent()) {
                contractDetailRequestDTO.setId(id);
                contractDetailService.save(contractDetailRequestDTO);
                Optional<ContractDetailResponseDTO> updatedContractDetail = contractDetailService.findByContractIdAndId(contractId, id);
                ResponseDto responseDto = ResponseDto.builder()
                        .message("Update successfully.")
                        .status(HttpStatus.OK)
                        .data(updatedContractDetail)
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
    public ResponseEntity<ResponseDto> removeContractDetail(@PathVariable UUID contractId, @PathVariable UUID id) {
        Optional<ContractDetailResponseDTO> contractDetailResponseDTO = contractDetailService.findByContractIdAndId(contractId, id);
        if (contractDetailResponseDTO.isPresent()) {
            contractDetailService.remove(id);
            return ResponseEntity.ok(ResponseDto.builder()
                    .message("Remove successfully.")
                    .status(HttpStatus.OK)
                    .build());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponseDto.builder()
                            .message("Contract detail not found.")
                            .status(HttpStatus.NOT_FOUND)
                            .build());
        }
    }
}
