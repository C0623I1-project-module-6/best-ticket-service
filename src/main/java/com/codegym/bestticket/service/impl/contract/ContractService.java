package com.codegym.bestticket.service.impl.contract;

import com.codegym.bestticket.constant.EContractStatus;
import com.codegym.bestticket.dto.request.contract.BookingRequestDTO;
import com.codegym.bestticket.dto.response.contract.BookingResponseDTO;
import com.codegym.bestticket.entity.contract.Booking;
import com.codegym.bestticket.entity.customer.Customer;
import com.codegym.bestticket.entity.organizer.Organizer;
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
    public Iterable<BookingResponseDTO> findAll() {
        Iterable<Booking> contracts = iContractRepository.findAll();
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    BookingResponseDTO bookingResponseDTO = new BookingResponseDTO();
                    BeanUtils.copyProperties(contract, bookingResponseDTO);
                    return bookingResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BookingResponseDTO> findById(UUID id) {
        Optional<Booking> contractOptional = iContractRepository.findById(id);
        if (contractOptional.isPresent() && !contractOptional.get().getIsDeleted()) {
            Booking booking = contractOptional.get();
            BookingResponseDTO bookingResponseDTO = new BookingResponseDTO();
            BeanUtils.copyProperties(booking, bookingResponseDTO);
            return Optional.of(bookingResponseDTO);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void save(BookingRequestDTO contractRequestDTO) {
        if (contractRequestDTO.getId() == null) {
            contractRequestDTO.setDate(String.valueOf(Timestamp.from(Instant.now())));
            contractRequestDTO.setCreatedAt(Timestamp.from(Instant.now()));
        }
        contractRequestDTO.setUpdatedAt(Timestamp.from(Instant.now()));
        Booking booking = new Booking();
        BeanUtils.copyProperties(contractRequestDTO, booking);
        iContractRepository.save(booking);
    }

    @Override
    public void remove(UUID id) {
        Optional<Booking> contract = iContractRepository.findById(id);
        contract.ifPresent(value -> value.setStatus(String.valueOf(EContractStatus.INACTIVE)));
        contract.ifPresent(value -> value.setIsDeleted(true));
        contract.ifPresent(iContractRepository::save);
    }

    @Override
    public void delete(UUID id) {
        iContractRepository.deleteById(id);
    }

    @Override
    public Iterable<BookingResponseDTO> searchAllByCustomer(Customer customer) {
        Iterable<Booking> contracts = iContractRepository.searchAllByCustomer(customer);
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    BookingResponseDTO bookingResponseDTO = new BookingResponseDTO();
                    BeanUtils.copyProperties(contract, bookingResponseDTO);
                    return bookingResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<BookingResponseDTO> searchAllByOrganizer(Organizer organizer) {
        Iterable<Booking> contracts = iContractRepository.searchAllByOrganizer(organizer);
        return StreamSupport.stream(contracts.spliterator(), false)
                .filter(contract -> !contract.getIsDeleted())
                .map(contract -> {
                    BookingResponseDTO bookingResponseDTO = new BookingResponseDTO();
                    BeanUtils.copyProperties(contract, bookingResponseDTO);
                    return bookingResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<BookingResponseDTO> searchByInput(String input) {
        Iterable<Booking> contracts = iContractRepository.findAll();
        List<BookingResponseDTO> bookingResponseDTOS = new ArrayList<>();
        for (Booking booking : contracts) {
            if (input.contains(booking.getCustomer().getFullName())
                    || input.contains(booking.getOrganizer().getName())) {
                BookingResponseDTO bookingResponseDTO = new BookingResponseDTO();
                BeanUtils.copyProperties(booking, bookingResponseDTO);
                bookingResponseDTOS.add(bookingResponseDTO);
            }
        }
        return bookingResponseDTOS;
    }

}
