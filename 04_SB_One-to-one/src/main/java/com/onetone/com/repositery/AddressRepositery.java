package com.onetone.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetone.com.entity.Address;

public interface AddressRepositery extends JpaRepository<Address, Integer>{

}
