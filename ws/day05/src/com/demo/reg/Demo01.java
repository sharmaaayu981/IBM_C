package com.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {

	public static void main(String[] args) {
//		String regEx = "[A|a]";
//		String regEx = "[A-Za-z][A-Za-z][A-Za-z][A-Za-z]";
		String regEx = "[A-Za-z]+";
		
//		System.out.println("A".matches(regEx));
//		System.out.println("a".matches(regEx));
//		System.out.println("arun".matches(regEx));
//		System.out.println("".matches(regEx));

		
		Pattern p = Pattern.compile(regEx);
		Matcher matcher = p.matcher("123Mahesh");
		
		System.out.println(matcher.find());
		System.out.println(matcher.start());
		
		System.out.println(matcher.group());
	}
}
