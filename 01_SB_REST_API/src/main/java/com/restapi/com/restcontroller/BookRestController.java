package com.restapi.com.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.com.entity.Book;

@RestController
public class BookRestController {

	@PostMapping(value = "/book",consumes = "application/json",produces = "text/plain")
	ResponseEntity<String> addBook( @RequestBody Book book) {

		System.out.println(book);
		String msg = "Book Saved";

		return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}

	@GetMapping(value = "/book",produces = {"application/json", "application/xml"})
	ResponseEntity<Book> showBookDetails() {

		Book b = new Book(101, "Java", 234.45);

		return new ResponseEntity<>(b, HttpStatus.OK);
	}

	@GetMapping(value = "/books", produces = {
			"application/json",
			"application/xml"
			})
	ResponseEntity<List<Book>> listBookDetails() {

		Book b = new Book(101, "Java", 234.45);
		Book b1 = new Book(102, "Cogizant", 2334.45);
		Book b2 = new Book(103, "Java Script", 3234.45);
		Book b3 = new Book(104, "Python", 1234.45);
		Book b4 = new Book(105, "Spring", 5234.45);

		List<Book> booklists = Arrays.asList(b, b1, b2, b3, b4);

		return new ResponseEntity<>(booklists, HttpStatus.OK);
	}
	
	
	
	@PutMapping(value = "/book/{bookid}",consumes = "application/json",produces = "text/plain")
	ResponseEntity<Book> updateBook(@PathVariable("bookid") Integer bookid, 
													@RequestBody Book book) {

		System.out.println("Book Id put : "+bookid);
		System.out.println(book);

		return new ResponseEntity<>(book, HttpStatus.OK);

	}

	
	
	@PatchMapping(value = "/book/{bookid}",consumes = "application/json",produces = "text/plain")
	ResponseEntity<Book> updateBookPathch( @PathVariable("bookid") Integer bookid, 
															@RequestBody Book book) {

		System.out.println("Book Id for patch : "+bookid);
		System.out.println(book);

		return new ResponseEntity<>(book, HttpStatus.OK);

	}

	
	@DeleteMapping(value = "/book/{id}",consumes = "application/json",produces = "text/plain")
	ResponseEntity<String> deleteBook( @PathVariable("id") Integer id) {

	
		String msg = "Book details  has been deleted";

		return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}

}
