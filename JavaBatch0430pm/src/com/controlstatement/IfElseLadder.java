package com.controlstatement;

public class IfElseLadder {
	public static void main(String[] args) {
		int a = 500;
		int b = 10;

		if (a == b) {
			System.out.println("a is equal to b");
		} else if (b == 100) {
			System.out.println("b is equal to 100");
		} else if (a == 5) {
			System.out.println("a is equal to 5");
		} else if (a < b) {
			System.out.println("b is big");
		} else {
			System.out.println("Hi");
		}
	}

}