package com.jagadeswari.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagadeswari.employee.dto.EmployeeDTO;
import com.jagadeswari.employee.entity.EmployeeEntity;
import com.jagadeswari.employee.exception.ResourceNotFoundException;
import com.jagadeswari.employee.mapper.EmployeeMapper;
import com.jagadeswari.employee.repository.EmployeeRepository;
@Service
public class EmployeeServices {
	EmployeeRepository employeeRepository;
	
	EmployeeMapper employeeMapper;
	
	
	
	public EmployeeServices(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
		super();
		this.employeeRepository = employeeRepository;
		this.employeeMapper = employeeMapper;
	}



	public List<EmployeeDTO> retrieveAllEmployees() {
		List<EmployeeEntity> retrievedEmployeeList = employeeRepository.findAll();
		if (retrievedEmployeeList.isEmpty())
		    throw new ResourceNotFoundException("No Employee data available");
		return employeeMapper.toEmployeeDTOList(retrievedEmployeeList);
	}



	public EmployeeDTO addEmployee(EmployeeDTO employeeDto) {
		EmployeeEntity savedEmployee = employeeRepository.save(employeeMapper.toEmployeeEntity(employeeDto));
		return employeeMapper.toEmployeeDTO(savedEmployee);
	}



	public EmployeeDTO deleteEmployee(long id) {
		EmployeeEntity deletedEmployee= employeeRepository.findById(id).orElse(null);
		employeeRepository.deleteById(id);
		return employeeMapper.toEmployeeDTO(deletedEmployee);
	}



	public EmployeeDTO updateEmployee(EmployeeDTO employeeDto) {
		EmployeeEntity savedEmployee = employeeRepository.save(employeeMapper.toEmployeeEntity(employeeDto));
		return employeeMapper.toEmployeeDTO(savedEmployee);
	}



	public EmployeeDTO retrieveByEmployeeID(long id) {
		EmployeeEntity employeeById=employeeRepository.findById(id).orElse(null);
		return employeeMapper.toEmployeeDTO(employeeById);
	}

}
