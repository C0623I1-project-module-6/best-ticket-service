package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.user.BankAccountRequest;
import com.codegym.bestticket.payload.response.user.BankAccountResponse;

import java.util.List;
import java.util.UUID;

public interface IBankAccountService {
    BankAccountResponse create(BankAccountRequest bankAccountRequestDTO);

    BankAccountResponse update(UUID id, BankAccountRequest bankAccountRequestDTO);

    void remove(UUID id);

    void delete(UUID id);

    List<BankAccountResponse> findAll();

    BankAccountResponse findById(UUID id);
}
