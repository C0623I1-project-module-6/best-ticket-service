package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.dto.response.user.BankAccountResponseDTO;
import com.codegym.bestticket.entity.user.BankAccount;
import com.codegym.bestticket.repository.IBankAccountRepository;
import com.codegym.bestticket.service.IBankAccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class BankAccountService implements IBankAccountService {
    private final IBankAccountRepository bankAccountRepository;
    @Override
    public Iterable<BankAccountResponseDTO> getAllBankAccount() {
        Iterable<BankAccount> bankAccounts = bankAccountRepository.findAll();

        return StreamSupport.stream(bankAccounts.spliterator(), true)
                .filter(bankAccount -> !bankAccount.getIsDeleted())
                .map(bankAccount -> {
                    BankAccountResponseDTO bankAccountResponseDTO = BankAccountResponseDTO.builder().build();
                    BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
                    return bankAccountResponseDTO;
                })
                .toList();
    }

    @Override
    public BankAccountResponseDTO getBankAccountById(UUID id) {
        BankAccount bankAccount = bankAccountRepository.findById(id).orElse(null);

        BankAccountResponseDTO bankAccountResponseDTO = BankAccountResponseDTO.builder().build();
        assert bankAccount != null;
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);

        return bankAccountResponseDTO;
    }
}
