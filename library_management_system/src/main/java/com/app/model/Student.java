package com.app.model;

public class Student{
	private int id;
	private String name,password,email,prn,phoneNo;
	
	
	public Student() {
		super();
	}
	
	
	public Student(int id, String name, String password, String email,String prn, String phoneNo) {
		super();
		this.id = id;
		this.prn=prn;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}


	public void setId(int id) {
		this.id = id;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	public String getPrn() {
		return prn;
	}


	public String getPassword() {
		return password;
	}


	public String getEmail() {
		return email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}
	
}
