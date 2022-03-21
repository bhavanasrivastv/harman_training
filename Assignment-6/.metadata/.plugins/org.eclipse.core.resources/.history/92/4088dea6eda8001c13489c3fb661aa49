package com.bookapp.model.dao;

import java.sql.*;
import java.util.*;

import com.bookapp.factory.ConnectionFactory;
import com.bookapp.model.exception.BookStoreNotFoundException;

public class BookStoreDaoImpl implements BookStoreDao{
	
//	private static final String PreparedStatement stmt   = null;
	private Connection connection;
	
	public BookStoreDaoImpl() {
		
		connection = ConnectionFactory.getConnection();
	}
	
	public List<BookStore> getAll(){
		BookStore tempBook = null;
		List<BookStore> bookstores = new ArrayList<BookStore>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from books");
			while (rs.next()) {
				tempBook = new  BookStore(rs.getInt("book_id"), rs.getString("book_name"), rs.getString("book_author"), rs.getInt("book_price"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return bookstores;
	}
	
	public void addBookStore(BookStore bookstore) {
		// TODO Auto-generated method stub
		PreparedStatement stmt  = null;
		
		try {
			stmt = connection.prepareStatement("insert into books(book_name,book_author,book_price) values(???)");
			stmt.setString(1,bookstore.getBook_name());
			stmt.setString(2,bookstore.getBook_author());
			stmt.setInt(3, bookstore.getBook_price());
			
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deleteBookStore(int book_id) {
		// TODO Auto-generated method stub
		
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("delete from books where book_id = ?");
			stmt.setInt(1, book_id);
			stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void updateBookStore(int book_id, BookStore bookstore) {
		// TODO Auto-generated method stub
		
		java.sql.PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("update books set book_price = ? where id = ?");
			stmt.setInt(1, bookstore.getBook_price());
			stmt.setInt(2, book_id);
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public BookStore findById(int book_id) {
		// TODO Auto-generated method stub
		BookStore tempbook = null;
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from books where book_id=?");
			stmt.setInt(1, book_id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				tempbook = new BookStore(rs.getInt("book_id"), rs.getString("book_name"), rs.getString("book_author"), rs.getInt("book_price"));

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(tempbook == null)
			throw new BookStoreNotFoundException("book not found");
		return tempbook;
	}
		
}
