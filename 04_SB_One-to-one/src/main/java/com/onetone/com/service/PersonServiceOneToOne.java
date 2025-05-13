package com.onetone.com.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetone.com.entity.Passport;
import com.onetone.com.entity.Person;
import com.onetone.com.repositery.PassportRepositery;
import com.onetone.com.repositery.PersonRepositery;

@Service
public class PersonServiceOneToOne {
	
	@Autowired
	private PersonRepositery personRepositery;
	
	
	@Autowired
	private PassportRepositery passportRepositery;
	
	
	public  void savePersonWithPassport() {
		
		Passport passport = new Passport();
		passport.setPassportNumbe("UVXP23234");
		passport.setIssueDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		
		
		Person person = new Person();
		person.setPersonName("Pankaj Kumar");
		person.setPersonGender("Male");
		
		//Associate Entity 
		passport.setPerson(person);
		person.setPassport(passport);
		
		
		//save person
		personRepositery.save(person);
		
		
		
	}

}
