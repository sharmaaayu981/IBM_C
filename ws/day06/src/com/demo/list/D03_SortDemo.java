package com.demo.list;

import java.util.ArrayList;
import java.util.Collections;

class Friend implements Comparable{
	private String name;
	private int age;
	
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//		Friend f = (Friend)o;
//		if(this.age>f.age) {
//			return -1;
//		}else if(this.age<f.age) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
	@Override
	public int compareTo(Object o) {
		Friend f = (Friend)o;
		return f.name.compareTo(this.name);
	}
	
}
public class D03_SortDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Friend("Thakur", 26));
		list.add(new Friend("Mohit", 23));
		list.add(new Friend("Carl", 31));
		list.add(new Friend("Mark", 21));
		
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
