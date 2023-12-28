package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.dto.ContractDTO;
import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.repository.IContractRepository;
import com.codegym.bestticket.service.IContractService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ContractService implements IContractService {
    private final IContractRepository iContractRepository;

    @Override
    public Iterable<ContractDTO> findAll() {
        Iterable<Contract> contracts = iContractRepository.findAll();
        ArrayList<ContractDTO> contractDTOs = new ArrayList<>();
        for (Contract contract : contracts) {
            ContractDTO contractDTO = new ContractDTO();
            try {
                BeanUtils.copyProperties(contract, contractDTO);
                contractDTOs.add(contractDTO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return contractDTOs;
    }

    @Override
    public Optional<ContractDTO> findById(UUID id) {
        Optional<Contract> contractOptional = iContractRepository.findById(id);
        if (contractOptional.isPresent()) {
            Contract contract = contractOptional.get();
            ContractDTO contractDTO = new ContractDTO();
            BeanUtils.copyProperties(contract, contractDTO);
            return Optional.of(contractDTO);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void save(ContractDTO contractDTO) {
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDTO, contract);
        iContractRepository.save(contract);
    }

    @Override
    public void remove(UUID id) {

    }

    @Override
    public void update(ContractDTO contractDTO) {
        Optional<ContractDTO> optionalContractDTO = findById(contractDTO.getId());
        System.out.println(optionalContractDTO);
    }
}
