package com.test.details;

public class Constructor1 extends Constructor {
public Constructor1(int id) {
	System.out.println("Emp age is "+id);
	}
public static void main(String[] args) {
	Constructor1 c = new Constructor1(21);
	Constructor e1 = new Constructor("Male");
	Constructor e2 = new Constructor(123);
	
}
}
