package com.restapi.com.service;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MsgService {

	
	private static final String provider_url="http://localhost:8080/book";
	
	
	public void getMsg() {
		
		RestTemplate rp= new RestTemplate();
		
		ResponseEntity<String> forEntity = rp.getForEntity(provider_url, String.class);
		HttpStatusCode statusCode = forEntity.getStatusCode();
		String body = forEntity.getBody();
		
		System.out.println("Status Code ==> "+statusCode.value());
		System.out.println("Response Body ==> "+body);
		
	}
}
