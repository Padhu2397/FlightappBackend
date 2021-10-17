package com.flightapp.flightappadmin.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.flightappadmin.model.Airline;


public interface AirlineRepository extends JpaRepository<Airline, Integer>  
{  
	List<Airline> findByAirlineName(String airline);
}  