package com.keywords;

public class StaticKey {
	static int a = 60;
	static public void add() {
		System.out.println("This is Static method");
	}
	static {
		System.out.println("This is static block");
	}
	public static void main(String[] args) {
		// no need to create an object reference to the static keyword,method & block
		add();
		System.out.println(a);
	}

}
