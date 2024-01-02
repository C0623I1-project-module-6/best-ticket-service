package com.codegym.bestticket.service.impl.contract;

import com.codegym.bestticket.constant.EContractStatus;
import com.codegym.bestticket.dto.request.contract.ContractRequestDTO;
import com.codegym.bestticket.dto.response.contract.ContractResponseDTO;
import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.repository.IContractRepository;
import com.codegym.bestticket.service.IContractService;
import com.google.api.client.util.DateTime;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
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
    public Iterable<ContractResponseDTO> findAll() {
        Iterable<Contract> contracts = iContractRepository.findAll();
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    ContractResponseDTO contractResponseDTO = new ContractResponseDTO();
                    BeanUtils.copyProperties(contract, contractResponseDTO);
                    return contractResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ContractResponseDTO> findById(UUID id) {
        Optional<Contract> contractOptional = iContractRepository.findById(id);
        if (contractOptional.isPresent() && !contractOptional.get().getIsDeleted()) {
            Contract contract = contractOptional.get();
            ContractResponseDTO contractResponseDTO = new ContractResponseDTO();
            BeanUtils.copyProperties(contract, contractResponseDTO);
            return Optional.of(contractResponseDTO);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void save(ContractRequestDTO contractRequestDTO) {
        if (contractRequestDTO.getId() == null) {
            contractRequestDTO.setDate(String.valueOf(Timestamp.from(Instant.now())));
            contractRequestDTO.setCreatedAt(Timestamp.from(Instant.now()));
        }
        contractRequestDTO.setUpdatedAt(Timestamp.from(Instant.now()));
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractRequestDTO, contract);
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
    public Iterable<ContractResponseDTO> searchAllByCustomer(Customer customer) {
        Iterable<Contract> contracts = iContractRepository.searchAllByCustomer(customer);
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    ContractResponseDTO contractResponseDTO = new ContractResponseDTO();
                    BeanUtils.copyProperties(contract, contractResponseDTO);
                    return contractResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<ContractResponseDTO> searchAllByOrganizer(Organizer organizer) {
        Iterable<Contract> contracts = iContractRepository.searchAllByOrganizer(organizer);
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    ContractResponseDTO contractResponseDTO = new ContractResponseDTO();
                    BeanUtils.copyProperties(contract, contractResponseDTO);
                    return contractResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<ContractResponseDTO> searchByInput(String input) {
        Iterable<Contract> contracts = iContractRepository.findAll();
        List<ContractResponseDTO> contractResponseDTOS = new ArrayList<>();
        for (Contract contract : contracts) {
            if (input.contains(contract.getCustomer().getFullName())
                    || input.contains(contract.getOrganizer().getName())) {
                ContractResponseDTO contractResponseDTO = new ContractResponseDTO();
                BeanUtils.copyProperties(contract, contractResponseDTO);
                contractResponseDTOS.add(contractResponseDTO);
            }
        }
        return contractResponseDTOS;
    }

}
