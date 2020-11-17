package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Employee;
//import com.demo.entities.Movie;
import com.demo.service.EmployeeService;
//import com.demo.service.MovieService;

@RestController
@RequestMapping(path = "/api/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "")
	public List<Employee> getAllEmployees(){
		return this.employeeService.getAllEmployees();
	}
	
	@GetMapping(path = "/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") Long id) {
		return this.employeeService.getEmployee(id);
	}
	
	@PostMapping(path = "/post")
	public Employee createEmployee(@Valid @RequestBody  Employee emp) {
	System.out.println(emp);
	return this.employeeService.save(emp);
}

}