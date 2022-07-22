package com.controlstatement;

public class IfElseLadder {
	public static void main(String[] args) {
		int a = 20;
		int b = 100;

		if (a == 5) {
			System.out.println("a is equal to 5");
		} else if (a < b) {
			System.out.println("a is small");
		} else if (a == b) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("b is small");
		}
	}

}
