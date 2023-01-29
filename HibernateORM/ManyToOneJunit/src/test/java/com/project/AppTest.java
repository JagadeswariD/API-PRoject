package com.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.project.model.Department;
import com.project.model.Teacher;

public class AppTest {
	private static SessionFactory sessionFactory;
	private Session session;

	@BeforeAll
	public static void setup() {
		sessionFactory = App.getSessionFactory();
		System.out.println("SessionFactory created");
	}

	@AfterAll
	public static void tearDown() {
		if (sessionFactory != null)
			sessionFactory.close();
		System.out.println("SessionFactory destroyed");
	}

	@Test
	public void testCreate() {
		System.out.println("Running testCreate...");

		Transaction t = session.beginTransaction();

		Department dep = new Department();
		dep.setDname("IT");
		Teacher t4 = new Teacher();
		t4.setDep(dep);
		t4.setSalary("40000");
		t4.setTeachername("Joseph");
		Integer id = (Integer)session.save(t4);
		t.commit();

		Assert.assertTrue(id > 0);

	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testGet() {
	}

	@Test
	public void testList() {
	}

	@Test
	public void testDelete() {
	}

	@BeforeEach
	public void openSession() {
		session = sessionFactory.openSession();
		System.out.println("Session created");
	}

	@AfterEach
	public void closeSession() {
		if (session != null)
			session.close();
		System.out.println("Session closed\n");
	}
}
