package com.demo.file.sd;

import java.io.Serializable;

public class Book implements Serializable{
	
	private String title;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
}
