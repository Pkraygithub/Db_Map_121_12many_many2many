package com.onetone.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.onetone.com.service.UserRolesServiceManyToMany;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(Application.class, args);
		
		//PersonService bean2 = bean.getBean(PersonService.class);
		//bean2.savePersonWithPassport();
		
		
		
		//EmployeesServiceOneToMany bean3 = bean.getBean(EmployeesServiceOneToMany.class);
		//bean3.saveEmpAddress();
		//bean3.getEmp();
		
		
		UserRolesServiceManyToMany userRole = bean.getBean(UserRolesServiceManyToMany.class);
		//userRole.usersSetRoles();
		userRole.getUser(2);
		userRole.getRole(2);
	}

}
