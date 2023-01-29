package jpa;

import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	private Scanner sin;
	private StringBuilder sb;

	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;

	public SMSRunner() {
		sin = new Scanner(System.in);
		sb = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SMSRunner sms = new SMSRunner();
		sms.run();
	}

	// Method to invoke menu method

	private void run() {
		// Login or quit

		switch (menu()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;
		case 2:
			addStudentOrCourse();
			break;
		case 3:
			out.println("Goodbye!");
			break;

		default:
			out.println("Please enter numbers 1 or 2 or 3");
		}

	}

	// Method to provide menu option 1. Student Login 2. Other Options 3. Quit

	private int menu() {
		int option = 0;
		out.println(
				"############################################################################################################");
		sb.append("\n1. Student Login\n2. Other Options\n3. Quit Application\n\nPlease Enter Selection: ");
		out.print(sb.toString());
		sb.delete(0, sb.length());
		String input = sin.nextLine();
		try {
			option = Integer.parseInt(input);

		} catch (NumberFormatException e) {
			out.println("Entered value is not an integer");
		}
		return option;
	}

	// Method to validate student login and display registered courses

	private boolean studentLogin() {
		boolean retValue = false;
		out.print("\nEnter your email address: ");
		String email = sin.next();
		out.print("\n");
		out.print("Enter your password: ");
		String password = sin.next();

		if (studentService.validateStudent(email, password)) {
			currentStudent = studentService.getStudentByEmail(email);
			List<Course> courses = currentStudent.getCourseList();
			out.println(
					"############################################################################################################\n");
			if (courses.isEmpty()) {
				out.println("Course List is Empty");
			} else {
				for (Course course : courses) {
					out.println(course.getCid() + " " + course.getCName());
				}
			}

			retValue = true;
		} else {
			out.println(
					"############################################################################################################\n");
			out.println("Wrong Credentials. User Validation failed. GoodBye!");
		}
		return retValue;
	}

	// Method to register a course and unregister a course

	private void registerMenu() {
		List<Course> studentCourses = null;
		int number;
		Course newCourse = null;
		sb.append("\n1. Register a course\n2. Unregister a course\n3. Logout\nPlease Enter Selection: ");
		System.out.println(
				"############################################################################################################\n");
		out.print(sb.toString());
		sb.delete(0, sb.length());

		switch (sin.nextInt()) {
		case 1:
			List<Course> allCourses = courseService.getAllCourses();
			studentCourses = studentService.getStudentCourses(currentStudent.getSEmail());

			allCourses.removeAll(studentCourses);
			printCourses(allCourses);

			out.println();
			out.print("Enter Course Number: ");
			number = sin.nextInt();
			newCourse = courseService.GetCourseById(number);

			if (newCourse != null) {
				studentService.registerStudentToCourse(currentStudent.getSEmail(), newCourse);
				Student student = studentService.getStudentByEmail(currentStudent.getSEmail());

				List<Course> sCourses = student.getCourseList();
				System.out.println(
						"############################################################################################################\n");

				out.println("REGISTERED COURSES\n");
				printCourses(sCourses);
			}
			break;
		case 2:
			studentCourses = studentService.getStudentCourses(currentStudent.getSEmail());

			printCourses(studentCourses);
			out.println();
			out.print("Enter Course Number to Unregister: ");
			number = sin.nextInt();
			newCourse = courseService.GetCourseById(number);

			if (newCourse != null) {
				studentService.unregisterStudentFromCourse(currentStudent.getSEmail(), newCourse);
				Student student = studentService.getStudentByEmail(currentStudent.getSEmail());

				List<Course> sCourses = student.getCourseList();
				System.out.println(
						"############################################################################################################\n");

				out.println("UNREGISTERED COURSE SUCCESSFULLY");
				printCourses(sCourses);

			}
			break;
		case 3:
			out.println("Goodbye!");
			break;
		default:
			out.println("Please enter numbers 1 or 2 or 3");
		}

	}
	// Method to add new student or new course

	private void addStudentOrCourse() {
		sb.append("\n1. Add Student\n2. Add Course\n3. Quit\nPlease Enter Selection: ");
		System.out.println(
				"############################################################################################################\n");
		out.print(sb.toString());
		sb.delete(0, sb.length());

		switch (sin.nextInt()) {

		case 1:

			printStudents();
			out.println();
			out.print("Enter Student Name: ");
			String sName = sin.next();
			out.print("Enter Student Email: ");
			String sEmail = sin.next();
			out.print("Enter Student Password: ");
			String sPswd = sin.next();

			Student newStudent = new Student();
			newStudent.setSEmail(sEmail);
			newStudent.setSName(sName);
			newStudent.setSPass(sPswd);

			studentService.addStudent(newStudent);

			System.out.println(
					"############################################################################################################\n");

			out.println("STUDENT ADDED SUCCESSFULLY");
			printStudents();

			break;
		case 2:
			List<Course> allCourses = courseService.getAllCourses();
			printCourses(allCourses);
			out.println();
			out.print("Enter Course Name: ");
			String cName = sin.next();
			out.print("Enter Course Instructor Name: ");
			String cInstructorName = sin.next();

			Course newCourse = new Course();
			newCourse.setCName(cName);
			newCourse.setCInstructorName(cInstructorName);

			courseService.addCourse(newCourse);

			System.out.println(
					"############################################################################################################\n");

			out.println("COURSE ADDED SUCCESSFULLY");
			allCourses = courseService.getAllCourses();
			
			printCourses(allCourses);

			break;
		case 3:
			out.println("Goodbye!");
			break;
		default:
			out.println("Please enter numbers 1 or 2 or 3");
		}

	}
	// Method to print all students

	private void printStudents() {
		List<Student> allStudent = studentService.getAllStudents();
		out.printf("%-35s%-30s\n", "EMAIL ID", "STUDENT NAME");
		for (Student student : allStudent) {
			out.printf("%-35s%-30s\n", student.getSEmail(), student.getSName());
		}
	}

	// Method to print all courses

	/*
	 * private void printCourses() { List<Course> allCourses =
	 * courseService.getAllCourses(); out.printf("%-5s%-30s%-30s\n", "ID", "COURSE",
	 * "INSTRUCTOR"); for (Course course : allCourses) {
	 * out.printf("%-5s%-30s%-30s\n", course.getCid(), course.getCName(),
	 * course.getCInstructorName()); } }
	 */

	// Method to print students registered courses

	private void printCourses(List<Course> studentCourses) {
		out.printf("%-5s%-30s%-30s\n", "ID", "COURSE", "INSTRUCTOR");
		for (Course course : studentCourses) {
			out.printf("%-5s%-30s%-30s\n", course.getCid(), course.getCName(), course.getCInstructorName());
		}
	}
}
