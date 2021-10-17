package com.flightapp.flightappuser.repository;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.flightappuser.model.Inventory;  


public interface FlightappRepository extends JpaRepository<Inventory, Integer>  
{  
	
	 List<Inventory> findByFromPlaceAndToPlaceAndStartTimeStamp(String fromPlace, String toPlace,Timestamp startTimeStamp);
	 Inventory findByFlightNo(int flightNo);
}  