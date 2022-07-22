package com.controlStatement;

public class ReturnStatement {
	public int add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
public static void main(String[] args) {
	ReturnStatement r = new ReturnStatement();
	System.out.println(r.add());
}
}
