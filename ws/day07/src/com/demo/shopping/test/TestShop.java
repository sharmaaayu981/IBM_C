package com.demo.shopping.test;

import java.util.List;
import java.util.Scanner;

import com.demo.shopping.beans.Customer;
import com.demo.shopping.beans.Invoice;
import com.demo.shopping.beans.Item;
import com.demo.shopping.dao.Service;

public class TestShop {
	public static void main(String[] args) {
//		System.out.println("Items");
		List<Item> items = Service.getItems();
		for(int i=1;i<=items.size();i++) {
			System.out.println(i+". "+items.get(i-1));
		}
		System.out.println("Select your item: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		Service service = new Service();
		switch(option) {
		case 1:
			service.addToCart(items.get(0));
			break;
		case 2:
			service.addToCart(items.get(1));
			break;
		case 3:
			service.addToCart(items.get(2));
			break;
		default:
			System.out.println("You are logged out...");
		}
		
		System.out.println("Cart....");
		System.out.println(service.getCart());
		
		System.out.println("Generate invoice...");
		Invoice invoice = service.generateInvoice(new Customer("Jaivik", 98989898L));
		
		System.out.println("Invoice is ready....");
		System.out.println(invoice);
		
		
	}
}
