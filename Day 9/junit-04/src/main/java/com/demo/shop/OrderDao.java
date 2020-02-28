package com.demo.shop;

import java.sql.SQLException;

public interface OrderDao {
	int createOrder(Order order) throws SQLException, BOException;
	Order readOrder(int id) throws SQLException, BOException;
	int updateOrder(int id, Order order) throws SQLException, BOException;
	int deleteOrder(int id) throws SQLException, BOException;
}
