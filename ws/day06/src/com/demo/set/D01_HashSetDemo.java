package com.demo.set;

import java.util.HashSet;
import java.util.Set;

public class D01_HashSetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("mark");
		set.add("carl");
		set.add("mike");
		set.add("carl");

		set.add(5);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(6);
		set.add(1);
		set.add(9);
		set.add(4);
		
		System.out.println(set);
		
//		for(Object o: set) {
//			System.out.println(o);
//		}
		
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
	}
}
