package com.demo.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInFile {
	
	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		
		String name = "123";
		
		
		fos.write(name.getBytes());
		
		System.out.println("File write is done");
		
		
		fos.close();
		
	}

}
