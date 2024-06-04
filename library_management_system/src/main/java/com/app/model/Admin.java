package com.app.model;

public class Admin {
	private int id;
	private String name,email,designation,phoneNo,password;
	public Admin() {
		super();
	}
	public Admin(int id, String name, String email, String designation, String phoneNo, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.phoneNo = phoneNo;
		this.password = password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDesignation() {
		return designation;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getPassword() {
		return password;
	}
	
	
}
