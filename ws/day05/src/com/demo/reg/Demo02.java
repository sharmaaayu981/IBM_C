package com.demo.reg;

public class Demo02 {

	public static void main(String[] args) {
		
		String[] names = 
			{"Mark", "Carl@gmail.com", "Ram_Kumar", "Miley123"};
		
		for(int i=0;i<names.length;i++) {
			if(names[i].matches("[A-Za-z]+")) {
				System.out.println(names[i]+" is valid name");
			} else {
				System.out.println(names[i]+" is not valid name");
			}
		}
		
		
	}
}
