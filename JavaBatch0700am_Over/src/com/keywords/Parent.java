package com.keywords;
public class Parent {
	int a =10;
	public final void methodone() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.methodone();
	}
}