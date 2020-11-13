package com.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;


@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {
	
	public List<Employee> findAllByCity(String city);

}
