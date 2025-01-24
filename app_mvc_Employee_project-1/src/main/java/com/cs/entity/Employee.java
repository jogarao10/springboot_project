package com.cs.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Data_1")
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeNumber;
	@Column(length = 20)
	private String employeeName;
	@Column(length = 20)
	private String employeeJob;
	private Double employeeSalary;
	private Integer employeeDepartmentNumber;
	
	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Integer getEmployeeDepartmentNumber() {
		return employeeDepartmentNumber;
	}
	public void setEmployeeDepartmentNumber(Integer employeeDepartmentNumber) {
		this.employeeDepartmentNumber = employeeDepartmentNumber;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeJob="
				+ employeeJob + ", employeeSalary=" + employeeSalary + ", employeeDepartmentNumber="
				+ employeeDepartmentNumber + "]";
	}
	
	
	

}
