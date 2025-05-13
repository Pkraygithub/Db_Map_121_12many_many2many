package com.onetone.com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	private String personName;
	private String personGender;
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
	private Passport passport;


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(Integer personId, String personName, String personGender, Passport passport) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personGender = personGender;
		this.passport = passport;
	}


	public Integer getPersonId() {
		return personId;
	}


	public void setPersonId(Integer personId) {
		this.personId = personId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public String getPersonGender() {
		return personGender;
	}


	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	

	
	
}
