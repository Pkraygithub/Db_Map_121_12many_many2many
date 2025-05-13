package com.onetone.com.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetone.com.entity.Role;
import com.onetone.com.entity.User;
import com.onetone.com.repositery.RoleRepositery;
import com.onetone.com.repositery.UserRepositery;

@Service
public class UserRolesServiceManyToMany {

	
	@Autowired
	private RoleRepositery rolerepositery;
	
	@Autowired
	private UserRepositery userrepositery;
	
	
	public void usersSetRoles() {
		
		Role role=new Role();
		role.setRoleName("Manager");
		Role role1=new Role();
		role1.setRoleName("Admin");
		
		
		User user = new User();
		user.setUsername("Shankar Kumar");
		user.setGender("Male");
		user.setUserDob(LocalDate.now().minusYears(15));
		
		user.setRoles(Arrays.asList(role,role1));
		
		//save User Details with roles
		userrepositery.save(user);
	}
		public void getUser(int id) {
			Optional<User> userid = userrepositery.findById(id);
			//System.out.println("user "+userid);
		}
		
		
	public void getRole(int id) {
		Optional<Role> roleId = rolerepositery.findById(id);
		//System.out.println("Roles "+roleId);
	}
}
