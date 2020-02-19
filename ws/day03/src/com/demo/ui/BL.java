package com.demo.ui;

public class BL {
	
	public boolean validateData(UserDTO userDTO){
		boolean isValid = false;
		if(userDTO.getUserid().length() > 0 && userDTO.getPwd().length() > 0){
			isValid = isAuthorisedUser(userDTO);
		}
		else
			userDTO.setMsg("Invalid user");
		
		return isValid;
	}
	
	private boolean isAuthorisedUser(UserDTO userDTO){
		boolean flag = false;
		DB db = new DB();
		flag = db.isRegistered(userDTO);
		return flag;
	}
	

}
