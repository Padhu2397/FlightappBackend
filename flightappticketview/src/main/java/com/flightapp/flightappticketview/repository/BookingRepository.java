package com.flightapp.flightappticketview.repository;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.flightappticketview.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>  
{

	List<Booking> findByEmailId(String emailId);  
	List<Booking> findByPnr(int pnr);  


}  