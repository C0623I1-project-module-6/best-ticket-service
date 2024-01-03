package com.codegym.bestticket.repository.bank_account;

import com.codegym.bestticket.entity.bank_account.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IBankAccountRepository extends JpaRepository<BankAccount, UUID> {
    List<BankAccount> findAllByIsDeletedFalse();

    Optional<BankAccount> findByIdAndIsDeletedFalse(UUID id);
}
