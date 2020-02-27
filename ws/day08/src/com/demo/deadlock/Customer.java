package com.demo.deadlock;

import java.util.List;

public class Customer implements Runnable, Constants {
	private List<Integer> list;

	public Customer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while (true) {
			consume();
		}
	}

	private void consume() {

		if (list.size() == MIN) {
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
			Integer item = list.remove(0);
			System.out.println("Customer has consumed: " + item);
			synchronized (list) {
				list.notify();
			}
		}
	}

}
