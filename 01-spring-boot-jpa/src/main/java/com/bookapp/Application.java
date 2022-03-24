package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	BookService bookservice;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		bookservice.addBook(new Book("monk who sold farrari", "hiii", 300));
		bookservice.addBook(new Book("monk who sold farrari", "hiii", 300));	
		bookservice.addBook(new Book("monk who sold farrari", "hiii", 300));

	}

	
}
