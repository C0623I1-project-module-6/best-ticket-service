//package com.codegym.bestticket.controller.bank_account;
//
//import com.codegym.bestticket.dto.ResponseDto;
//import com.codegym.bestticket.dto.request.bank_acount.BankAccountRequestDTO;
//import com.codegym.bestticket.dto.response.bank_account.BankAccountResponseDTO;
//import com.codegym.bestticket.service.IBankAccountService;
//import jakarta.persistence.EntityNotFoundException;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@CrossOrigin("*")
//@AllArgsConstructor
//@RequestMapping("/api/bank-accounts")
//public class BankAccountController {
//    private final IBankAccountService bankAccountService;
//
//    @GetMapping("")
//    public ResponseEntity<ResponseDto> getBankAccounts() {
//        try {
//            List<BankAccountResponseDTO> bankAccountResponseDTOS =
//                    bankAccountService.findAll();
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account list")
//                            .status(HttpStatus.OK)
//                            .data(bankAccountResponseDTOS)
//                            .build(),
//                    HttpStatus.OK);
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account list not found!")
//                            .status(HttpStatus.NOT_FOUND)
//                            .build(),
//                    HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ResponseDto> getBankAccount(@PathVariable UUID id) {
//        try {
//            BankAccountResponseDTO bankAccountResponseDTO =
//                    bankAccountService.findById(id);
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account" + bankAccountResponseDTO.getId())
//                            .status(HttpStatus.OK)
//                            .data(bankAccountResponseDTO)
//                            .build(),
//                    HttpStatus.OK);
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account" + id + "not found")
//                            .status(HttpStatus.NOT_FOUND)
//                            .build(),
//                    HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<ResponseDto> addBankAccount(@RequestBody BankAccountRequestDTO bankAccountRequestDTO) {
//        try {
//            if (bankAccountRequestDTO == null) {
//                return new ResponseEntity<>(
//                        ResponseDto.builder()
//                                .message("Request not found!")
//                                .status(HttpStatus.BAD_REQUEST)
//                                .build(),
//                        HttpStatus.BAD_REQUEST);
//            }
//            BankAccountResponseDTO bankAccountResponseDTO = bankAccountService.create(bankAccountRequestDTO);
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Add bank account successfully!!!")
//                            .status(HttpStatus.CREATED)
//                            .data(bankAccountResponseDTO)
//                            .build(),
//                    HttpStatus.CREATED);
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Add bank account failed!")
//                            .status(HttpStatus.BAD_REQUEST)
//                            .build(),
//                    HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ResponseDto> editBankAccount(@PathVariable UUID id,
//                                                       @RequestBody BankAccountRequestDTO bankAccountRequestDTO) {
//        try {
//            if (bankAccountRequestDTO == null) {
//                return new ResponseEntity<>(
//                        ResponseDto.builder()
//                                .message("Request not found!")
//                                .status(HttpStatus.BAD_REQUEST)
//                                .build(),
//                        HttpStatus.BAD_REQUEST);
//            }
//            BankAccountResponseDTO bankAccountResponseDTO = bankAccountService.update(id, bankAccountRequestDTO);
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Edit bank account successfully!!!")
//                            .status(HttpStatus.OK)
//                            .data(bankAccountResponseDTO)
//                            .build(),
//                    HttpStatus.OK);
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Edit bank account failed!")
//                            .status(HttpStatus.BAD_REQUEST)
//                            .build(),
//                    HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @DeleteMapping("/disable/{id}")
//    public ResponseEntity<ResponseDto> disableBankAccount(@PathVariable UUID id) {
//        try {
//            bankAccountService.remove(id);
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account disabled!!!")
//                            .status(HttpStatus.OK)
//                            .build(),
//                    HttpStatus.OK);
//        } catch (EntityNotFoundException e) {
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account not found or is deleted!")
//                            .status(HttpStatus.NOT_FOUND)
//                            .build(),
//                    HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<ResponseDto> deleteBankAccount(@PathVariable UUID id) {
//        try {
//            bankAccountService.delete(id);
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account deleted!!!")
//                            .status(HttpStatus.OK)
//                            .build(),
//                    HttpStatus.OK);
//        } catch (EntityNotFoundException e) {
//            return new ResponseEntity<>(
//                    ResponseDto.builder()
//                            .message("Bank account not found or is deleted!")
//                            .status(HttpStatus.NOT_FOUND)
//                            .build(),
//                    HttpStatus.NOT_FOUND);
//        }
//    }
//}
