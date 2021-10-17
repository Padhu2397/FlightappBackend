package com.flightapp.flightappuser.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.flightapp.flightappuser.model.Login;
import com.flightapp.flightappuser.model.Booking;
import com.flightapp.flightappuser.model.BookingDetails;
import com.flightapp.flightappuser.model.Inventory;
import com.flightapp.flightappuser.repository.BookingRepository;
import com.flightapp.flightappuser.repository.FlightappRepository;
import com.flightapp.flightappuser.repository.LoginRepository;

@Repository
public class FlightappDao implements UserDetailsService{
	@Autowired  
	FlightappRepository flightappRepository;  
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	LoginRepository loginRepository;

	public ResponseEntity< List<Inventory>> getAllFlight(String fromPlace,String toPlace, Timestamp startTimeStamp)	{  
		try {
	List<Inventory> flight = new ArrayList<Inventory>();  
		flightappRepository.findByFromPlaceAndToPlaceAndStartTimeStamp(fromPlace, toPlace, startTimeStamp).forEach(flight::add);  
		

	 if (flight.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(flight, HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	public ResponseEntity<Booking> flightBooking(int flightNo, BookingDetails book)	{  
		
		try {
		Inventory invento = new Inventory();
		Booking bookFlight = new Booking();
		Random rand = new Random(); 
		int newpnr = Math.abs(rand.nextInt());
        invento = flightappRepository.findByFlightNo(flightNo);
			bookFlight.setUserName(book.getUserName());
			bookFlight.setEmailId(book.getEmailId());
			bookFlight.setTotalSeat(book.getTotalSeat());
            bookFlight.setMeal(book.getMeal());
			bookFlight.setFlightNo(flightNo);
			bookFlight.setAirlineName(invento.getAirlineName());
			bookFlight.setEndTimeStamp(invento.getEndTimeStamp());
			bookFlight.setStartTimeStamp(invento.getStartTimeStamp());
			bookFlight.setFromPlace(invento.getFromPlace());
			bookFlight.setToPlace(invento.getToPlace());
            bookFlight.setTicketCost(invento.getTicketCost());
            bookFlight.setTotalCost(invento.getTicketCost()*book.getTotalSeat());
            bookFlight.setPnr(newpnr);
			bookingRepository.save(bookFlight);
			return new ResponseEntity<>(bookFlight, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

	public ResponseEntity<String> loginUser(Login login) {
		List<Login> loginOk = loginRepository.findAll();
        for (Login user : loginOk) {
            if ((user.getUserName().equals(login.getUserName()))&&(user.getPassWord().equals(login.getPassWord()))) {
               
       		 return new ResponseEntity<>(HttpStatus.OK);
            }
        }
  		 return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
    
public ResponseEntity<Login> loginRegister(Login login)	{  
		
		try {
//		Login loginData = new Login();
//        loginData.setUserName(login.getUserName());
//        loginData.setEmailId(login.getEmailId());
//        loginData.setPassWord(login.getPassWord());
			Random rand = new Random(); 
			int newpnr = Math.abs(rand.nextInt());
		Login data = new Login();
		data.setUserName(login.getUserName());
		data.setPassWord(login.getPassWord());
		data.setEmailId(login.getEmailId());
		data.setId(newpnr);
		loginRepository.save(data);
			return new ResponseEntity<>(login, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Login login = loginRepository.findByUserName(username);
	return new User(login.getUserName(),login.getPassWord(),new ArrayList<>());
}
	
}
