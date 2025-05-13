package com.onetone.com.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	private String passportNumbe;
	private LocalDate issueDate;
	private LocalDate expDate;
	
	
	@OneToOne
	@JoinColumn(name = "person_Id")
	private Person person;


	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Passport(Integer passportId, String passportNumbe, LocalDate issueDate, LocalDate expDate, Person person) {
		super();
		this.passportId = passportId;
		this.passportNumbe = passportNumbe;
		this.issueDate = issueDate;
		this.expDate = expDate;
		this.person = person;
	}


	public Integer getPassportId() {
		return passportId;
	}


	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}


	public String getPassportNumbe() {
		return passportNumbe;
	}


	public void setPassportNumbe(String passportNumbe) {
		this.passportNumbe = passportNumbe;
	}


	public LocalDate getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}


	public LocalDate getExpDate() {
		return expDate;
	}


	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
