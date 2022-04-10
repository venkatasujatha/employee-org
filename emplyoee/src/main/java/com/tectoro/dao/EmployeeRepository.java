package com.tectoro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.tectoro.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	@Query(value = "delete from employee  where first_name =?1")
	public String removeEmp(@PathVariable("first_name") String firstName);
	@Query(value = "SELECT l FROM employee l WHERE l.salary >=500000")
	public List<Employee> aboveFiveLak();
	@Query(value = "SELECT l FROM employee l WHERE l.experience >=2")
	public List<Employee> aboveTwoYExp();
	@Query(value = "SELECT l FROM employee l order by first_name DESC")
	public List<Employee> desOrderName();
	
	

}
