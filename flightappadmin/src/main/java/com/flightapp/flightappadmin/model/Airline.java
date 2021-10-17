package com.flightapp.flightappadmin.model;

import java.sql.Timestamp;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


@Entity  
 
@Table  
public class Airline  
{  
  
@Id  
@Column  
private int id;  
@Column  
private String airlineName;  
@Column
private String contactNo;  
@Column
private String address;

public String getAirlineName() {
	return airlineName;
}
public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getContactNo() {
	return contactNo;
}
public void setMeal(String contactNo) {
	this.contactNo = contactNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}

