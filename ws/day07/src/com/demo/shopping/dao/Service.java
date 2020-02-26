package com.demo.shopping.dao;

import java.util.Date;
import java.util.List;

import com.demo.shopping.beans.Cart;
import com.demo.shopping.beans.Customer;
import com.demo.shopping.beans.Invoice;
import com.demo.shopping.beans.Item;

public class Service {

	Cart cart = new Cart();
	
	public static List<Item> getItems(){
		
		return ItemDao.getItems();
	}
	
	public void addToCart(Item item) {
		List<Item> items = cart.getItems();
		items.add(item);
	}
	
	public Cart getCart() {
		return cart;
	}
	
	public Invoice generateInvoice(Customer cus){
		return new Invoice(cus, cart.getItems(), new Date());
	}
}
