package com.controlstatement;

public class NestedIfstatement {
	public static void main(String[] args) {
		int a = 300;
		int b = 150;
		int c = 350;

		if (a < b) {
			if (c < b) {
				System.out.println("b is big");
			} else {
				System.out.println("C is big");
			}

		} else if (c < a) {
			System.out.println("a is big");
		} else {
			System.out.println("c is big");

		}
	}
}