package com.bookapp.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookLib")
public class Book {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String author;
	private Integer price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Book(Integer id, String title, String book_author,Integer price) {
		super();
		this.id = id;
		this.title = title;
		this.author = book_author;
		this.price = price;
	}
	public Book(String title,String book_author, Integer price) {
		super();
		this.title = title;
		this.author = book_author;
		this.price = price;
	}
	
	public Book() {}
	public String getBook_author() {
		return author;
	}
	public void setBook_author(String book_author) {
		this.author = book_author;
	}
	
	
	
}
