package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.Greeting;

public class TestGreet {
	
//	@AfterClass
//	@BeforeClass
	
	private Greeting g;
	@Before
	public void setup() {
		System.out.println("Before each test case...");
		g = new Greeting();
	}

	@After
	public void tearDown() {
		g = null;
		System.out.println("after each test case...");
	}
	@Test
	public void shouldGreet() {
//		Greeting g = new Greeting();
		String result = g.greet("mark");

		Assert.assertEquals("Welcome Mark", result);
		System.out.println("ShouldGreet");
	}
	@Test
	public void shouldGreet2() {
//		Greeting g = new Greeting();
		String result = g.greet("carl");

		Assert.assertEquals("Welcome Carl", result);
		System.out.println("ShouldGreet");
		
	}
	@Test(expected=NullPointerException.class)
	public void shouldNotGreetWithNull() {
//		Greeting g = new Greeting();
		System.out.println("ShouldNotGreet - Null");
		g.greet(null);
		
	}
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void shouldNotGreetWithBlank() {
//		Greeting g = new Greeting();
		System.out.println("ShouldNotGreet - Blank");
		g.greet("");
		
		
	}
}
