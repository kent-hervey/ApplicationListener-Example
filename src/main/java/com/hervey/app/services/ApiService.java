package com.hervey.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hervey.app.models.Book;
import com.hervey.app.repositories.BookRepository;

@Service
public class ApiService {

	private final BookRepository bookRepository;
	
	public ApiService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> fetchAllBooks() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

}
