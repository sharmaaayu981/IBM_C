package com.demo;

public class Employee {
	
	private String name;
	private Department dept;
	private int salary;
	private int year;
	
	public Employee(String name, Department dept, int salary, int year) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", year=" + year + "]";
	}
	
	
	
	

}
