package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IBankAccountConverter;
import com.codegym.bestticket.dto.user.BankAccountDto;
import com.codegym.bestticket.entity.user.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BankAccountConverter implements IBankAccountConverter {

    public BankAccountDto entityToDto(BankAccount bankAccount) {
        BankAccountDto bankAccountDto = new BankAccountDto();
        BeanUtils.copyProperties(bankAccount, bankAccountDto);
        return bankAccountDto;

    }

    public BankAccount dtoToEntity(BankAccountDto bankAccountDto) {
        BankAccount bankAccount = new BankAccount();
        BeanUtils.copyProperties(bankAccountDto, bankAccount);
        return bankAccount;
    }

    public List<BankAccountDto> entitiesToDtos(List<BankAccount> bankAccounts) {
        return bankAccounts.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }


}