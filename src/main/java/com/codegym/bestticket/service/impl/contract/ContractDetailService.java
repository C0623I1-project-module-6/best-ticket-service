package com.codegym.bestticket.service.impl.contract;

import com.codegym.bestticket.dto.request.contract.BookingDetailRequestDTO;
import com.codegym.bestticket.dto.response.contract.BookingDetailResponseDTO;
import com.codegym.bestticket.entity.contract.Booking;
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
    public Iterable<BookingDetailResponseDTO> findAll() {
        Iterable<ContractDetail> contractDetails = iContractDetailRepository.findAll();
        return StreamSupport.stream(contractDetails.spliterator(), false)
                .filter(contractDetail -> !contractDetail.getIsDeleted())
                .map(contractDetail -> {
                    BookingDetailResponseDTO bookingDetailResponseDTO = new BookingDetailResponseDTO();
                    BeanUtils.copyProperties(contractDetail, bookingDetailResponseDTO);
                    return bookingDetailResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BookingDetailResponseDTO> findById(UUID id) {
        Optional<ContractDetail> contractDetailOptional = iContractDetailRepository.findById(id);
        return getContractDetailResponseDTO(contractDetailOptional);
    }

    private Optional<BookingDetailResponseDTO> getContractDetailResponseDTO(Optional<ContractDetail> contractDetailOptional) {
        if (contractDetailOptional.isPresent() && !contractDetailOptional.get().getIsDeleted()) {
            ContractDetail contractDetail = contractDetailOptional.get();
            BookingDetailResponseDTO bookingDetailResponseDTO = new BookingDetailResponseDTO();
            BeanUtils.copyProperties(contractDetail, bookingDetailResponseDTO);
            return Optional.of(bookingDetailResponseDTO);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Iterable<BookingDetailResponseDTO> findAllByContractId(UUID contractId) {
        Optional<Booking> contract = iContractRepository.findById(contractId);

        Iterable<ContractDetail> contractDetailsOfContract = iContractDetailRepository.findAllByContractId(contractId);
        updateContractTotalAmount(contractDetailsOfContract, contract);
        return StreamSupport.stream(contractDetailsOfContract.spliterator(), false)
                .filter(contractDetail -> !contractDetail.getIsDeleted())
                .map(contractDetail -> {
                    BookingDetailResponseDTO bookingDetailResponseDTO = new BookingDetailResponseDTO();
                    BeanUtils.copyProperties(contractDetail, bookingDetailResponseDTO);
                    return bookingDetailResponseDTO;
                })
                .collect(Collectors.toList());
    }

    private void updateContractTotalAmount(Iterable<ContractDetail> contractDetailsOfContract, Optional<Booking> contract) {
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
    public Optional<BookingDetailResponseDTO> findByContractIdAndId(UUID contractId, UUID id) {
        Optional<ContractDetail> contractDetailOptional = iContractDetailRepository.findByContractIdAndId(contractId, id);
        return getContractDetailResponseDTO(contractDetailOptional);
    }

    @Override
    public void save(BookingDetailRequestDTO bookingDetailRequestDTO) {
        Optional<Booking> contract = Optional.ofNullable(bookingDetailRequestDTO.getBooking());
        assert bookingDetailRequestDTO.getBooking() != null;
        Iterable<ContractDetail> contractDetailsOfContract = iContractDetailRepository.findAllByContractId(bookingDetailRequestDTO.getBooking().getId());
        calculateAmount(bookingDetailRequestDTO);
        updateContractTotalAmount(contractDetailsOfContract, contract);
        saveContractDetail(bookingDetailRequestDTO);
    }

    private void calculateAmount(BookingDetailRequestDTO bookingDetailRequestDTO) {

        double amount = 0.0;
        for (Ticket ticket : bookingDetailRequestDTO.getTickets()) {
            amount += ticket.getQuantity() * ticket.getPrice();
        }
        bookingDetailRequestDTO.getBooking().setTotalAmount(amount);
        Booking booking = bookingDetailRequestDTO.getBooking();
        Iterable<ContractDetail> contractDetails = iContractDetailRepository.findAllByContractId(booking.getId());
        updateContractTotalAmount(contractDetails, Optional.of(booking));
    }

    private void saveContractDetail(BookingDetailRequestDTO bookingDetailRequestDTO) {
        ContractDetail contractDetail = new ContractDetail();
        BeanUtils.copyProperties(bookingDetailRequestDTO, contractDetail);
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
            double totalAmount = value.getBooking().getTotalAmount() - value.getTickets().stream()
                    .mapToDouble(ticket -> ticket.getQuantity() * ticket.getPrice())
                    .sum();
            value.getBooking().setTotalAmount(totalAmount);
        });
        contractDetail.ifPresent(iContractDetailRepository::save);
    }

    @Override
    public void delete(UUID id) {
        iContractDetailRepository.deleteById(id);
    }
}