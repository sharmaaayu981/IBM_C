package com.test;

import org.junit.Assert;
import org.junit.Test;

public class TestBasic {

//	@Test
	public void testCase() {
//		throw new NullPointerException();
		System.out.println("Junit running...");
	}

//	@Test
	public void testCase2() {
//		throw new NullPointerException();
		System.out.println("Junit running again...");
	}

//	@Test
	public void testCase3() {
		int a = 4;
		int b = 2;
		
		Assert.assertTrue("absdflkj", a==b);
//		Assert.assertTrue(a>b);
	}
//	@Test
//	public void testCase4() {
//		String name = new String("abc");
//		String name2 = new String("abc");
////		Assert.assertSame(name, name2);
//		Assert.assertEquals(name, name2);
//		
////		Assert.assertTrue(pi);
////		== vs equals
//	}
	
	@Test
	public void testCase5() {
		double pi = 3.14;
		
		Assert.assertEquals(3.30, pi, 0.14d);
	}
}