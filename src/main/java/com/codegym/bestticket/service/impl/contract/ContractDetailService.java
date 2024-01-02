package com.codegym.bestticket.service.impl.contract;

import com.codegym.bestticket.dto.request.contract.ContractDetailRequestDTO;
import com.codegym.bestticket.dto.response.contract.ContractDetailResponseDTO;
import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.entity.contract.ContractDetail;
import com.codegym.bestticket.entity.ticket.Ticket;
import com.codegym.bestticket.repository.IContractDetailRepository;
import com.codegym.bestticket.repository.IContractRepository;
import com.codegym.bestticket.repository.ITicketRepository;
import com.codegym.bestticket.service.IContractDetailService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
        Iterable<ContractDetail> contractDetails = iContractDetailRepository.findAllByContractId(contractId);
        double amount = 0.0;
        for (ContractDetail contractDetail : contractDetails) {
            if (!contractDetail.getIsDeleted()) {
                for (Ticket ticket : contractDetail.getTickets()) {
                    amount = ticket.getQuantity() * ticket.getPrice();
                }
            }
        }
        double finalAmount = amount;
        contract.ifPresent(value -> {
            value.setTotalAmount(finalAmount);
            iContractRepository.save(value);
        });
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
    public Optional<ContractDetailResponseDTO> findByContractIdAndId(UUID contractId, UUID id) {
        Optional<ContractDetail> contractDetailOptional = iContractDetailRepository.findByContractIdAndId(contractId, id);
        return getContractDetailResponseDTO(contractDetailOptional);
    }

    @Override
    public void save(ContractDetailRequestDTO contractDetailRequestDTO) {
        calculateAmount(contractDetailRequestDTO);
        updateContractAmount(contractDetailRequestDTO);
        saveContractDetail(contractDetailRequestDTO);
    }

    private void calculateAmount(ContractDetailRequestDTO contractDetailRequestDTO) {
        double amount = contractDetailRequestDTO.getTickets().listIterator().next().getQuantity()
                * contractDetailRequestDTO.getTickets().listIterator().next().getPrice();
        UUID contractId = contractDetailRequestDTO.getContract().getId();
        Iterable<ContractDetail> contractDetails = iContractDetailRepository.findAllByContractId(contractId);

        for (ContractDetail contractDetail : contractDetails) {
            if (!contractDetail.getIsDeleted()) {

            }
        }

        contractDetailRequestDTO.getContract().setTotalAmount(amount);
    }

    private void updateContractAmount(ContractDetailRequestDTO contractDetailRequestDTO) {
        Optional<Contract> optionalContract = iContractRepository.findById(contractDetailRequestDTO.getContract().getId());
        optionalContract.ifPresent(contract ->
                contract.setTotalAmount(contractDetailRequestDTO.getContract().getTotalAmount()));
    }

    private void saveContractDetail(ContractDetailRequestDTO contractDetailRequestDTO) {
        ContractDetail contractDetail = new ContractDetail();
        BeanUtils.copyProperties(contractDetailRequestDTO, contractDetail);
        iContractDetailRepository.save(contractDetail);
        setTicketContractDetail(contractDetail);
    }

    private void setTicketContractDetail(ContractDetail contractDetail) {
        for (Ticket ticket : contractDetail.getTickets()) {
            ticket.setContractDetail(contractDetail);
            iTicketRepository.save(ticket);
        }
    }

    @Override
    public void remove(UUID id) {
        Optional<ContractDetail> contractDetail = iContractDetailRepository.findById(id);
        contractDetail.ifPresent(value -> value.setIsDeleted(true));
        contractDetail.ifPresent(value -> value.getContract().setTotalAmount(0.0));
        contractDetail.ifPresent(iContractDetailRepository::save);
    }

    @Override
    public void delete(UUID id) {
        iContractDetailRepository.deleteById(id);
    }
}
