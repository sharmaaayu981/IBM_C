package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		List<String> names = new ArrayList<String>();
		
		String[] strNames = {"manoj","kishore", "carl","jaivik"};
		
		list.add(25);
		for(String name: strNames) {
			list.add(name);
			names.add(name);
		}
		
//		System.out.println(list);
//		System.out.println(names);
		
//		for(Object name: list) {
//			String n = (String)name;
//			System.out.println(n.toUpperCase());
//		}
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(Integer.valueOf(23));
		
		
		
		

	}

}
