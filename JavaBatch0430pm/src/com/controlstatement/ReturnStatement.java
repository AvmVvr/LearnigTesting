package com.controlstatement;
public class ReturnStatement {
	public int add() {
		int a = 5;
		int b = 10;
		int c = a + b;
		return c;//15
	}
	public int sub() {
		int a = 15;
		int b = 10;
		int c = a - b;
		return c;//5
	}
	public void result() {
		int z = add();
		int x = sub();
		int d = z*x;
		System.out.println(d);
	}
	public static void main(String[] args) {
		ReturnStatement r = new ReturnStatement();
		r.result();			
	}
}
