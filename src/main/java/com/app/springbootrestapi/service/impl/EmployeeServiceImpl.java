package com.app.springbootrestapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootrestapi.dao.EmployeeDao;
import com.app.springbootrestapi.entity.Employee;
import com.app.springbootrestapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		return employeeDao.findOne(employeeId);
	}

	@Override
	public void deleteEmployee(long employeeId) {
		employeeDao.delete(employeeId);
	}

}
