package com.demo;

public class Demo {
public void add() {
	int a = 5;
	int b = 10;
	System.out.println(a+b);
}
public void sub() {
	int a = 5;
	int b = 10;
	System.out.println(a-b);
}
	public static void main(String[] args) {
		//ClassName obj.name = new ClassName();
		Demo d  = new Demo();
		d.sub();
	}
}