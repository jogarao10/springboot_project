package com.cs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs.entity.Employee;
import com.cs.service.IEmployeeManagementService;

@Controller
public class EmployeeOperationsController {
	
	@Autowired
	private IEmployeeManagementService employeeManagementService;
	
	@GetMapping("/home")
	public String showHome() {
		return "home";
	}
	
	public String showEmployeeReport(Map<String, Object> map) {
		Iterable<Employee> iterable = employeeManagementService.getAllEmployees();
		map.put("empList", iterable);
		return "show_employee_report";
	}

}
