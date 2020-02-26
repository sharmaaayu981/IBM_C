package com.demo.fh;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File08_ByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos1 = new FileOutputStream("myFile.txt");
		FileOutputStream fos2 = new FileOutputStream("myFile2.txt");
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write("Hello byte array output stream".getBytes());
		
		baos.writeTo(fos1);
		baos.writeTo(fos2);
		
		baos.flush();
	}
}
