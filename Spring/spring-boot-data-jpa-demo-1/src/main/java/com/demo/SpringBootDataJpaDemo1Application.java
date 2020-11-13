package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Employee;
import com.demo.services.EmployeeService;

@SpringBootApplication
public class SpringBootDataJpaDemo1Application implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//	  Employee e = 	employeeService.save(new Employee("MS", "Dhoni", "Ranchi", 100000.00));
//	  System.out.println(e);
	  
	  
//	  Employee e = 	employeeService.deleteById(1L);
//	  System.out.println(e +" has been deleted");
		
	
//		employeeService.findById(1L);
		
		List<Employee> e = employeeService.findAll();
		System.out.println(e);
		
	
	}

}