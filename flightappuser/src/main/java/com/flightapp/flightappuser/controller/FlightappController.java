package com.flightapp.flightappuser.controller;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.flightappuser.model.Login;
import com.flightapp.flightappuser.model.Booking;
import com.flightapp.flightappuser.model.BookingDetails;
import com.flightapp.flightappuser.model.Inventory;
import com.flightapp.flightappuser.service.FlightappService;
import com.flightapp.flightappuser.util.FlightappUtil;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1.0/flight")
public class FlightappController{
	private static final Logger logger = LoggerFactory.getLogger(FlightappController.class);
	@Autowired  
	FlightappService flightService; 
	  @Autowired
	    private FlightappUtil flightapputil;
	  @Autowired
	    private AuthenticationManager authenticationManager;
	@PostMapping("/search")  
	public ResponseEntity< List<Inventory>> getAllFlight(@RequestParam(required = true)
	String fromPlace, @RequestParam String toPlace, @RequestParam Timestamp startTimeStamp )  
   
	{  
	logger.info("entered search Flight"+fromPlace);
	 return flightService.getAllFlight(fromPlace, toPlace, startTimeStamp);  
	}  

	@PostMapping("/booking/{flightNo}")  
	public ResponseEntity<Booking> bookFlight(@PathVariable("flightNo") int flightNo, @RequestBody (required = true) BookingDetails book  )   
	{  
	   return flightService.flightBooking(flightNo,book);  
	}  
	
	@PostMapping("/user/login")
	public ResponseEntity<String> loginUser(@RequestBody Login login) {
		return flightService.loginUser(login);
	}
	
	@PostMapping("/user/register")
	public ResponseEntity<Login> loginRegister(@RequestBody Login login) {
		return flightService.loginRegister(login);
	}
	
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody Login authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassWord())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return flightapputil.generateToken(authRequest.getUserName());
    }
}


