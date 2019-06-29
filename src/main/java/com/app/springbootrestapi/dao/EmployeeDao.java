package com.app.springbootrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springbootrestapi.entity.Employee;

//used long because our Employee ID is of type long
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
}
