package com.demo.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
//		File file = new File("D:\\Training\\Chandigarh - IBM\\IBM_C\\kbd\\abc");
//		System.out.println("Directory: "+file.isDirectory());
//		file.listFiles();
		
		File file = new File("D:\\Training\\Chandigarh - IBM\\IBM_C\\kbd\\abc\\xyz.txt");
		System.out.println("Directory: "+file.isDirectory());
		if(file.exists()) {
			System.out.println("Already available");
		} else {
			file.createNewFile();
		}
		System.out.println("Location: "+file.getPath());

	}
}
