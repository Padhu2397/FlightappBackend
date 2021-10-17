package com.flightapp.flightappticketview.model;

import java.sql.Timestamp;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


  
@Entity  
 
@Table  
public class Booking  
{  
  

@Column  
 private int flightNo;  
@Column  
 private String airlineName;  
@Column  
private String fromPlace;  
@Column  
 private String toPlace;  
@Column  
private Timestamp startTimeStamp;
@Column  
private Timestamp endTimeStamp;  
@Column  
private int ticketCost;  
@Column
private String meal;
@Column
 private String userName;
@Column
private String emailId;
@Column
private int totalSeat;
@Column
 private int totalCost;
@Id
@Column
private int pnr;
public int getFlightNo() {
	return flightNo;
}
public void setFlightNo(int flightNo) {
	this.flightNo = flightNo;
}
public String getAirlineName() {
	return airlineName;
}
public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
}
public String getFromPlace() {
	return fromPlace;
}
public void setFromPlace(String fromPlace) {
	this.fromPlace = fromPlace;
}
public String getToPlace() {
	return toPlace;
}
public void setToPlace(String toPlace) {
	this.toPlace = toPlace;
}
public Timestamp getStartTimeStamp() {
	return startTimeStamp;
}
public void setStartTimeStamp(Timestamp startTimeStamp) {
	this.startTimeStamp = startTimeStamp;
}
public Timestamp getEndTimeStamp() {
	return endTimeStamp;
}
public void setEndTimeStamp(Timestamp endTimeStamp) {
	this.endTimeStamp = endTimeStamp;
}
public int getTicketCost() {
	return ticketCost;
}
public void setTicketCost(int ticketCost) {
	this.ticketCost = ticketCost;
}
public String getMeal() {
	return meal;
}
public void setMeal(String meal) {
	this.meal = meal;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getTotalSeat() {
	return totalSeat;
}
public void setTotalSeat(int totalSeat) {
	this.totalSeat = totalSeat;
}
public int getTotalCost() {
	return totalCost;
}
public void setTotalCost(int totalCost) {
	this.totalCost = totalCost;
}
public int getPnr() {
	return pnr;
}
public void setPnr(int pnr) {
	this.pnr = pnr;
}

}

