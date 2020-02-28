package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class T02_AssertionsDemo {

	@Test
	public void testStringAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";

		// System.out.println(str1 == str2);
		// System.out.println(str1.equals(str2));

		// equal()
		assertEquals(str1, str2);
		assertNotNull(str1);
		assertNull(str3);

		// ==
		assertSame(str4, str5);
	}

	@Test
	public void testOtherAssertions() {
		int val1 = 4;
		int val2 = 5;
		int val3 = 4;

		// equal()
		assertEquals(val1, val3);
		// ==
		assertSame(val1, val3);
		
		assertTrue(val1<val2);
		assertFalse(val1>val2);
	}
	
	@Test
	public void testArrayAssertions() {
		String arr1[] = {"one", "two", "three"};
		String arr2[] = {"one", "two", "three"};
		
		assertArrayEquals(arr1, arr2);
	}
	

}
