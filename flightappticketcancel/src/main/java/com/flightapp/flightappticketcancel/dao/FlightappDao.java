package com.flightapp.flightappticketcancel.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.flightapp.flightappticketcancel.model.Booking;
import com.flightapp.flightappticketcancel.repository.BookingRepository;

@Repository
public class FlightappDao{
	@Autowired
	BookingRepository bookingRepository;

	public ResponseEntity< List<Booking>> getBookByPnr(int pnr)	{  
		try {
			bookingRepository.deleteById(pnr);  		

	      return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
		
}