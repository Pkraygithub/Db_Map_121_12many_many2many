package com.restapi.com.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	
	@GetMapping("/welcome")
	public String  getWelcomeMessage() {
		
		  String msg= "Welcome to learn Rest API 🥰🥰🥰🥰🥰🥰";
		  
		  return msg;
		
	}
	
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg(){
		String msg="Welcome to learn Rest Api.🥰🥰🥰🥰😁😁😁😁😁";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	} 
	
}
