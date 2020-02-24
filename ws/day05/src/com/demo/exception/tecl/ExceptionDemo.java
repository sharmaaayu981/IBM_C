package com.demo.exception.tecl;

class DBLayer{
	private void getConnection() throws Exception {
//		System.out.println("db connection established");
//		try {
			throw new Exception("Too many connections");
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
	
	public String getData() throws Exception {
		getConnection();
		System.out.println("database data");
		return null;
	}
	
	
}

public class ExceptionDemo {

	public static void main(String[] args) {
		DBLayer dbl = new DBLayer();
		
		try {
		String data = dbl.getData();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Please try after some time");
		}
	}
}
