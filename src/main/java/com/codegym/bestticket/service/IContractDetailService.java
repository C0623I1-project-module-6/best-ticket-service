package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.contract.BookingDetailRequestDTO;
import com.codegym.bestticket.dto.response.contract.BookingDetailResponseDTO;

import java.util.Optional;
import java.util.UUID;

public interface IContractDetailService {
    Iterable<BookingDetailResponseDTO> findAll();
    Optional<BookingDetailResponseDTO> findById(UUID id);
    Iterable<BookingDetailResponseDTO> findAllByContractId(UUID contractId);
    Optional<BookingDetailResponseDTO> findByContractIdAndId(UUID contractId, UUID id);
    void save(BookingDetailRequestDTO bookingDetailRequestDTO);
    void remove(UUID id);
    void delete(UUID id);
}
