package com.restapi.com.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.restapi.com.entity.Quote;

import reactor.core.publisher.Mono;

@Service
public class QuoteService {
	
	private static final String API_URL="https://dummyjson.com/quotes/random";
	
	
	public void getQuotes() {
		
		WebClient  webclient = WebClient.create();
		Mono<String> bodyToMono = webclient.get()
					.uri(API_URL)
					.retrieve()
					.bodyToMono(String.class);
		
		
		String response = bodyToMono.block();
		
		System.out.println(response);
	}
	public void getQuotes1() {
		WebClient  webclient = WebClient.create();
		Mono<Quote> bodyToMono = webclient.get()
					.uri(API_URL)
					.retrieve()
					.bodyToMono(Quote.class);
		
		Quote responsequote = bodyToMono.block();
		
		System.out.println(responsequote);
					
		
	}
	
	
	
	public void getQuotes2() {
		WebClient  webclient = WebClient.create();
		
		System.out.println("==================Response Sending Completed=========================");
		webclient.get()
				 .uri(API_URL)
				 .retrieve()
				 .bodyToMono(Quote.class)
				 .subscribe(response->{
					System.out.println(response); 
				 });
		
					System.out.println("==================Request Sending Completed=======================");
		
	}

}
