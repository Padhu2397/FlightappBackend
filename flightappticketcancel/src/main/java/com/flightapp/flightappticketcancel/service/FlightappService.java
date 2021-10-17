package com.flightapp.flightappticketcancel.service;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightapp.flightappticketcancel.dao.FlightappDao;
import com.flightapp.flightappticketcancel.model.Booking;
@Service  
public class FlightappService   
{  
	@Autowired  
	FlightappDao flightappdao;  

public ResponseEntity<List<Booking>> getBookByPnr(int pnr)
{
	return flightappdao.getBookByPnr(pnr);
}
}
