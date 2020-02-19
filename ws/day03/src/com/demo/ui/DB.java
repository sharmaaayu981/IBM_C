package com.demo.ui;

public class DB {
	public boolean isRegistered(UserDTO userDTO){
		boolean isValid = false;
		if(userDTO.getUserid().equalsIgnoreCase(userDTO.getPwd())){
			isValid = true;
		}
		else{
			userDTO.setMsg("Invalid user");
		}
		return isValid;
	}

}
