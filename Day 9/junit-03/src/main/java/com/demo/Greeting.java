package com.demo;

public class Greeting {

	public String greet(String name) {
		if (name == null) {
			return "Hi " + null;
		} else if (name.length() == 0) {
			return "Hi ";
		} else {
			return "Hi " + (name.charAt(0) + "").toUpperCase()
					+ name.substring(1).toLowerCase();
		}
	}

		public String greet2(String name) throws Exception {
			if (name == null) {
				throw new NullPointerException();
			} else if (name.length() == 0) {
				throw new IllegalArgumentException();
			}
			
				return "Hi " + (name.charAt(0) + "").toUpperCase()
						+ name.substring(1).toLowerCase();
			
		}
		
		public String waitMethod(){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "hello";
		}

}
