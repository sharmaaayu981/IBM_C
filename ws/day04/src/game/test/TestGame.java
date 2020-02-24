package game.test;

import java.util.Scanner;

import game.Player;
import game.WhitePlayer;

public class TestGame {
	public static void main(String[] args) {
		Player wp = new WhitePlayer();
//		wp.getHit(50);
//		wp.eatPower(20);
//		wp.getHit(50);
//		
		String str = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Press 1 to get hit");
			System.out.print("Press 2 to eat power");
			System.out.println("Press Y to get exit");
			str = sc.next();
			switch(str) {
			case "1":
				wp.getHit(50);
				break;
			case "2":
				wp.eatPower(20);
				break;
			}
		}while(!str.equalsIgnoreCase("y"));
		System.out.println("Thank you to play");
		
	}
}
