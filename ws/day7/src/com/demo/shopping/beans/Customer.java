package com.demo.shopping.beans;

public class Customer {
	private String name;
	private long phone;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Customer(String name, long phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	
}
