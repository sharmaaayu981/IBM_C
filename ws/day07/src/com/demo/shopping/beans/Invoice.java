package com.demo.shopping.beans;

import java.util.Date;
import java.util.List;

public class Invoice {
	private Customer customer;
	private List<Item> items;
	private Date today;
	
	@Override
	public String toString() {
		return "Invoice [customer=" + customer + ", items=" + items + ", today=" + today + "]";
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	public Invoice(Customer customer, List<Item> items, Date date) {
		super();
		this.customer = customer;
		this.items = items;
		this.today = date;
	}
	
	

}
