package com.keywords;

public class StaticKeyWords {
	static int i = 100;
	
	static public void add() {
		System.out.println("This is Static Method");
	}
	
	static {
		System.out.println("This is Static block");
	}
	public static void main(String[] args) {
		System.out.println(i);
		add();
}
}
