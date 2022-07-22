package com.keyword;

public class FinalKeyWord {

	final int a =10;
	
	final public void methodOne() {
	System.out.println("This is final Method");
	}
	public static void main(String[] args) {
		FinalKeyWord fk = new FinalKeyWord();
		System.out.println(fk.a);
		fk.methodOne();
	}
}