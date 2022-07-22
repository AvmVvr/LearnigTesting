package com.controlstatement;

public class DoWhile {
	public static void main(String[] args) {
		int seat = 200;
		System.out.println("Booking Started");
		do {
			System.out.println("Ticket no."+seat);
			seat--;
		} while (seat>=11);
		System.out.println("House full");
	}

}
