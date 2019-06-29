package com.app.springbootrestapi.service;

import java.util.List;

import com.app.springbootrestapi.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee); //save employee pojo
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployeeList();
	
	Employee getEmployee(Long id);
	
	void deleteEmployee(long employeeId);
}
