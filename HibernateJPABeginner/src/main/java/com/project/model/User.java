package com.project.model;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER")
public class User {
    @Column(name = "USER_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullname;
    private String email;
    private String password;
    private int age;
    private double salary;
    private String city;
    
	public User(String fullname, String email, String password, int age, double salary, String city) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
  
}

