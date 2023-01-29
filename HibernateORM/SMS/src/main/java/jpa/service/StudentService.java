package jpa.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends ConnectionService implements StudentDAO {

	// Method to return list of students

	public List<Student> getAllStudents() {
		String hql = "From Student";
		Session session = getSession();
		TypedQuery<Student> query = session.createQuery(hql);
		List<Student> students = query.getResultList();
		//disconnect();
		if (students.isEmpty())
			return null;
		else
			return students;
	}

	// Method to return student by email

	public Student getStudentByEmail(String email) {

		Session session = getSession();
		TypedQuery<Student> query = session.getNamedQuery("StudentByEmail");
		query.setParameter("email", email);
		Student student = query.getSingleResult();
		// disconnect();
		if (student.equals(null))
			return null;
		else
			return student;

	}

	// Method to validate student login by verifying email and password

	public boolean validateStudent(String email, String password) {
		Session session = getSession();
		Student student;
		TypedQuery<Student> query = session.getNamedQuery("StudentByEmail");
		query.setParameter("email", email);
		try {
			student = query.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("Email id does not exists");
			return false;
		}
		disconnect();
		if (student != null && student.getSPass().equals(password))
			return true;
		else
			return false;
	}

	// Method to return list of registered courses of a student based on email

	public List<Course> getStudentCourses(String email) {
		// TODO Auto-generated method stub
		Session session = getSession();
		TypedQuery<Student> query = session.getNamedQuery("StudentByEmail");
		query.setParameter("email", email);
		Student student = query.getSingleResult();
		// disconnect();
		if (student.equals(null))
			return null;
		else
			return student.getCourseList();

	}

	// Method to register student to a course

	public void registerStudentToCourse(String sEmail, Course newCourse) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction t = session.beginTransaction();
		TypedQuery<Student> query = session.getNamedQuery("StudentByEmail");
		query.setParameter("email", sEmail);
		Student student = query.getSingleResult();
		if (student.getCourseList().contains(newCourse)) {
			System.out.println(student.getSName() + " already registered to " + newCourse.getCName());
		} else {
			student.getCourseList().add(newCourse);
			session.update(student);
			t.commit();
		}

		disconnect();

	}

	// Method to add new student

	public void addStudent(Student newStudent) {
		Session session = getSession();
		Transaction t = session.beginTransaction();
		session.save(newStudent);
		t.commit();
		System.out.println(newStudent.getSName() + " added successfully ");
		disconnect();

	}

	// Method to unregister from a course
	public void unregisterStudentFromCourse(String sEmail, Course removeCourse) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction t = session.beginTransaction();
		TypedQuery<Student> query = session.getNamedQuery("StudentByEmail");
		query.setParameter("email", sEmail);
		Student student = query.getSingleResult();
		if(!student.getCourseList().contains(removeCourse)) {
			System.out.println(student.getSName()+ " already un-registered to "+removeCourse.getCName());
		}
		else {
			student.getCourseList().remove(removeCourse);
			session.update(student);
			t.commit();
		}
		
		disconnect();
		
	}
}
