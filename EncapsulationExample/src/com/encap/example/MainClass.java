package com.encap.example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] studentList = new Student[2];
		studentList[0]=new Student(0001, "Michael", "Gabriel", "mgabriel@perscholas.org", "123-456-7890");
		studentList[1]=new Student(0002, "Bairon", "Vasquez", "bvasquez@perscholas.org", "123-456-7891");
		for (Student student : studentList) {
			student.printStudentDetails(student);
			System.out.println("\n#################################\n");
		}
	}

}
