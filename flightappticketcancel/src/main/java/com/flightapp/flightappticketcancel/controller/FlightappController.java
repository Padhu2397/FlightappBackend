package com.flightapp.flightappticketcancel.controller;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.flightappticketcancel.model.Booking;
import com.flightapp.flightappticketcancel.service.FlightappService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1.0/flight")
public class FlightappController{
	private static final Logger logger = LoggerFactory.getLogger(FlightappController.class);
	@Autowired  
	FlightappService flightService; 
	@DeleteMapping("/booking/cancel/{pnr}")  
	public ResponseEntity< List<Booking>> getBookByPnr(@PathVariable("pnr") int pnr)
   
	{  
	logger.info("entered search Flight");
	 return flightService.getBookByPnr(pnr);  
	}  

	  
}


