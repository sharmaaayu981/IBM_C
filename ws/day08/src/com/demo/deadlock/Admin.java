package com.demo.deadlock;

import java.util.List;

public class Admin implements Runnable, Constants {

	private List<Integer> list;

	public Admin(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while(true) {
			produce();
		}
	}

	private void produce() {
		
			if(list.size()==MAX) {
				try {
					synchronized (list) {
						list.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.add((int)Math.ceil(Math.random()*1000));
				System.out.println("Admin has produced item...");
				synchronized (list) {
					list.notify();
				}
			
			
		}
	}

}
