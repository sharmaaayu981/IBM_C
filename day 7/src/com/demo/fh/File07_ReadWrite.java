package com.demo.fh;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File07_ReadWrite {

	public static void main(String[] args) throws IOException {
		File file = new File("myFile.txt");
		File file2 = new File("myFile2.txt");

		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(file2);
		int ch;
		while((ch=fr.read())!=-1) {
//			System.out.print((char)ch);
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
	}
}
