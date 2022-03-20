package com.book.model.service;

import java.util.List;
import com.bookapp.model.dao.BookStore;

public interface BookStoreService {
	
	public List<BookStore> getAll();
	public void addBookStore(BookStore bookstore);
	public void deleteBookStore(int book_id);
	public void updateBookStore(int book_id, BookStore bookstore);
	public BookStore findById(int book_id);
}
