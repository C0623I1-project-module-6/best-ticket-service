package com.codegym.bestticket.service.impl.contract;

import com.codegym.bestticket.dto.request.contract.ContractDetailRequestDTO;
import com.codegym.bestticket.dto.response.contract.ContractDetailResponseDTO;
import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.entity.contract.ContractDetail;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.repository.contract.IContractDetailRepository;
import com.codegym.bestticket.repository.contract.IContractRepository;
import com.codegym.bestticket.repository.ticket.ITicketRepository;
import com.codegym.bestticket.service.IContractDetailService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Log
@Service
public class ContractDetailService implements IContractDetailService {
    private final IContractDetailRepository iContractDetailRepository;
    private final IContractRepository iContractRepository;
    private final ITicketRepository iTicketRepository;

    @Override
    public Iterable<ContractDetailResponseDTO> findAll() {
        Iterable<ContractDetail> contractDetails = iContractDetailRepository.findAll();
        return StreamSupport.stream(contractDetails.spliterator(), false)
                .filter(contractDetail -> !contractDetail.getIsDeleted())
                .map(contractDetail -> {
                    ContractDetailResponseDTO contractDetailResponseDTO = new ContractDetailResponseDTO();
                    BeanUtils.copyProperties(contractDetail, contractDetailResponseDTO);
                    return contractDetailResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ContractDetailResponseDTO> findById(UUID id) {
        Optional<ContractDetail> contractDetailOptional = iContractDetailRepository.findById(id);
        return getContractDetailResponseDTO(contractDetailOptional);
    }

    private Optional<ContractDetailResponseDTO> getContractDetailResponseDTO(Optional<ContractDetail> contractDetailOptional) {
        if (contractDetailOptional.isPresent() && !contractDetailOptional.get().getIsDeleted()) {
            ContractDetail contractDetail = contractDetailOptional.get();
            ContractDetailResponseDTO contractDetailResponseDTO = new ContractDetailResponseDTO();
            BeanUtils.copyProperties(contractDetail, contractDetailResponseDTO);
            return Optional.of(contractDetailResponseDTO);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Iterable<ContractDetailResponseDTO> findAllByContractId(UUID contractId) {
        Optional<Contract> contract = iContractRepository.findById(contractId);
        Iterable<ContractDetail> contractDetailsOfContract = iContractDetailRepository.findAllByContractId(contractId);
        updateContractTotalAmount(contractDetailsOfContract, contract);
        return StreamSupport.stream(contractDetailsOfContract.spliterator(), false)
                .filter(contractDetail -> !contractDetail.getIsDeleted())
                .map(contractDetail -> {
                    ContractDetailResponseDTO contractDetailResponseDTO = new ContractDetailResponseDTO();
                    BeanUtils.copyProperties(contractDetail, contractDetailResponseDTO);
                    return contractDetailResponseDTO;
                })
                .collect(Collectors.toList());
    }

    private void updateContractTotalAmount(Iterable<ContractDetail> contractDetailsOfContract, Optional<Contract> contract) {
        double amount = 0.0;
        for (ContractDetail contractDetail : contractDetailsOfContract) {
            if (!contractDetail.getIsDeleted()) {
                amount = contractDetail.getTickets().stream()
                        .mapToDouble(ticket -> ticket.getQuantity() * ticket.getPrice())
                        .sum();
            }
        }
        double finalAmount = amount;
        contract.ifPresent(value -> {
            value.setTotalAmount(finalAmount);
            iContractRepository.save(value);
        });
    }

    @Override
    public Optional<ContractDetailResponseDTO> findByContractIdAndId(UUID contractId, UUID id) {
        Optional<ContractDetail> contractDetailOptional = iContractDetailRepository.findByContractIdAndId(contractId, id);
        return getContractDetailResponseDTO(contractDetailOptional);
    }

    @Override
    public void save(ContractDetailRequestDTO contractDetailRequestDTO) {
        Optional<Contract> contract = Optional.ofNullable(contractDetailRequestDTO.getContract());
        assert contractDetailRequestDTO.getContract() != null;
        Iterable<ContractDetail> contractDetailsOfContract = iContractDetailRepository.findAllByContractId(contractDetailRequestDTO.getContract().getId());
        calculateAmount(contractDetailRequestDTO);
        updateContractTotalAmount(contractDetailsOfContract, contract);
        saveContractDetail(contractDetailRequestDTO);
    }

    private void calculateAmount(ContractDetailRequestDTO contractDetailRequestDTO) {
        double amount = 0.0;
        for (Ticket ticket : contractDetailRequestDTO.getTickets()) {
            amount += ticket.getQuantity() * ticket.getPrice();
        }
        contractDetailRequestDTO.getContract().setTotalAmount(amount);
        Contract contract = contractDetailRequestDTO.getContract();
        Iterable<ContractDetail> contractDetails = iContractDetailRepository.findAllByContractId(contract.getId());
        updateContractTotalAmount(contractDetails, Optional.of(contract));
    }

    private void saveContractDetail(ContractDetailRequestDTO contractDetailRequestDTO) {
        ContractDetail contractDetail = new ContractDetail();
        BeanUtils.copyProperties(contractDetailRequestDTO, contractDetail);
        iContractDetailRepository.save(contractDetail);
        setTicketContractDetail(contractDetail);
    }

    private void setTicketContractDetail(ContractDetail contractDetail) {
        List<Ticket> allTickets = iTicketRepository.findAll();
        contractDetail.getTickets().forEach(contractTicket -> allTickets.stream()
                .filter(ticket -> ticket.getId().equals(contractTicket.getId()))
                .findFirst()
                .ifPresent(ticket -> {
                    BeanUtils.copyProperties(ticket, contractTicket);
                    contractTicket.setContractDetail(contractDetail);
                    iTicketRepository.save(contractTicket);
                }));
    }

    @Override
    public void remove(UUID id) {
        Optional<ContractDetail> contractDetail = iContractDetailRepository.findById(id);
        contractDetail.ifPresent(value -> value.setIsDeleted(true));
        contractDetail.ifPresent(value -> {
            double totalAmount = value.getContract().getTotalAmount() - value.getTickets().stream()
                    .mapToDouble(ticket -> ticket.getQuantity() * ticket.getPrice())
                    .sum();
            value.getContract().setTotalAmount(totalAmount);
        });
        contractDetail.ifPresent(iContractDetailRepository::save);
    }

    @Override
    public void delete(UUID id) {
        iContractDetailRepository.deleteById(id);
    }
}