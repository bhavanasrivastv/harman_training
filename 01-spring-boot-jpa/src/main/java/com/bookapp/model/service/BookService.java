package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.entities.Book;

public interface BookService {

	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public Book getBookByTitle(String title);
	public Book updateBook(int id, Book book);
	public Book deleteBook(int id);
	public Book addBook(Book book);
}
