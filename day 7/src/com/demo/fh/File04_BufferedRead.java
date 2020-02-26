package com.demo.fh;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class File04_BufferedRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("myFile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int read = 0;
		while((read = bis.read())>=0) {
			System.out.print((char)read);
		}
		bis.close();
		fis.close();
		
	}
}
