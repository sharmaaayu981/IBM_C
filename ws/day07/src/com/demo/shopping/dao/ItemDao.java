package com.demo.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.shopping.beans.Item;

public class ItemDao {
	

	public static List<Item> getItems(){
		
		// db connect and fetch items
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(99, "Comic", "Kids Stories"));
		items.add(new Item(19999, "TV", "Sony123"));
		items.add(new Item(15000, "Mobile", "Moto"));
		
		return items;
	}
	
//	updateItem
}
