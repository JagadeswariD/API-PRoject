package com.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int PersonId;  
	private String name;
	private String email;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address adress;
		public Person(int personId, String name, String email, int age) {
		super();
		PersonId = personId;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	
}