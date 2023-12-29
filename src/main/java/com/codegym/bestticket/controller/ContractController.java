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

    @GetMapping("/contract-detail")
    public ResponseEntity<Optional<ContractDTO>> getContract(@RequestParam("id") UUID id) {
        return new ResponseEntity<>(contractService.findById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    public ResponseEntity<UUID> getUID(@PathVariable("id") final UUID id) {
        System.out.println("id is {}, " + id);
        System.out.println(contractService.findById(id));
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<ResponseDto> updateContract(@RequestBody ContractDTO contractDTO){
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
