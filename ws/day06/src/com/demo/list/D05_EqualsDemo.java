package com.demo.list;

class Employee {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
public class D05_EqualsDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		if(a==b) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		String name1 = new String("mark");
		String name2 = new String("mark");
		if(name1.equals(name2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		Employee emp1 = new Employee("mark", 45);
		Employee emp2 = new Employee("mark", 33);
		Employee emp3 = new Employee("mark", 45);
		
		System.out.print("Emp1 & Emp2 are ");
		if(emp1.equals(emp2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		System.out.print("Emp1 & Emp3 are ");
		if(emp1.equals(emp3)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

	}
}
