package com.onetone.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String city;
	private String state;
	private String countery;
	private String type;
	
	
	@ManyToOne
	@JoinColumn(name = "eid")
	private Employees employees;


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(Integer addressId, String city, String state, String countery, String type, Employees employees) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.countery = countery;
		this.type = type;
		this.employees = employees;
	}


	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountery() {
		return countery;
	}


	public void setCountery(String countery) {
		this.countery = countery;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Employees getEmployees() {
		return employees;
	}


	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	
	
	
	
}
