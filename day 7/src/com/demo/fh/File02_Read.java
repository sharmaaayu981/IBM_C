package com.demo.fh;

import java.io.FileInputStream;
import java.io.IOException;

public class File02_Read {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("myFile.txt");
		
		int read = 0;
		for(;(read = fis.read())>0;) {
			System.out.print((char)read);
		}
//		while((read = fis.read())>0) {
//			System.out.print((char)read);
//		}
		
		System.out.println(read);
	}
}
