package com.flightapp.flightappticketview.service;

import java.sql.Timestamp;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightapp.flightappticketview.dao.FlightappDao;
import com.flightapp.flightappticketview.model.Booking;
@Service  
public class FlightappService   
{  
	@Autowired  
	FlightappDao flightappdao;  

public ResponseEntity<List<Booking>> getBookByPnr(int pnr)
{
	return flightappdao.getBookByPnr(pnr);
}
public ResponseEntity<List<Booking>> viewHistory(String emailId)
{
	return flightappdao.viewHistory(emailId);

}
}
