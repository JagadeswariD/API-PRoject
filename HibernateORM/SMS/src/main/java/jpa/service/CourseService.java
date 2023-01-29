package jpa.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService extends ConnectionService implements CourseDAO {

	// Method to return list of Courses

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		String hql = "From Course";
		Session session = getSession();
		TypedQuery<Course> query = session.createQuery(hql);
		List<Course> courses = query.getResultList();
		disconnect();
		if (courses.isEmpty())
			return null;
		else
			return courses;
	}

	// Method to return course details by id

	public Course GetCourseById(int number) {
		// TODO Auto-generated method stub
		String hql = "From Course c where c.cid = :id";
		Session session = getSession();
		TypedQuery<Course> query = session.createQuery(hql);
		query.setParameter("id", number);
		Course course=null;
		try{
			course = query.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("Course does not exists");
			return null;
		}
		disconnect();
		if (course.equals(null))
			return null;
		else
			return course;

	}

	// Method to add new course

	public void addCourse(Course newCourse) {
		Session session = getSession();
		Transaction t = session.beginTransaction();
		session.save(newCourse);
		t.commit();
		System.out.println(newCourse.getCName() + " added successfully ");
		disconnect();
	}

}
