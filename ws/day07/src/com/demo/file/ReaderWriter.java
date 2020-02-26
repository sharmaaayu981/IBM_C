package com.demo.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		FileReader reader = new FileReader(file);
		
		reader.read();
	}
}
