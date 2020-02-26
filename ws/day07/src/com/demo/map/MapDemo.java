package com.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//		Map --> HashTable, HashMap, TreeMap
		
		Map<Object, Object> hm = new HashMap<Object, Object>();
		Map<Object, Object> tm = new TreeMap<Object, Object>();
		
		String[] names = {"manoj","kishore", "carl","jaivik"};
		for(String name:names) {
			hm.put(name, name);
			tm.put(name, name);
		}
		System.out.println(hm);
		System.out.println(tm);
	}
}
