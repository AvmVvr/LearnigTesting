package com.keywords;

public class StaticKeywords {
	static int a = 10;
	static public void methodOne() {
		System.out.println("this is Static Method");
	}
	static
	{
		System.out.println("This is Static Block");
	}
	public static void main(String[] args) {
		methodOne();
		System.out.println(a);
	}
}
