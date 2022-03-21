package com.bookapp.web.controller;

import java.util.*;

import com.bookapp.model.dao.BookStore;
import com.book.model.service.BookStoreService;
import com.book.model.service.BookStoreServiceImpl;

public class DemoBookApp {
	public static void main(String[] args) {
		
		BookStoreServiceImpl bookService = new BookStoreServiceImpl();
		List<BookStore>bookstores = bookService.getAll();
		
		for(BookStore bookstore: bookstores)
			System.out.println(bookstore);
		
		BookStore bookstore = new BookStore();
		
		bookService.updateBookStore(4,bookstore);
	}
}
