package com.tectoro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.dao.EmployeeRepository;
import com.tectoro.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmp(Employee employee) {
		
		return employeeRepository.findAll();
	}
	@Override
	public void deleteEmp(String firstName) {
		// TODO Auto-generated method stub
		 employeeRepository.removeEmp(firstName);
	}
	@Override
	public Employee updateSalary(int id,long salary) {
		Employee employee1=employeeRepository.getById(id);
		long salary1=employee1.getSalary()+salary;
		employee1.setSalary(salary1);
		return employeeRepository.save(employee1);
	}
	@Override
	public  List<Employee> moreThanFiveLak() {
		
		 
		return employeeRepository.aboveFiveLak();
		
		
	}
	@Override
	public List<Employee> moreThanTwoYExp() {
		
	
		return employeeRepository.aboveTwoYExp();
	}
	@Override
	public List<Employee> desOredrByName() {
		
		return employeeRepository.desOrderName();
	}
	

}
