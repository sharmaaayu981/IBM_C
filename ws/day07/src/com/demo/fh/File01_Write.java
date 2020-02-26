package com.demo.fh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class File01_Write {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("myFile.txt");
//		byte[] bytes = {'A', 'r', 'u', 'n', 32, 'K', 'u', 'm', 'a', 'r'};
		byte[] bytes = "Arun Kumar".getBytes();
		System.out.println(Arrays.toString(bytes));
		
//		fos.write(65);
		fos.write(bytes);
		
		fos.close();
	}

}
