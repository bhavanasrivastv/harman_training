package com.bookapp.model.dao;

public class BookStore {

	private int book_id;
	private String book_name;
	private String book_author;
	private int book_price;
	
	public BookStore(int book_id, String book_name, String book_author, int book_price) {
//		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
	}
	
	public BookStore( String book_name, String book_author, int book_price) {
//		super();
//		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
	}
	
	
	public BookStore() {}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	
	@Override
	public String toString() {
		
		return "BookStore [id=" + book_id + ", name=" + book_name + ", salary=" + book_author + ", age=" + book_price + "]";
	}
}
	
	
	

