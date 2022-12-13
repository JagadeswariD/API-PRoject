package com.encap.example;

public class Student {

	private int studentID;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	
	
	public Student(int studentID, String firstName, String lastName, String email, String phoneNo) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	public void printStudentDetails(Student student) {
		System.out.println("Student ID : "+student.getStudentID());
		System.out.println("Student First Name : "+student.getFirstName());
		System.out.println("Student Last Name : "+student.getLastName());
		System.out.println("Student Email : "+student.getEmail());
		System.out.println("Student Phone No : "+student.getPhoneNo());
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
	
	
}
