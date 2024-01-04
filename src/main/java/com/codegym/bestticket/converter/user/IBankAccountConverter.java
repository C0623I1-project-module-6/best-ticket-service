package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.BankAccount;
import com.codegym.bestticket.payload.request.user.BankAccountRequest;
import com.codegym.bestticket.payload.response.user.BankAccountResponse;

import java.util.List;

public interface IBankAccountConverter {
    BankAccountResponse entityToDto(BankAccount bankAccount);

    BankAccount dtoToEntity(BankAccountRequest bankAccountRequestDTO);

    List<BankAccountResponse> entitiesToDtos(List<BankAccount> bankAccounts);
}
