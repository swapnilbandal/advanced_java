package com.app.model;

import java.sql.Date;

public class Flight {
	private int id;
	private String number,departure,destination;
	private Date Ddate,Adate;
	
	public Flight() {
		super();
	}
	public Flight(int id, String number, String departure, String destination, Date ddate, Date adate) {
		super();
		this.id = id;
		this.number = number;
		this.departure = departure;
		this.destination = destination;
		Ddate = ddate;
		Adate = adate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDdate() {
		return Ddate;
	}
	public void setDdate(Date ddate) {
		Ddate = ddate;
	}
	public Date getAdate() {
		return Adate;
	}
	public void setAdate(Date adate) {
		Adate = adate;
	}
	
	
}
