package org.example;

public class Chef implements Cloneable{

	String name;
	int age;
	public Chef(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	
	 
	 public String toString() {
	      return getName()+" "+getAge();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
