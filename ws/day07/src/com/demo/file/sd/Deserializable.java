package com.demo.file.sd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("bookdata.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Book book = (Book)ois.readObject();
		
		System.out.println(book);
		ois.close();
		fis.close();
		
	}
}
