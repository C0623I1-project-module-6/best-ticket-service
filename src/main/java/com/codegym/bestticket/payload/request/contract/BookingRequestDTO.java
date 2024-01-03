package com.codegym.bestticket.payload.request.contract;

import com.codegym.bestticket.entity.user.customer.Customer;
import com.codegym.bestticket.entity.user.organizer.Organizer;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
<<<<<<<< HEAD:src/main/java/com/codegym/bestticket/payload/request/contract/ContractRequest.java
public class ContractRequest {
========
public class BookingRequestDTO {
>>>>>>>> 0e71ec23ebfe48dbf4c7fa61787efb3a2c2b954e:src/main/java/com/codegym/bestticket/payload/request/contract/BookingRequestDTO.java
    private UUID id;
    private String date;
    private Double totalAmount;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Customer customer;
    private Organizer organizer;
    private Boolean isDeleted;
}
