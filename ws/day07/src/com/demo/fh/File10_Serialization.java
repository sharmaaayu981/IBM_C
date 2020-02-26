package com.demo.fh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

class Item implements Serializable{
	String name;
	int code;
	double price;
	Date date;
	
	public Item(String name, int code, double price, Date date) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", code=" + code + ", price=" + price + ", date=" + date + "]";
	}
}

public class File10_Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("item.txt");
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		Item[] items = {
			new Item("Mobile", 1607, 12999, Calendar.getInstance().getTime()),
			new Item("Laptop", 1579, 56999, Calendar.getInstance().getTime()),
			new Item("TV", 1369, 18999, Calendar.getInstance().getTime())
		};
		
		oo.writeObject(items);
		
		System.out.println("Write operation done...");
		
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Item[] readObject = (Item[]) oi.readObject();
		System.out.println(Arrays.toString(readObject));
	}
}
