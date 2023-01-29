package jpa.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionService {
	static SessionFactory factory;
	static Session session;

	// Method to establish the database connectivity

	public static Session getSession() {
		try {
			factory = new Configuration().configure().buildSessionFactory();
			session = factory.openSession();

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

		return session;

	}

	//Method to close the database connection
	
	public static void disconnect() {
		session.close();
		factory.close();

	}
}
