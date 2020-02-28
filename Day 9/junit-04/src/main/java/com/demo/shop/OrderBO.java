package com.demo.shop;

import java.sql.SQLException;

public interface OrderBO {

	boolean placeOrder(Order order) throws SQLException, BOException;
	boolean deleteOrder(int id) throws SQLException;
	boolean cancleOrder(int id) throws SQLException;
	
}
