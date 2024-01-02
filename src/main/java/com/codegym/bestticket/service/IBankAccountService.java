package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.response.user.BankAccountResponseDTO;

import java.util.UUID;

public interface IBankAccountService {
    Iterable<BankAccountResponseDTO> getAllBankAccount();
    BankAccountResponseDTO getBankAccountById(UUID id);
}
