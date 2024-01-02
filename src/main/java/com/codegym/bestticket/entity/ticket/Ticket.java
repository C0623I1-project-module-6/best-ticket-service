package com.codegym.bestticket.entity.ticket;

import com.codegym.bestticket.entity.contract.ContractDetail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "ticket_code")
    private String ticketCode;

    private String seat;

    private String time;

    private String location;

    private String promotion;

    private String barcode;
    private Long quantity;

    private Boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "contract_detail_id")
    private ContractDetail contractDetail;
    @ManyToOne
    @JoinColumn(name = "ticket_type_id", nullable = false)
    @JsonIgnore
    private TicketType ticketType;

}
