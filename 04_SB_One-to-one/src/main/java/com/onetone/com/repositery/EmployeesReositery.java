package com.onetone.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetone.com.entity.Employees;

public interface EmployeesReositery extends JpaRepository<Employees, Integer> {

}
