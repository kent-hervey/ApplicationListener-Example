package com.hervey.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hervey.app.models.Book;
import com.hervey.app.services.ApiService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	private final ApiService apiService;
	
	public APIController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("/books")
	public List<Book> showAllBooks() {
		List<Book> books = apiService.fetchAllBooks();
		System.out.println("books is"  + books.toString());
		return books;
		
	}
	
	

}
