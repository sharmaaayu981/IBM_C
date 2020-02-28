package com.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class T01_TestGreetings {

	Greeting greeting = new Greeting();
	
	@Test
	public void shouldGreetUser() throws Exception{
		String result = greeting.greet("aRuN");
		System.out.println(result);
		assertEquals(result, "Hi Arun");
	}
	
	@Test
	public void shouldNotGreetWithEmptyString(){
		String result = greeting.greet("");
		System.out.println(result);
		assertEquals(result, "Hi ");
	}
	@Test
	public void shouldNotGreetWithNull(){
		String name = null;
		String result = greeting.greet(name);
		System.out.println(result);
		assertEquals(result, "Hi "+name);
	}
	
	
	@Test
	public void shouldGreetUser2() throws Exception{
		String result = greeting.greet2("aRuN");
		System.out.println(result);
		assertEquals(result, "Hi Arun");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldNotGreetWithEmptyString2() throws Exception{
		String res = greeting.greet2("");
//		assertEqual..
	}

	@Test(expected=NullPointerException.class)
	public void shouldNotGreetWithNull2() throws Exception{
		greeting.greet2(null);
	}
	
	@Test(timeout=400)
	public void shouldTestSleep(){
		assertEquals(greeting.waitMethod(), "hello");
	}
	
}
