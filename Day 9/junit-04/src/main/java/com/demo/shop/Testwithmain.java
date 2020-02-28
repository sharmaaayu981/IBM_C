package com.demo.shop;

import java.sql.SQLException;

public class Testwithmain {

	public static void main(String[] args) throws SQLException, BOException {
		OrderDaoImpl dao = new OrderDaoImpl();
		OrderBO bo = new OrderBOImpl(dao);
		
		Order o = new Order();
		boolean placeOrder = bo.placeOrder(o);
		System.out.println(placeOrder);
	}
}
