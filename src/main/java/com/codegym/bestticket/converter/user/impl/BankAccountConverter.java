package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.dto.request.bank_acount.BankAccountRequestDTO;
import com.codegym.bestticket.dto.response.bank_account.BankAccountResponseDTO;
import com.codegym.bestticket.entity.user.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BankAccountConverter {
    public BankAccountResponseDTO entityToDto(BankAccount bankAccount) {
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }

    public BankAccount dtoToEntity(BankAccountRequestDTO bankAccountRequestDTO) {
        BankAccount bankAccount = new BankAccount();
        BeanUtils.copyProperties(bankAccountRequestDTO, bankAccount);
        return bankAccount;
    }

    public List<BankAccountResponseDTO> entitiesToDtos(List<BankAccount> bankAccounts) {
        return bankAccounts.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
