package com.onetone.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetone.com.entity.User;

public interface UserRepositery extends JpaRepository<User, Integer>{

}
