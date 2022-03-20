package com.book.model.service;

import java.util.List;

import com.bookapp.model.dao.BookStore;
import com.bookapp.model.dao.BookStoreDao;
import com.bookapp.model.dao.BookStoreDaoImpl;

public class BookStoreServiceImpl {
	private BookStoreDao bookstoreDao;
	
	public BookStoreServiceImpl() {
		bookstoreDao = new BookStoreDaoImpl();
	}
	
	public List<BookStore> getAll(){
		return bookstoreDao.getAll();
	}
	
	public void addBookStore(BookStore bookstore) {
		bookstoreDao.addBookStore(bookstore);
	}
	
	public void deleteBookStore(int book_id) {
		bookstoreDao.deleteBookStore(book_id);
	}
	
	public void updateBookStore(int book_id, BookStore bookstore) {
		bookstoreDao.updateBookStore(book_id,bookstore);
	}
	
	public BookStore findById(int book_id) {
		return bookstoreDao.findById(book_id);
	}
}

