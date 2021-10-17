package com.flightapp.flightappadmin.controller;

import java.sql.Timestamp;
import java.util.List;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.flightappadmin.model.Airline;
import com.flightapp.flightappadmin.model.Inventory;
import com.flightapp.flightappadmin.model.Login;
import com.flightapp.flightappadmin.service.FlightappService;

@RestController
@RequestMapping("/api/v1.0/flight")
public class FlightappController{
	private static final Logger logger = LoggerFactory.getLogger(FlightappController.class);
	@Autowired  
	FlightappService flightService; 

	@PostMapping("/airline/inventory/add")  
	public ResponseEntity<List<Inventory>> addInventory(@RequestBody Inventory inventory)
	{
	   return flightService.addInventory(inventory);  
	}  
	
	@PutMapping("/airline/inventory/add")  
	public ResponseEntity<List<Inventory>> updateInventory(@RequestBody Inventory inventory)
	{
	   return flightService.updateInventory(inventory);  
	}  
	
	@PostMapping("/airline/register")  
	public ResponseEntity<List<Airline>> addAirline(@RequestBody Airline airline)
	{
	   return flightService.addAirline(airline);  
	}
	
	@PostMapping("/admin/login")
	public ResponseEntity<Login> login(@RequestBody Login login) {
		return flightService.loginAdmin(login);
	}
}


