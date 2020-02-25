package com.demo.col.party;

public class Invitations {
	public static void main(String[] args) {
		Party bp = new Party();


		bp.invite("Mark");
		bp.invite("Arun");
		bp.sort();
		bp.search("MOhit");
		System.out.println(bp);
		}
}
