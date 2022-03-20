package com.bookapp.model.dao;
import java.util.*;
//Dao :data access object ie it is a abstraction over crud operation

public interface BookStoreDao {
	public List<BookStore> getAll();
	public void addBookStore(BookStore bookstore);
	public void deleteBookStore(int book_id);
	public void updateBookStore(int book_id, BookStore bookstore);
	public BookStore findById(int book_id);
}
