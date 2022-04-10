package com.tectoro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.entity.Employee;
import com.tectoro.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmp(employee);
	}
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployees(Employee employee){
		return employeeService.getAllEmp(employee);
	}
	@DeleteMapping("/delete/{firstName}")
	public void deleteEmployess(@PathVariable("firstName") String firstName) {
		employeeService.deleteEmp(firstName);
	}
	@PutMapping("/updateEmp/{id}/{salary}")
	public Employee updateEmployee(@PathVariable int id,@PathVariable long salary) {
		
		
		return employeeService.updateSalary(id, salary);
	}
	@GetMapping("/above5lak")
	public List<Employee> aboveFiveLak(Employee employees){
		return employeeService.moreThanFiveLak();
	}
	@GetMapping("/above2years")
	public List<Employee> moreThanTwoYearsEXpEmployees(){
		return employeeService.moreThanTwoYExp();
	}
	@GetMapping("/desorder")
	public List<Employee> desOrderByName(){
		return employeeService.desOredrByName();
	}
	

}
