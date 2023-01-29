package com.jagadeswari.employee.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EmployeeDTO {
	@Id
	private long empID;
	private String empName;
	private String empEmail;
	private String empAddress;
}
