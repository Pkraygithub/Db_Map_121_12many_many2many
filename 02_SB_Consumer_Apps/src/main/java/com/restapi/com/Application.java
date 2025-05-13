package com.restapi.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.restapi.com.service.QuoteService;

@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//MsgService bean = context.getBean(MsgService.class);
		//bean.getMsg();
		
		QuoteService bean = context.getBean(QuoteService.class);
		//bean.getQuotes();
		
		//System.out.println("===============================");
		//bean.getQuotes1();
		
		bean.getQuotes2();
	}

}
