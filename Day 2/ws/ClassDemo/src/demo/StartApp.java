package demo;

public class StartApp {

	public static void main(String[] args) {
		Employee ram = new Employee();
		
//		ram.showEmpDetails();
//		ram.name = "Ram Kapoor";
//		ram.empId = 123;
//		ram.address = "Japan";
//		ram.age = 0;
//		ram.salary = 5;
		ram.updateEmpDetails("Ram Kapoor", 123, "HR", "Tokyo", 24, 123456);
//		System.out.println(ram.toString());
		System.out.println(ram);
//		ram.showEmpDetails();
//		ram.equals(null);
	}
}
