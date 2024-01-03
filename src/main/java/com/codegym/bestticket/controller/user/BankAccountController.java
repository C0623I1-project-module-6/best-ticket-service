//package com.codegym.bestticket.controller.user;
//
//import com.codegym.bestticket.dto.ResponseDto;
//import com.codegym.bestticket.dto.response.user.BankAccountResponseDTO;
//import com.codegym.bestticket.entity.user.BankAccount;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.UUID;
//
//@RestController
//@RequestMapping("/api/bank_accounts")
//@AllArgsConstructor
//public class BankAccountController {
//    private final IBankAccountService bankAccountService;
//
//    @GetMapping()
//    public ResponseEntity<ResponseDto> getAllBankAccount(){
//        ResponseDto responseDto;
//        Iterable<BankAccountResponseDTO> bankAccountResponseDTO = bankAccountService.getAllBankAccount();
//        if (bankAccountResponseDTO == null){
//            responseDto = ResponseDto.builder()
//                    .status(HttpStatus.NOT_FOUND)
//                    .message("Fail")
//                    .build();
//            return new ResponseEntity<>(responseDto,responseDto.getStatus());
//        }
//
//        responseDto = ResponseDto.builder()
//                .status(HttpStatus.OK)
//                .message("Success")
//                .data(bankAccountResponseDTO)
//                .build();
//        return new ResponseEntity<>(responseDto,responseDto.getStatus());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ResponseDto> getBankAccountById(@PathVariable UUID id){
//        ResponseDto responseDto;
//        BankAccountResponseDTO bankAccountResponseDTO = bankAccountService.getBankAccountById(id);
//        if (bankAccountResponseDTO == null){
//            responseDto = ResponseDto.builder()
//                    .message("Fail")
//                    .status(HttpStatus.NOT_FOUND)
//                    .build();
//            return new ResponseEntity<>(responseDto.getStatus());
//        }
//        responseDto = ResponseDto.builder()
//                .message("Fail")
//                .status(HttpStatus.NOT_FOUND)
//                .data(bankAccountResponseDTO)
//                .build();
//        return new ResponseEntity<>(responseDto.getStatus());
//    }
//}
