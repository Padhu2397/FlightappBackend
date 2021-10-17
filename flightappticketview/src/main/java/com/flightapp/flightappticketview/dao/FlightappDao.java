package com.flightapp.flightappticketview.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.flightapp.flightappticketview.model.Booking;
import com.flightapp.flightappticketview.repository.BookingRepository;

@Repository
public class FlightappDao{
	@Autowired
	BookingRepository bookingRepository;

	public ResponseEntity< List<Booking>> getBookByPnr(int pnr)	{  
		try {
			List<Booking> bookPnr = new ArrayList<Booking>();  
			bookingRepository.findByPnr(pnr).forEach(bookPnr::add);  		

	 if (bookPnr.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(bookPnr, HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	public ResponseEntity< List<Booking>> viewHistory(String emailId)	{  
		try {
			List<Booking> bookEmailId = new ArrayList<Booking>();  
			bookingRepository.findByEmailId(emailId).forEach(bookEmailId::add);  		

	 if (bookEmailId.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(bookEmailId, HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
}