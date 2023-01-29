package com.jagadeswari.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jagadeswari.employee.dto.EmployeeDTO;
import com.jagadeswari.employee.services.EmployeeServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeServices employeeServices;

	@GetMapping(path = "/all")
	public ResponseEntity<List<EmployeeDTO>> retrieveAllEmployees() {
		List<EmployeeDTO> retrievedEmployeeList = employeeServices.retrieveAllEmployees();
		System.out.println("employee");
		return ResponseEntity.status(HttpStatus.OK).body(retrievedEmployeeList);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<EmployeeDTO> retrieveAllEmployees(@PathVariable long id) {
		EmployeeDTO retrievedEmployee = employeeServices.retrieveByEmployeeID(id);
		return ResponseEntity.status(HttpStatus.OK).body(retrievedEmployee);
	}

	@PostMapping(path = "/add", consumes = "application/json")

	public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employeeDto) {
		EmployeeDTO savedEmployee = employeeServices.addEmployee(employeeDto);

		return ResponseEntity.status(HttpStatus.OK).body(savedEmployee);
	}

	@DeleteMapping(path = "/delete/{id}")

	public ResponseEntity<EmployeeDTO> deleteEmployee(@PathVariable long id) {

		EmployeeDTO deletedEmployee = employeeServices.deleteEmployee(id);
		return ResponseEntity.status(HttpStatus.OK).body(deletedEmployee);
	}

	@PutMapping(path = "/update", consumes = "application/json")
	public ResponseEntity<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO employeeDto) {
		EmployeeDTO savedEmployee = employeeServices.updateEmployee(employeeDto);

		return ResponseEntity.status(HttpStatus.OK).body(savedEmployee);
	}

}
