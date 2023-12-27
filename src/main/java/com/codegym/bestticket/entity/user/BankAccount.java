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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "account_name", length = 50,nullable = false)
    private String accountName;
    @Column(name = "account_number", length = 20,nullable = false,unique = true)
    private String accountNumber;
    @Column(name = "bank_name",length = 100, nullable = false)
    private String bankName;
    @Column(name = "branch", length = 100)
    private String branch;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
