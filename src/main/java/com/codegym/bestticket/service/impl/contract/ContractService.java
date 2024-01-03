package com.codegym.bestticket.service.impl.contract;

import com.codegym.bestticket.constant.EContractStatus;
import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.entity.user.customer.Customer;
import com.codegym.bestticket.entity.user.organizer.Organizer;
import com.codegym.bestticket.payload.request.contract.ContractRequest;
import com.codegym.bestticket.payload.response.contract.ContractResponse;
import com.codegym.bestticket.repository.contract.IContractRepository;
import com.codegym.bestticket.service.IContractService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Log
@Service
public class ContractService implements IContractService {
    private final IContractRepository iContractRepository;

    @Override
    public Iterable<ContractResponse> findAll() {
        Iterable<Contract> contracts = iContractRepository.findAll();
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    ContractResponse contractResponse = new ContractResponse();
                    BeanUtils.copyProperties(contract, contractResponse);
                    return contractResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ContractResponse> findById(UUID id) {
        Optional<Contract> contractOptional = iContractRepository.findById(id);
        if (contractOptional.isPresent() && !contractOptional.get().getIsDeleted()) {
            Contract contract = contractOptional.get();
            ContractResponse contractResponse = new ContractResponse();
            BeanUtils.copyProperties(contract, contractResponse);
            return Optional.of(contractResponse);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void save(ContractRequest contractRequest) {
        if (contractRequest.getId() == null) {
            contractRequest.setDate(String.valueOf(Timestamp.from(Instant.now())));
            contractRequest.setCreatedAt(Timestamp.from(Instant.now()));
        }
        contractRequest.setUpdatedAt(Timestamp.from(Instant.now()));
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractRequest, contract);
        iContractRepository.save(contract);
    }

    @Override
    public void remove(UUID id) {
        Optional<Contract> contract = iContractRepository.findById(id);
        contract.ifPresent(value -> value.setStatus(String.valueOf(EContractStatus.INACTIVE)));
        contract.ifPresent(value -> value.setIsDeleted(true));
        contract.ifPresent(iContractRepository::save);
    }

    @Override
    public void delete(UUID id) {
        iContractRepository.deleteById(id);
    }

    @Override
    public Iterable<ContractResponse> searchAllByCustomer(Customer customer) {
        Iterable<Contract> contracts = iContractRepository.searchAllByCustomer(customer);
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    ContractResponse contractResponse = new ContractResponse();
                    BeanUtils.copyProperties(contract, contractResponse);
                    return contractResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<ContractResponse> searchAllByOrganizer(Organizer organizer) {
        Iterable<Contract> contracts = iContractRepository.searchAllByOrganizer(organizer);
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    ContractResponse contractResponse = new ContractResponse();
                    BeanUtils.copyProperties(contract, contractResponse);
                    return contractResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<ContractResponse> searchByInput(String input) {
        Iterable<Contract> contracts = iContractRepository.findAll();
        List<ContractResponse> contractResponses = new ArrayList<>();
        for (Contract contract : contracts) {
            if (input.contains(contract.getCustomer().getFullName())
                    || input.contains(contract.getOrganizer().getName())) {
                ContractResponse contractResponse = new ContractResponse();
                BeanUtils.copyProperties(contract, contractResponse);
                contractResponses.add(contractResponse);
            }
        }
        return contractResponses;
    }

}
