package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.BankAccount;
import com.codegym.bestticket.payload.request.bank_acount.BankAccountRequestDTO;
import com.codegym.bestticket.payload.response.bank_account.BankAccountResponseDTO;

import java.util.List;

public interface IBankAccountConverter {
    BankAccountResponseDTO entityToDto(BankAccount bankAccount);

    BankAccount dtoToEntity(BankAccountRequestDTO bankAccountRequestDTO);

    List<BankAccountResponseDTO> entitiesToDtos(List<BankAccount> bankAccounts);
}
