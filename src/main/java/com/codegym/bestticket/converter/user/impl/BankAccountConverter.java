package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IBankAccountConverter;
import com.codegym.bestticket.entity.user.BankAccount;
import com.codegym.bestticket.payload.request.user.BankAccountRequest;
import com.codegym.bestticket.payload.response.user.BankAccountResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BankAccountConverter implements IBankAccountConverter {

    public BankAccountResponse entityToDto(BankAccount bankAccount) {
        BankAccountResponse bankAccountResponse = new BankAccountResponse();
        BeanUtils.copyProperties(bankAccount, bankAccountResponse);
        return bankAccountResponse;

    }

    public BankAccount dtoToEntity(BankAccountRequest bankAccountRequest) {
        BankAccount bankAccount = new BankAccount();
        BeanUtils.copyProperties(bankAccountRequest, bankAccount);
        return bankAccount;
    }

    public List<BankAccountResponse> entitiesToDtos(List<BankAccount> bankAccounts) {
        return bankAccounts.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }


}