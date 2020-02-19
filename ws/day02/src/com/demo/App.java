package com.demo;

public class App {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Mark", new Department("IT"), 100, 1999);
		Employee emp2 = new Employee("Carl", new Department("HR"), 100, 1999);
		Employee emp3 = new Employee("Mohan", new Department("Account"), 100, 1999);
		Employee emp4 = new Employee("Miley", new Department("IT"), 200, 2017);
		
		Manager manager = new Manager();
		manager.findBonus(emp1);
		
	}
}
