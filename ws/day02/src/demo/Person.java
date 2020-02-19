package demo;

public class Person {
	private String name;
	private int age;
	
	public void setAge(int age) {
		if(age<18) {}else {
			this.age = age;
		}
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
