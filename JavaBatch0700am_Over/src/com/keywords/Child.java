package com.keywords;

public class Child extends Parent{
	int a = 100;
public void methodtwo() {
	System.out.println(a);//100
	System.out.println("Current Class Ref. "+this.a);//100
	System.out.println("Parent Class Ref. "+super.a);//10
}
public static void main(String[] args) {
	Child c = new Child();
	c.methodtwo();
	c.methodone();
}
}