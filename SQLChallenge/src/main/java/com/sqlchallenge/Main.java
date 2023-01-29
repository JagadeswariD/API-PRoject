package com.sqlchallenge;

import com.sqlchallenge.dao.StudentJDBCDAO;
import com.sqlchallenge.model.StudentBean;

public class Main {
	  public static void main(String[] args) {
	        StudentJDBCDAO student = new StudentJDBCDAO();
	        StudentBean alok = new StudentBean();
	        alok.setName("Alok");
	        alok.setRollNo(8);
	        alok.setCourse("MBA");
	        alok.setAddress("Ranchi");
	        StudentBean tinkoo = new StudentBean();
	        tinkoo.setName("Arvind");
	        tinkoo.setCourse("BS");
	        tinkoo.setRollNo(6);
	        tinkoo.setAddress("NewYork");
	        // Adding Data
	        student.add(alok);
	        student.add(tinkoo);
	        StudentBean s = new StudentBean();
	        s.setName("Marshall");
	        s.setCourse("BSC");
	        s.setRollNo(7);
	        s.setAddress("SanAntonio");
	        student.add(s);
	        // Displaying Data before delete
	        student.findAll();
	        // Deleting Data
	        student.delete(7);
	        // Updating Data
	        tinkoo.setName("Maria");
	        student.update(tinkoo);
	        // Displaying Data
	        student.findAll();
	    }
}
