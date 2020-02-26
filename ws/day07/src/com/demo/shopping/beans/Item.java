package com.demo.shopping.beans;

public class Item {
	private int price;
	private String name;
	private String code;
	
	public Item(int price, String name, String code) {
		super();
		this.price = price;
		this.name = name;
		this.code = code;
	}
	@Override
	public String toString() {
		return "Item [price=" + price + ", name=" + name + ", code=" + code + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
