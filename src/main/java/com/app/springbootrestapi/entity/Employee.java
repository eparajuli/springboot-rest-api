package com.app.springbootrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee") //this is how the name should appear in database table
@Setter
@Getter
public class Employee {
	
	@Id //primary ID
	@Column(name = "employee_id") // this is how column name should appear for this table in database table
	@GeneratedValue(strategy=GenerationType.AUTO) //defines how the id should be generated. Modify it as per your requirements
	private Long employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "salary")
	private Long salary;
	

}
