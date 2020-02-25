package com.demo.list;

import java.util.ArrayList;

public class D06_Search {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("Thakur", 26));
		list.add(new Student("Mohit", 23));
		list.add(new Student("Carl", 31));
		list.add(new Student("Mark", 21));
		
		boolean found = list.contains(new Student("Carl", 31));
		
		System.out.println(found);
	}
}
