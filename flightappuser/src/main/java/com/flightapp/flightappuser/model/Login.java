package com.flightapp.flightappuser.model;


import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;  


@Entity  
 
@Table  
public class Login  
{  
@Id
@Column
 private int id;
 @Column  
 private String userName;  
 @Column  
 private String passWord;  
 @Column 
 private String emailId; 
 
public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id =id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}

public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}


}

