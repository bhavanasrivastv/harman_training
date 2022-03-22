package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.factory.HibernateSessionFactory;

public class DeleteBook {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		Book bookToDel = session.get(Book.class, 5);
		
		try {
			tx.begin();
			
			session.delete(bookToDel);
			
			tx.commit();
		}catch(HibernateException ex) {
			
			ex.printStackTrace();
			tx.rollback();
		}
		
		session.close();
		factory.close();
		
	}
}
