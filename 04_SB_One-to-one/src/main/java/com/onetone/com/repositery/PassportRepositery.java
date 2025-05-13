package com.onetone.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetone.com.entity.Passport;

public interface PassportRepositery extends JpaRepository<Passport, Integer> {

}
