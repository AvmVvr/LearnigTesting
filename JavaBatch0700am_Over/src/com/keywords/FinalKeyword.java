package com.keywords;

public class FinalKeyword {
final public void method1() {
	final int i = 100;
	System.out.println("this final Method");
}
public static void main(String[] args) {
	FinalKeyword fk = new FinalKeyword();
	fk.method1();
	
}
}
