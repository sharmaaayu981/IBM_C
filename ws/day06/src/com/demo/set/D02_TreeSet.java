package com.demo.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable {
	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(Object o) {
		Book book = (Book) o;
		return this.getTitle().compareTo(book.getTitle());
//		return this.getPrice()-book.getPrice();
	}

}

class SortBook_Price implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		return b1.getPrice()-b2.getPrice();
	}
	
}

public class D02_TreeSet {

	public static void main(String[] args) {
		Set books = new TreeSet(new SortBook_Price());

		books.add(new Book("Java", 699));
		books.add(new Book("JavaScript", 399));
		books.add(new Book("HTML", 299));
		books.add(new Comic("Nagraj", 99));

		System.out.println(books);

	}
}

class Comic extends Book{
	public Comic(String title, int price) {
		super(title, price);
	}
}
