package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.contract.BookingRequestDTO;
import com.codegym.bestticket.dto.response.contract.BookingResponseDTO;
import com.codegym.bestticket.entity.customer.Customer;
import com.codegym.bestticket.entity.organizer.Organizer;

import java.util.Optional;
import java.util.UUID;

public interface IContractService {
    Iterable<BookingResponseDTO> findAll();

    Optional<BookingResponseDTO> findById(UUID id);

    void save(BookingRequestDTO contractRequestDTO);

    void remove(UUID id);

    void delete(UUID id);

    Iterable<BookingResponseDTO> searchAllByCustomer(Customer customer);

    Iterable<BookingResponseDTO> searchAllByOrganizer(Organizer organizer);

    Iterable<BookingResponseDTO> searchByInput(String input);
}
