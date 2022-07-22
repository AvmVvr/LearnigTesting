package com.typesofvariables;
public class LocalVariable {
	int b;
	int c = 100;
	static int a = 50;

	public void methodOne() {
		int a = 5; // local variable
		System.out.println(a); //5
		System.out.println(c);//100
	}
	public void methodTwo() {
		System.out.println(a); // 50
		System.out.println(b);//0
	}
	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable();
		lv.methodOne();
		lv.methodTwo();
		System.out.println(lv.c);
		System.out.println(a);
	}
}