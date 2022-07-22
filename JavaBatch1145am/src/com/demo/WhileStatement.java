package com.demo;

public class WhileStatement {
	public static void main(String[] args) {
		int a = 1000;
		do {
			System.out.println(a);
			a=a/10;
		} while (a != 10);
	}
}
