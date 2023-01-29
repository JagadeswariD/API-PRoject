package com.project.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.model.User;

public class UpdatingUser {

	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	      /*   User u = new User();
              u.setId(3);
		    u.setEmail("mhaseeb@perscholas");
		    u.setFullname("M haseeb");
		    u.setPassword("123456");
		    //session.merge(u);*/
		
			User u = (User) session.get(User.class, 2);
			u.setAge(30);
			session.update(u);
		    session.getTransaction().commit();
		    session.close();
	}
}
