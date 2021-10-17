package com.flightapp.flightappuser.repository;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.flightappuser.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>  
{  

}  