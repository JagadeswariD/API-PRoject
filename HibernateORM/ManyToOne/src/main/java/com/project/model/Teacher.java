package com.project.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String salary;
	private String Teachername;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "depID")
	private Department department;

	public Teacher(int tid, String salary, String teachername) {
		super();
		this.tid = tid;
		this.salary = salary;
		Teachername = teachername;
	}

	public Department getDep() {
		return department;
	}
	public void setDep(Department department) {
		this.department = department;
	}


}
