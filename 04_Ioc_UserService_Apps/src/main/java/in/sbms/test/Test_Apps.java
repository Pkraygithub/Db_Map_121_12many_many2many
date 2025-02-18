package in.sbms.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sbms.controller.UserController;

public class Test_Apps {

	
	public static void main(String[] args) {
		
		ApplicationContext ctext= new ClassPathXmlApplicationContext("User_Bean_Ioc.xml");
		
		UserController bean = ctext.getBean(UserController.class);
		bean.register();
	}
}
