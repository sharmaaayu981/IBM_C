package com.demo.fh;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File03_BufferedWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("myFile.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String name = "Arun Kumar";
		byte[] bytes = name.getBytes();
		
		bos.write(bytes);
		
		bos.close();
		fos.close();
	}
}
