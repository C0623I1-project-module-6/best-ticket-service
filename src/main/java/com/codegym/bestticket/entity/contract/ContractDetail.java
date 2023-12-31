package com.codegym.bestticket.entity.contract;

import com.codegym.bestticket.entity.ticket.Ticket;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "contract_details")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "ticket_price", columnDefinition = "DECIMAL(10, 2)")
    private Double ticketPrice;

    @Column(name = "is_delete")
    private Boolean isDelete;
}
