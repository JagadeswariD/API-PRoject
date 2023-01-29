package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	int id;
	String name;
	double cgpa;

	Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getCGPA() {
		return this.cgpa;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.cgpa + " " + this.id;
	}

}

class Priorities {
	private static Comparator<Student> ALPHABETICAL_ORDER = new Comparator<Student>() {
	    public int compare(Student student1, Student student2) {
	    	int CgpaCompare = student1.cgpa.compareTo(student2.cgpa);
	        int NameCompare = student2.getName().compareTo(student1.getName());
	        int IDCompare = student2.id.compareTo(student1.id);
	        if (CgpaCompare == 0) {
	            if (NameCompare == 0) {
	                return IDCompare;
	            } else {
	                return NameCompare;
	            }
	        } else {
	            return CgpaCompare;
	        }
	    }
	};
	List<Student> getStudents(List<String> events) {
		List<Student> student = new ArrayList<>();
		if(events.size()==0)
			return student;
		
		for (String s : events) {
			if (!s.equals("SERVED")) {
				String[] splitString = new String[4];
				splitString = s.split(" ");
				student.add(new Student(Integer.parseInt(splitString[3]), splitString[1],
						Double.parseDouble(splitString[2])));
				Collections.sort(student, (s1, s2) -> s1.cgpa > s2.cgpa ? -1 : (s1.cgpa < s2.cgpa) ? 1 : 0);

			} else {
				if (student.size() >=2) {
					if (student.get(0).cgpa == student.get(1).cgpa) {
						double l_cgpa = student.get(0).cgpa;
						List<Student> student1 = new ArrayList<>();
						for (Student ss : student) {
							if (ss.cgpa == l_cgpa) {
								student1.add(ss);

								Collections.sort(student1,(s1,s2) -> s1.name.compareTo(s2.name));
							}
						}
						if (student1.get(0).name.equals(student1.get(1).name)) {
							Collections.sort(student1, (s1, s2) -> s1.id > s2.id ? -1 : (s1.id < s2.id) ? 1 : 0);
							student.remove(student1.get(0));
						} else {
							student.remove(student1.get(0));
						}

					} else {
						student.remove(0);
					}
				} else if (student.size()==1) {
					
					student.remove(0);
				}
			}
		}
		//System.out.println(student.toString());

		return student;
	}
}

public class PriorityQueue {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}
