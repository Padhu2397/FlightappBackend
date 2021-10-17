package com.flightapp.flightappticketcancel.repository;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.flightappticketcancel.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>  
{
}  