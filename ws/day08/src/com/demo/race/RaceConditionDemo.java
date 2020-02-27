package com.demo.race;

class Order implements Runnable {
	int orderQuantity = 0;
	static int totalQuantity = 10;

	public Order(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}


	public static boolean placeOrder(int orderQuantity) throws InterruptedException {
		boolean isQuantityAvailable = false;
		synchronized (Order.class) {
			if (orderQuantity <= totalQuantity) {
				Thread.sleep(10);
				totalQuantity -= orderQuantity;
				System.out.println("To be sold quantity : " + orderQuantity);
				System.out.println("Available quantity : " + totalQuantity);
				isQuantityAvailable = true;
			} else {
				System.out.println(orderQuantity + " items not available");
				System.out.println("Available Quantities: " + totalQuantity);
			}
		}
		return isQuantityAvailable;
	}

	@Override
	public void run() {
		System.out.print("\n");
		try {
			System.out.println("Sold : " + Order.placeOrder(orderQuantity));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("\n");
	}

}

public class RaceConditionDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Order(6));
		Thread t2 = new Thread(new Order(5));

		t1.start();
		t2.start();
	}
}
