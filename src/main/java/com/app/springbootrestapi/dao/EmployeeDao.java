package com.app.springbootrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springbootrestapi.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
}
