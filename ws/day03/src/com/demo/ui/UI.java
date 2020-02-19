package com.demo.ui;

import java.util.Scanner;

public class UI {
	public void login(){
		UserDTO userDTO = new UserDTO();

		System.out.println("Enter userid:");
		String userid = new Scanner(System.in).next();

		System.out.println("Enter password:");
		String password = new Scanner(System.in).next();
		
		userDTO.setUserid(userid);
		userDTO.setPwd(password);
		
		BL businessLogic = new BL();
		if(businessLogic.validateData(userDTO)){
			userDTO.setMsg("Welcome "+userDTO.getUserid());
		}

		
		System.out.println(userDTO.getMsg());
	}

}
