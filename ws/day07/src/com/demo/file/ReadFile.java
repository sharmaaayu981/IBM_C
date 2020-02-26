package com.demo.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int read;
		
		while((read=fis.read())!=-1) {
			System.out.print((char)read);
		}
		
		System.out.println(read);
		
		fis.close();
		
	}

}
