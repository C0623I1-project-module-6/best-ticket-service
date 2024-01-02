package com.codegym.bestticket.dto.request.contract;

import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.entity.ticket.Ticket;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ContractDetailRequestDTO {
    private UUID id;
    private Contract contract;
    private List<Ticket> tickets;
    private Integer quantity;
    private Double ticketPrice;
    private Boolean isDeleted;
}
