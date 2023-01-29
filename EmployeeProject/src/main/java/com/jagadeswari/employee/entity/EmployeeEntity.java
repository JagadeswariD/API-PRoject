package com.jagadeswari.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="employee")
public class EmployeeEntity {

	@Id
	private long empID;
	private String empName;
	private String empEmail;
	private String empAddress;
	
}
