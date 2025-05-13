package com.restapi.com.entity;

public class Quote {

	
	private Integer id;
	private String author;
	private String quote;
	
	
	public Quote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Quote(Integer id, String author, String quote) {
		super();
		this.id = id;
		this.author = author;
		this.quote = quote;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", author=" + author + ", quote=" + quote + "]";
	}
	
	
	
}
