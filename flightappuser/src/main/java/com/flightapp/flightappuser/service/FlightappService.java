package com.flightapp.flightappuser.service;

import java.sql.Timestamp;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flightapp.flightappuser.dao.FlightappDao;
import com.flightapp.flightappuser.model.Booking;
import com.flightapp.flightappuser.model.BookingDetails;
import com.flightapp.flightappuser.model.Inventory;
import com.flightapp.flightappuser.model.Login;
@Service  
public class FlightappService  implements UserDetailsService 
{  
	@Autowired  
	FlightappDao flightappdao;  

public ResponseEntity<List<Inventory>> getAllFlight(String fromPlace, String toPlace, Timestamp startTimeStamp)
{
	return flightappdao.getAllFlight(fromPlace, toPlace, startTimeStamp);
}
public ResponseEntity<Booking> flightBooking(int flightNo,BookingDetails book)
{
	return flightappdao.flightBooking(flightNo, book);

}

public ResponseEntity<String> loginUser(Login login)
{
	return flightappdao.loginUser(login);

}
public ResponseEntity<Login> loginRegister(Login login)
{
	return flightappdao.loginRegister(login);

}
@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
   
	return flightappdao.loadUserByUsername(username);
}


}
