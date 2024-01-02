package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.bank_acount.BankAccountRequestDTO;
import com.codegym.bestticket.dto.response.bank_account.BankAccountResponseDTO;

import java.util.List;
import java.util.UUID;

public interface IBankAccountService {
    List<BankAccountResponseDTO> findAll();

    BankAccountResponseDTO findById(UUID id);

    BankAccountResponseDTO create(BankAccountRequestDTO bankAccountRequestDTO);

    BankAccountResponseDTO update(UUID id, BankAccountRequestDTO bankAccountRequestDTO);

    void remove(UUID id);

    void delete(UUID id);

}
