package com.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.entity.Employee;
import com.cs.repository.IEmployeeRepository;

@Service
public class EmployeeManagementServiceImplementation implements IEmployeeManagementService {
	
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Override
	public Iterable<Employee> getAllEmployees() {
		
		
		return employeeRepository.findAll();
	}

	@Override
	public String registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return "Employee Saved with Id value"+employeeRepository.save(employee).getEmployeeNumber();
	}

}
