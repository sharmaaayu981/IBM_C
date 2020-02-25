package com.demo.col.party;

import java.util.ArrayList;
import java.util.Collections;

public class Party {
	private ArrayList list = new ArrayList();
	public boolean invite(String name) {
		return list.add(name);
	}
	public void sort() {
		Collections.sort(list);
	}
	@Override
	public String toString() {
		return "Party [list=" + list + "]";
	}
	
	public boolean search(String name) {
		return list.contains(name);
	}

}

