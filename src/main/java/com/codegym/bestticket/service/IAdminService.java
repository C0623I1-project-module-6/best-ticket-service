package com.codegym.bestticket.service;

import com.codegym.bestticket.entity.booking.Booking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAdminService {
    Page<Booking> showBookings(Pageable pageable);
}
