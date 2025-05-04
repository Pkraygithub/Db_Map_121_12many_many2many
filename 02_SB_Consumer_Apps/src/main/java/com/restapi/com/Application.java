package com.restapi.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.restapi.com.service.MsgService;

@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		MsgService bean = context.getBean(MsgService.class);
		
		bean.getMsg();
	}

}
