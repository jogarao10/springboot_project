package com.cs.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	 
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {
		Iterable<Employee> iterable = employeeManagementService.getAllEmployees();
		map.put("empsList", iterable);
		return "show_employee_report";
	}
	
	@GetMapping("/emp_add")
	public String showFormForSaveEmployee(@ModelAttribute("empoyee") Employee employee) {
		return "register_employee";
	}
	
	@PostMapping("/emp_add")
	public String saveEmployee(@ModelAttribute("employee") Employee employee,Map<String, Object> map) {
		
		String msg = employeeManagementService.registerEmployee(employee);
		Iterable<Employee> itEmps = employeeManagementService.getAllEmployees();
		
		map.put("resultMsg", msg);
		map.put("empsList", itEmps);
		
		return "show_employee_report";
	}

}
