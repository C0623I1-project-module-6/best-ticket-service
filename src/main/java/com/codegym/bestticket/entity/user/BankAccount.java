package com.codegym.bestticket.entity.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bank_accounts")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "account_name", length = 50,nullable = false)
    private String accountName;
    @Column(name = "account_number", length = 20,nullable = false,unique = true)
    private String accountNumber;
    @Column(name = "bank_name",length = 100, nullable = false)
    private String bankName;
    @Column(length = 100)
    private String branch;
    private Boolean is_delete;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
