package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.BankAccount;
import com.codegym.bestticket.dto.user.BankAccountDto;

import java.util.List;

public interface IBankAccountConverter {
    BankAccountDto entityToDto(BankAccount bankAccount);

    BankAccount dtoToEntity(BankAccountDto bankAccountDtoDTO);

    List<BankAccountDto> entitiesToDtos(List<BankAccount> bankAccounts);
}
