package com.sqlhackathon.model;

public class Customer {
	int id;
	String email;
	String fname;
	String lname;

	public Customer() {

	}

	public Customer(String email, String fname, String lname) {
		super();

		this.email = email;
		this.fname = fname;
		this.lname = lname;
	}

	public Customer(int id, String email, String fname, String lname) {
		super();
		this.id = id;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
