package com.codegym.bestticket.converter.bank_account;

import com.codegym.bestticket.payload.request.BankAccountRequest;
import com.codegym.bestticket.payload.response.BankAccountResponse;
import com.codegym.bestticket.entity.bank_account.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BankAccountConverter {
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
