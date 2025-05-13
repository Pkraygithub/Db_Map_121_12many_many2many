package com.onetone.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetone.com.entity.Person;

public interface PersonRepositery extends JpaRepository<Person, Integer>{

}
