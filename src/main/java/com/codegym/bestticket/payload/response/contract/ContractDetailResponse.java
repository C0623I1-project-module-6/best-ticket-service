package com.codegym.bestticket.payload.response.contract;

import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.entity.ticket.Ticket;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ContractDetailResponse {
    private UUID id;
    private Contract contract;
    private List<Ticket> tickets;
    private Double amount;
    private Boolean isDeleted;
}
