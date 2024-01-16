package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.BankAccountDto;

import java.util.List;
import java.util.UUID;

public interface IBankAccountService {
    BankAccountDto create(BankAccountDto bankAccountDto);

    BankAccountDto update(UUID id, BankAccountDto bankAccountDto);

    void remove(UUID id);

    void delete(UUID id);

    List<BankAccountDto> findAll();

    BankAccountDto findById(UUID id);
}
