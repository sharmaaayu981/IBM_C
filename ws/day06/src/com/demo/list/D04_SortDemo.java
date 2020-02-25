package com.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

class SortStudentAge implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student std1 = (Student) o1;
		Student std2 = (Student) o2;
		
		return std1.getAge()-std2.getAge();
	}
	
}
class SortStudentName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student std1 = (Student) o1;
		Student std2 = (Student) o2;
		
		return std1.getName().compareTo(std2.getName());

	}
	
}
public class D04_SortDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("Thakur", 26));
		list.add(new Student("Mohit", 23));
		list.add(new Student("Carl", 31));
		list.add(new Student("Mark", 21));
		
		Collections.sort(list, new SortStudentName());
		
		System.out.println(list);
	}
}
