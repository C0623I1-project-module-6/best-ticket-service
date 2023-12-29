package com.codegym.bestticket.controller;

import com.codegym.bestticket.dto.ContractDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.service.impl.ContractService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
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

    @GetMapping("/contract-detail/{id}")
    public ResponseEntity<Optional<ContractDTO>> getContract(@PathVariable UUID id) {
        return new ResponseEntity<>(contractService.findById(id), HttpStatus.OK);
    }

//    @GetMapping("/contract-detail/{id}")
//    public ResponseEntity<ResponseDto> getContract(@PathVariable UUID id) {
//        ResponseDto responseDto = ResponseDto.builder().build();
//        responseDto.setData(contractService.findById(id));
//        return new ResponseEntity<>(responseDto, HttpStatus.OK);
//    }

    @PostMapping("/update")
    public ResponseEntity<ResponseDto> updateContract(@RequestBody ContractDTO contractDTO) {
        contractService.update(contractDTO);
        return new ResponseEntity<>(ResponseDto.builder().build(), HttpStatus.OK);
    }

    @PutMapping("/contract-detail/save/{id}")
    public ResponseEntity<String> updateContract(@PathVariable UUID id, @RequestBody ContractDTO contractDTO) {
        contractDTO.setId(id);
        contractService.save(contractDTO);
        return ResponseEntity.ok("Save/Update completed!");
    }

    @PostMapping("/add")
    public ResponseEntity<String> addContract(@RequestBody ContractDTO contractDTO) {
        contractService.save(contractDTO);
        return ResponseEntity.ok("Add completed!");
    }

}
