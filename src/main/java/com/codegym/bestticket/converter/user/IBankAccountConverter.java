package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.BankAccount;
import com.codegym.bestticket.dto.user.BankAccountDto;
import com.codegym.bestticket.payload.response.user.BankAccountResponse;

import java.util.List;

public interface IBankAccountConverter {
    BankAccountResponse entityToDto(BankAccount bankAccount);

    BankAccount dtoToEntity(BankAccountDto bankAccountDtoDTO);

    List<BankAccountResponse> entitiesToDtos(List<BankAccount> bankAccounts);
}
