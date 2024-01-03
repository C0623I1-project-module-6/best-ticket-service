package com.codegym.bestticket.controller.contract;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.contract.ContractDetailRequestDTO;
import com.codegym.bestticket.payload.response.contract.ContractDetailResponseDTO;
import com.codegym.bestticket.payload.response.contract.ContractResponseDTO;
import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.service.IContractDetailService;
import com.codegym.bestticket.service.IContractService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
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
@RequestMapping("/api/contracts/{contractId}/contract-details")
public class ContractDetailController {
    private final IContractService contractService;
    private final IContractDetailService contractDetailService;

    @GetMapping()
    public ResponseEntity<ResponsePayload> getContractDetailList(@PathVariable UUID contractId) {
        Iterable<ContractDetailResponseDTO> contractDetailResponseDTOS = contractDetailService.findAllByContractId(contractId);
        ResponsePayload responsePayload = ResponsePayload.builder()
                .message("Fetch data successfully")
                .status(HttpStatus.OK)
                .data(contractDetailResponseDTOS)
                .build();
        return ResponseEntity.ok(responsePayload);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePayload> getContractDetail(@PathVariable UUID contractId, @PathVariable UUID id) {
        Optional<ContractDetailResponseDTO> contractDetailResponseDTO = contractDetailService.findByContractIdAndId(contractId, id);
        if (contractDetailResponseDTO.isPresent() && !contractDetailResponseDTO.get().getIsDeleted()) {
            ResponsePayload responsePayload = ResponsePayload.builder()
                    .message("Contract detail found.")
                    .status(HttpStatus.OK)
                    .data(contractDetailResponseDTO)
                    .build();
            return ResponseEntity.ok(responsePayload);
        } else {
            ResponsePayload errorResponse = ResponsePayload.builder()
                    .message("Contract detail not found")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ResponsePayload> addContractDetail(@PathVariable UUID contractId, @RequestBody ContractDetailRequestDTO contractDetailRequestDTO) {
        try {
            Optional<ContractResponseDTO> contractOptional = contractService.findById(contractId);
            if (contractOptional.isPresent()) {
                Contract contract = new Contract();
                BeanUtils.copyProperties(contractOptional.get(), contract);
                contractDetailRequestDTO.setContract(contract);
                contractDetailService.save(contractDetailRequestDTO);
                return ResponseEntity.ok(ResponsePayload.builder()
                        .message("Added successfully.")
                        .status(HttpStatus.OK)
                        .data(contractDetailRequestDTO)
                        .build());
            } else {
                return ResponseEntity.notFound().build();
            }
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
    public ResponseEntity<ResponsePayload> updateContractDetail(@PathVariable UUID contractId, @PathVariable UUID id, @RequestBody ContractDetailRequestDTO contractDetailRequestDTO) {
        try {
            Optional<ContractDetailResponseDTO> contractDetailResponseDTO = contractDetailService.findByContractIdAndId(contractId, id);
            if (contractDetailResponseDTO.isPresent()) {
                contractDetailRequestDTO.setId(id);
                contractDetailService.save(contractDetailRequestDTO);
                Optional<ContractDetailResponseDTO> updatedContractDetail = contractDetailService.findByContractIdAndId(contractId, id);
                ResponsePayload responsePayload = ResponsePayload.builder()
                        .message("Update successfully.")
                        .status(HttpStatus.OK)
                        .data(updatedContractDetail)
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
    public ResponseEntity<ResponsePayload> removeContractDetail(@PathVariable UUID contractId, @PathVariable UUID id) {
        Optional<ContractDetailResponseDTO> contractDetailResponseDTO = contractDetailService.findByContractIdAndId(contractId, id);
        if (contractDetailResponseDTO.isPresent()) {
            contractDetailService.remove(id);
            return ResponseEntity.ok(ResponsePayload.builder()
                    .message("Remove successfully.")
                    .status(HttpStatus.OK)
                    .build());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponsePayload.builder()
                            .message("Contract detail not found.")
                            .status(HttpStatus.NOT_FOUND)
                            .build());
        }
    }
}
