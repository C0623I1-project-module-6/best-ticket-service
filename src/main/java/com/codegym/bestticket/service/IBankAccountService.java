package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.BankAccountDto;
import com.codegym.bestticket.payload.response.user.BankAccountResponse;

import java.util.List;
import java.util.UUID;

public interface IBankAccountService {
    BankAccountResponse create(BankAccountDto bankAccountDtoDTO);

    BankAccountResponse update(UUID id, BankAccountDto bankAccountDtoDTO);

    void remove(UUID id);

    void delete(UUID id);

    List<BankAccountResponse> findAll();

    BankAccountResponse findById(UUID id);
}
