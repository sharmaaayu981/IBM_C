package com.demo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class D02_Loop {
	Vector c;

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		list.add(15);
		list.add("Kumar");
		list.add(null);
		list.add(2, new Book());
		list.add(23);
		list.add(new String("IBM"));
		
//		Object[] data = new Object[10];
//		enhancedForLoop(list);
		forLoop(list);
		
//		iteratorLoop(list);
	}

	private static void iteratorLoop(ArrayList list) {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

	private static void forLoop(ArrayList list) {
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1) {
				list.remove(i);
			}
			System.out.println(list.get(i));
		}
	}

	private static void enhancedForLoop(ArrayList list) {
		for(Object d:list) {
			System.out.println(d);
		}
	}
}
