package com.flightapp.flightappticketview.controller;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.flightappticketview.model.Booking;
import com.flightapp.flightappticketview.service.FlightappService;

@RestController
@RequestMapping("/api/v1.0/flight")
@CrossOrigin("*")
public class FlightappController{
	private static final Logger logger = LoggerFactory.getLogger(FlightappController.class);
	@Autowired  
	FlightappService flightService; 
	@GetMapping("/ticket/{pnr}")  
	public ResponseEntity< List<Booking>> getBookByPnr(@PathVariable("pnr") int pnr)
   
	{  
	logger.info("entered search Flight");
	 return flightService.getBookByPnr(pnr);  
	}  

	@GetMapping("/booking/history/{emailId}")  
	public ResponseEntity<List<Booking>> viewHistory(@PathVariable("emailId") String emailId)   
	{  
	   return flightService.viewHistory(emailId);  
	}  
}


