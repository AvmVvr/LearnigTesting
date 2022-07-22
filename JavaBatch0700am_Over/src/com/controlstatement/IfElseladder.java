package com.controlstatement;

public class IfElseladder {
	public static void main(String[] args) {

		int a = 5;
		int b = 4;

		if (a == 0) {
			System.out.println("a is zero");
		} else if (a < b) {
			System.out.println("a is small");
		} else if (a == b) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("b is small");
		}
	}
}