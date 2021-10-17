package com.flightapp.flightappadmin.repository;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.flightappadmin.model.Inventory;  


public interface FlightappRepository extends JpaRepository<Inventory, Integer>  
{  
	List<Inventory> findById(int flightNo);
}  