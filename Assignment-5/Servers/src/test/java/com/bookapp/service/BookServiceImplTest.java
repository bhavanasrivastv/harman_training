package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

class BookServiceImplTest {

	private BookDao bookDao;
	private BookServiceImpl bookService;
	@BeforeEach
	void setUp() throws Exception {
		bookDao = new BookDaoImpl();
		bookService = new BookServiceImpl();
		bookService.setBookDao(bookDao);
	}

	@Test
	void number_of_java_books_is_Two_test() {
		Assertions.assertEquals(2, bookService.getBooks("java").size());
	}
	
	
	@AfterEach
	void tearDown() throws Exception {
		bookDao = null;
		bookService = null;
	}

	

}
