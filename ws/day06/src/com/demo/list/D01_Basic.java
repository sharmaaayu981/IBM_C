package com.demo.list;

import java.util.ArrayList;
import java.util.Arrays;

class Book{
	String title;

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
}

public class D01_Basic {

	public static void main(String[] args) {
		Object[] data = new Object[10];
		data[0] = 13;
		data[1] = "Arun";
		data[2] = null;
		data[6] = true;
		data[9] = new Book();
		System.out.println(Arrays.toString(data));
		System.out.println(data[5]);
		
		ArrayList list = new ArrayList(5);
		list.add(15);
		list.add("Kumar");
		list.add(null);
		list.add(2, new Book());
		list.remove(3);
		
		System.out.println(list);
//		System.out.println(list.get(5));
		
		System.out.println(list.contains("Kumar"));
	}
}
