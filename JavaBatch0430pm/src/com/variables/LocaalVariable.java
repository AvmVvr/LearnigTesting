package com.variables;

public class LocaalVariable {
	int a = 100; // Class Variable
	static int z =60;
	float b;
	
	public void methodOne() {
		int i = 10; //local Variable
		int a =5 ;
		System.out.println(a);//100//5
	}
	public void methodTwo() {
		System.out.println(a);//100
		System.out.println(b);//0.0
	}
	public static void main(String[] args) {
		LocaalVariable lv = new LocaalVariable();
		lv.methodOne();
		lv.methodTwo();
		System.out.println(lv.a);//100
		System.out.println(z);//60
	}	
}

/*
 * CV declared inside the class but outside the method
 * CV no need to assign a value / default 
 *CV can accessed by object
 * CV life - entire class
 * */
