package com.codegym.bestticket.entity.contract;

import com.codegym.bestticket.entity.ticket.Ticket;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contract_details")
public class   ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;
    @OneToMany(mappedBy = "contractDetail")
    private List<Ticket> tickets;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "ticket_price")
    private Double ticketPrice;
}
