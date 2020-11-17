package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Employee;
//import com.demo.entities.Movie;
import com.demo.repositories.EmployeeRepository;
//import com.demo.repositories.MovieRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	public Employee save(Employee e) {
		
		Employee emp = null;
		
		if(e.getId() == 0L) {
			emp = employeeRepository.save(e);
		}else {
			emp = getEmployee(e.getId());
			if(emp!=null) {
				emp.setEname(e.getEname());
				emp.setId(e.getId());
				emp.setCity(e.getCity());
				emp.setSalary(e.getSalary());
			}
		}
		
		return emp;
		
		
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployee(Long id) {
		Optional<Employee> optEmp =  employeeRepository.findById(id);
		Employee e = null;
		if(optEmp.isPresent())
			e = optEmp.get();
		
		return e;
	}
	
	public Employee remove(Long id) {
		Employee e = getEmployee(id);
		if(e!=null) {
			employeeRepository.delete(e);
		}
		return e;
	}
}