package com.bookapp.model.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.dao.BookDao;
import com.bookapp.model.entities.Book;
import com.model.model.exceptions.BookNotFoundException;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	
//	private static final String id = null;
	private BookDao bookDao ;
	
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		
		return bookDao.findAll();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bookDao.findById(id).orElseThrow(()->new BookNotFoundException("book with id"+id+"is not found"));
		
		
	}

	public Book addBook(Book book) {
		
		return bookDao.save(book);
	}

	@Override
	public Book getBookByTitle(String title) {
		return bookDao.findByTitle(title);
		
	}

	@Override
	public Book updateBook(int id, Book book) {
		Book bookToUpdate = getBookById(id);

		bookToUpdate.setPrice(book.getPrice());
		bookDao.save(bookToUpdate);

		return bookToUpdate;
	
	}

	@Override
	public Book deleteBook(int id) {
		// TODO Auto-generated method stub
		Book bookToDelete = getBookById(id);

		bookDao.delete(bookToDelete);

		return bookToDelete;
	}


	
	
}
