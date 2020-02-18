package demo;

public class Employee {
	
	/*---------*/
	
	// constructor

	
	// states -> variable
	// behaviours --> method
	
	private String name;
	private int empId;
	private String dept;
	private long salary;
	private String address;
	private int age; 
	
//	Department dept = null;
	
	public void updateEmpDetails(
			String name, int id, 
			String dept, String address, 
			int age, long s) {
		this.name = name;
		empId = id;
		this.dept = dept;
		this.address = address;
		this.age = age;
		this.salary = s;
	}
	
	
	
	
	
	
	public void setTaskStatus(){
		// code
	}






	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", dept=" + dept + ", salary=" + salary + ", address="
				+ address + ", age=" + age + "]";
	}






	
//	public void showEmpDetails(){
//		// code
//		System.out.println("Name is "+name);
//		System.out.println("EmpId is "+empId);
//		System.out.println("Dept is "+dept);
//		System.out.println("Address is "+address);
//		System.out.println("Age is "+age);
//		System.out.println("Salary is "+salary);
//	}
	
//	public void showEmpDetails(){
//		// code
//		System.out.println("Name is "+name);
//		System.out.println("EmpId is "+empId);
//		System.out.println("Dept is "+dept);
//		System.out.println("Address is "+address);
//		System.out.println("Age is "+age);
//		System.out.println("Salary is "+salary);
//	}
	
	

}
