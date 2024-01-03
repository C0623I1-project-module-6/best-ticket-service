//package com.codegym.bestticket.service.impl.bank_account;
//
//import com.codegym.bestticket.converter.bank_account.BankAccountConverter;
//import com.codegym.bestticket.dto.request.bank_acount.BankAccountRequestDTO;
//import com.codegym.bestticket.dto.response.bank_account.BankAccountResponseDTO;
//import com.codegym.bestticket.entity.bank_account.BankAccount;
//import com.codegym.bestticket.entity.user.User;
//import com.codegym.bestticket.repository.bank_account.IBankAccountRepository;
//import com.codegym.bestticket.repository.user.IUserRepository;
//import jakarta.persistence.EntityNotFoundException;
//import jakarta.transaction.Transactional;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@Service
//@AllArgsConstructor
//@Transactional
//public class BankAccountService implements IBankAccountService {
//    private final IBankAccountRepository bankAccountRepository;
//    private final BankAccountConverter bankAccountConverter
//    private final IUserRepository userRepository;
//
//    @Override
//    public List<BankAccountResponseDTO> findAll() {
//
//        return bankAccountConverter.entitiesToDtos(
//                bankAccountRepository.findAllByIsDeletedFalse());
//    }
//
//    @Override
//    public BankAccountResponseDTO findById(UUID id) {
//        return bankAccountRepository.findByIdAndIsDeletedFalse(id)
//                .map(bankAccount -> bankAccountConverter.entityToDto(bankAccount))
//                .orElseThrow(() ->
//                        new EntityNotFoundException("Bank account not found or is deleted."));
//    }
//
//    @Override
//    public BankAccountResponseDTO create(BankAccountRequestDTO bankAccountRequestDTO) {
//        User user = userRepository.findById(bankAccountRequestDTO.getUser())
//                .orElseThrow(() -> new EntityNotFoundException("User not found"));
//        BankAccount bankAccount = BankAccount.builder()
//                .user(user)
//                .isDeleted(false)
//                .build();
//        bankAccountRepository.save(bankAccount);
//        return bankAccountConverter.entityToDto(bankAccount);
//    }
//
//    @Override
//    public BankAccountResponseDTO update(UUID id, BankAccountRequestDTO bankAccountRequestDTO) {
//        Optional<BankAccount> optionalBankAccount = bankAccountRepository.findById(id);
//        if (optionalBankAccount.isEmpty()) {
//            throw new EntityNotFoundException("Bank account not found is" + id);
//        }
//        BankAccount bankAccount = BankAccount.builder().build();
//        bankAccountRepository.save(bankAccount);
//        return bankAccountConverter.entityToDto(bankAccount);
//    }
//
//    @Override
//    public void remove(UUID id) {
//        bankAccountRepository.findById(id).ifPresentOrElse(
//                bankAccount -> {
//                    bankAccount.setIsDeleted(true);
//                    bankAccountRepository.save(bankAccount);
//                },
//                () -> {
//                    throw new EntityNotFoundException("Bank account is not found.");
//                }
//        );
//    }
//
//    @Override
//    public void delete(UUID id) {
//        bankAccountRepository.deleteById(id);
//    }
//}
