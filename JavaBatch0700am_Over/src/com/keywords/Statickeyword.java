package com.keywords;

public class Statickeyword {
	static int i = 10;

	static {
		System.out.println("This is Static Block");
	}

	static void nmethod() {
		System.out.println("HI");
	}

public static void main(String[] args) {
	System.out.println(i);
	nmethod();
}
}
