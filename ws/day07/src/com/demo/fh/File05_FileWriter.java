package com.demo.fh;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File05_FileWriter {
	
	public static void main(String[] args) throws IOException {
		File file = new File("myFile.txt");
		FileWriter fw = new FileWriter(file);
		String name = "Arun Kumar";
		
		fw.write(name);

		
		fw.close();
		
	}
}
