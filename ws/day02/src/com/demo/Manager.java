package com.demo;

public class Manager {
	
	public void findBonus(Employee emp){
		if(emp.getDept().getName().equals("IT")) {
			long bonus= emp.getSalary()*5/100;
			System.out.println(emp.getName() + " has bonus : "+bonus);
		} else {
			System.out.println("sdfsdf");
		}
	}

}
