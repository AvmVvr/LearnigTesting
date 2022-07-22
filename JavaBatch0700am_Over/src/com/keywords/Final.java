package com.keywords;

public class Final {
	final int a = 100;
	int b = 99;

	final public void method1() {
//		a++ ---> a = a+1
		int c = a+1;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Final f = new Final();
		f.method1();
		System.out.println(f.a);
	}
}