package com.demo.shopping.beans;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> items=new ArrayList<Item>();

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}


}
