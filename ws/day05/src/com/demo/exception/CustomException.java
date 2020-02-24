package com.demo.exception;

class User{
	public String name;
	public int age;
	public String address;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

class LicenseAuthority {
	public boolean apply(User user) throws InvalidUserExceptoin {
		return validate(user);
	}
	private boolean validate(User user) throws InvalidUserExceptoin{
		if(user.age>=18) {
			return true;
		} else {
//			return false;
			throw new InvalidUserExceptoin("Age is less than 18");
		}
	}
}

public class CustomException {
	
	public static void main(String[] args) {
		User user = new User("Arun", 15);
		LicenseAuthority la = new LicenseAuthority();
		try {
			System.out.println(la.apply(user));
		} catch (InvalidUserExceptoin e) {
			System.out.println("License user age is minor");
			System.out.println(e);
		}
		
	}

}
