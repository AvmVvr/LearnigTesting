package com.keyword;

public class StaticMethodd {
	static int a = 10;
	int b;
	
	static public void methodOne() {
		System.out.println("This is Static Method");
	}
	static
	{
		System.out.println("This is static Block");
	}

	public static void main(String[] args) {
	System.out.println(a);
	methodOne();
	}
}
