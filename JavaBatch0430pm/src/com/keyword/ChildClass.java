package com.keyword;

public class ChildClass extends ParentClass {
int a = 50;

public void methodd() {
	int a = 25;
	System.out.println("Method Variable: "+a);//25
	System.out.println("Current Class Reference: "+this.a);//50
	System.out.println("Parent Class Reference: "+super.a);//100
}
public static void main(String[] args) {
	ChildClass cc = new ChildClass();
	cc.methodd();
}
}