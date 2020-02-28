package com.demo.shop;

import java.sql.SQLException;

public class OrderBOImpl implements OrderBO {
	private OrderDao dao;
	public OrderBOImpl(OrderDao dao){
		this.dao = dao;
	}

	public boolean placeOrder(Order order) throws SQLException, BOException {
		try{
			int id = dao.createOrder(order);// sqlException
			if(id==0){
				return false;
			}
		} catch(ArithmeticException ae){
			throw new BOException(ae);
		} catch(SQLException sqle){
			System.out.println("in SQLException catch block");
			throw new BOException(sqle);
		} catch (Exception e) {
			throw new BOException(e);
		}
		
		return true;

	}

	public boolean deleteOrder(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean cancleOrder(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
