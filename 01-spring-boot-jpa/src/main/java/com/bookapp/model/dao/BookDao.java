package com.bookapp.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.model.entities.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
	
	public Book findByTitle(String title);

//	public static void save(int book_id) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
