package com.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud2")
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private int age;
	
	
	public Student() {
		super();
	}


	public Student(int id, String firstname, String lastName, String email, int age) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstName;
	}


	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + "]";
	}
	
	
	
	
}
