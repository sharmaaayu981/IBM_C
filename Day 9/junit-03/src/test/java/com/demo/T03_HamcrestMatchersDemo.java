package com.demo;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class T03_HamcrestMatchersDemo {

	@Test
	public void testCoreMatchers(){
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		assertThat(str1, equalTo(str2));
		assertThat(str1, not(equalTo("mango")));
		
		double pi = 3.14;
		assertThat(pi, is(3.14));
		assertThat(pi, not(is(3.1)));
		
		assertThat(2+2, is(equalTo(4)));
		
		
		assertThat(str1, is(allOf(notNullValue(), instanceOf(String.class), equalTo("abc"))));
		
		assertThat(str1, is(not(allOf(notNullValue(), instanceOf(Integer.class), equalTo("abc")))));

		assertThat(str1, is(anything()));
		assertThat(2, is(anything()));
		assertThat(null, is(anything()));
		assertThat(new Exception(), is(anything()));
	}
	
	@Test
	public void testListItems(){
		List<String> list = new ArrayList<String>(){
			{
				add("one");
				add("two");
				add("three");
			}
		};
		
		assertThat(list, hasItem("two"));
		assertThat(list, hasItems("one", "three"));
		assertThat(list, not(hasItem("four")));
	}
}
