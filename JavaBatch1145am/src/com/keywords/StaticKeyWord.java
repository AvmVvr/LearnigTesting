package com.keywords;

public class StaticKeyWord {
	//Static Variable
	static int number = 123456;
	static int a = 5;
	//Static method
 public static    void methodone() {
		System.out.println("This is Static Method");
	}
	
	//Static block
	static
	{
		System.out.println("This is Static block");
	}
	
	public static void main(String[] args) {
		methodone();
		System.out.println(a);
	}
}
