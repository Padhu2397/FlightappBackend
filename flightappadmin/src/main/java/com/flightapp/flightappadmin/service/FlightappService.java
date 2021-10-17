package com.flightapp.flightappadmin.service;

import java.sql.Timestamp;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightapp.flightappadmin.dao.FlightappDao;
import com.flightapp.flightappadmin.model.Airline;
import com.flightapp.flightappadmin.model.Inventory;
import com.flightapp.flightappadmin.model.Login;
@Service  
public class FlightappService
{  
	@Autowired  
	FlightappDao flightappdao;  

public ResponseEntity<List<Inventory>> addInventory(Inventory inventory)
{
	return flightappdao.addInventory(inventory);
}

public ResponseEntity<List<Inventory>> updateInventory(Inventory inventory)
{
	return flightappdao.updateInventory(inventory);
}

public ResponseEntity<Login> loginAdmin(Login login)
{
	return flightappdao.loginAdmin(login);
}

public ResponseEntity<List<Airline>> addAirline(Airline airline)
{
	return flightappdao.addAirline(airline);
}

}
