package com.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Friend {
	public String name;
	public int age;
	public long phone;
	
	public Friend(String name, int age, long phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
}
public class PhoneBook {
	public static void main(String[] args) {
		Friend ram = new Friend("Ram Kapoor", 23, 9898989898L);
		Friend mark = new Friend("Mark", 24, 9584746965L);
		Friend carl = new Friend("Carl", 20, 7898546975L);
		
//		List --> ArrayList, LinkedList, Vector, Stack
//		Map --> HashTable, HashMap, TreeMap
		Map<Object, Object> phoneBook = new HashMap<Object, Object>();
		
		phoneBook.put(ram.phone, ram);
		phoneBook.put(mark.phone, mark);
		phoneBook.put(carl.phone, carl);
		
//		System.out.println(phoneBook);
		
		Set<Object> keySet = phoneBook.keySet();
		Iterator<Object> i = keySet.iterator();
		while(i.hasNext()) {
			System.out.println(phoneBook.get(i.next()));
		}
	}
}
