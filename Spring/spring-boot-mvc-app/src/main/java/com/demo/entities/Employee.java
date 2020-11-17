package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull(message = "Cannot be empty!!!")
	private String ename;
	
	@NotNull(message = "Cannot be empty!!!")
	private String city;
	
	@NotNull(message = "Cannot be empty!!!")
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(long id, String ename, String city, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.city = city;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
