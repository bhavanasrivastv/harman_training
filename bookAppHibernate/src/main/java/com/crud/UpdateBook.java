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
public class UpdateBook {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		Book bookToUpdate = session.get(Book.class, 4);
		bookToUpdate.setBook_price(bookToUpdate.getBook_price()+300);
		
		try {
			tx.begin();
			session.update(bookToUpdate);
			tx.commit();
			
		}catch(HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
			
		}
		session.close();
		factory.close();
		
		
	}

}
