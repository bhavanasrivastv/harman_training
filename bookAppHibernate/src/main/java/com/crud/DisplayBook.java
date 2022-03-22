package com.crud;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.factory.HibernateSessionFactory;

public class DisplayBook {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		Session session = factory.openSession();
		List<Book> books=session
				.createQuery("select b from Book b", Book.class)
				.getResultList();
		for(Book books1: books) {
			System.out.println(books1);
		}
		
		
		session.close();
		factory.close();

	}

}
