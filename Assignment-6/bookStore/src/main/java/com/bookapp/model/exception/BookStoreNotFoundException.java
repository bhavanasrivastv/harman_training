package com.bookapp.model.exception;

public class BookStoreNotFoundException extends RuntimeException{
	public BookStoreNotFoundException(String message) {
		super(message);
	}
}
