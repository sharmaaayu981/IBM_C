package com.demo.fh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File09_InputReader {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = br.readLine();
		System.out.println("Output: "+readLine);
		
	}
}
