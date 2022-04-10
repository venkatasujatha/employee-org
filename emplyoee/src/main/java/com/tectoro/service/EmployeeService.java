package com.tectoro.service;

import java.util.List;

import com.tectoro.entity.Employee;

public interface EmployeeService {
	public Employee saveEmp(Employee employee);
	public List<Employee> getAllEmp(Employee employee);
	public void deleteEmp(String firstName);
	public Employee updateSalary(int id,long salary);
	public List<Employee>  moreThanFiveLak();
	public List<Employee>  moreThanTwoYExp();
	public List<Employee>  desOredrByName();
	
}
