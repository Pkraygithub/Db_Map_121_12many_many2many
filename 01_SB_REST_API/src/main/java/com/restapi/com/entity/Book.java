package com.restapi.com.entity;

public class Book {

	
	private int bookid;
	private String bookname;
	private Double bookPrice;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String bookname, Double bookPrice) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookPrice = bookPrice;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
}
