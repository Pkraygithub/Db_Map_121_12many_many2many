package com.onetone.com.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetone.com.entity.Address;
import com.onetone.com.entity.Employees;
import com.onetone.com.repositery.AddressRepositery;
import com.onetone.com.repositery.EmployeesReositery;

@Service
public class EmployeesServiceOneToMany {

	@Autowired
	private EmployeesReositery employeesReositery;

	@Autowired
	private AddressRepositery addressRepositery;

	public void getEmp() {
		employeesReositery.findById(52);
	
	}

	public void saveEmpAddress() {

		// Address Class
		Address add1 = new Address();

		add1.setCity("Patna");
		add1.setCountery("India");
		add1.setState("Bihar");
		add1.setType("Parmanent");

		Address add2 = new Address();

		add2.setCity("Chennai");
		add2.setCountery("India");
		add2.setState("Tamilnadu");
		add2.setType("Present");

		// Employees Class
		Employees emp = new Employees();
		emp.setEname("Pankaj Kumar");
		emp.setEdept("CSE");
		emp.setEgender("Male");
		emp.setEsalary(334434.09);

		// Associate Emp obj to address obj
		add1.setEmployees(emp);
		add2.setEmployees(emp);
		emp.setAddes(Arrays.asList(add1, add2));

		// Save Emp object...
		employeesReositery.save(emp);

	}
}
