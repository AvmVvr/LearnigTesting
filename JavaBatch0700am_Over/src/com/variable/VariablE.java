package com.variable;

public class VariablE {
	int z = 5;
	int y;
	static int a = 500;
		public void methodone() {
		int a = 100; // method Variable (or) Local Variable
		System.out.println(a);//100 //500
	}
	public void methodtwo() {
		int b =0 ;
		System.out.println(b); //0 //0
		System.out.println(z); //5 //5 
		System.out.println(y); //0 //0
		System.out.println(a); //500 //500
	}
	public static void main(String[] args) {
		VariablE v = new VariablE();
		System.out.println("********Static Variable***********");
		System.out.println(a);
		System.out.println("********Class Variable***********");
		System.out.println(v.z);
		System.out.println("********Method***********");
		v.methodone();
		System.out.println("********Method***********");
		v.methodtwo();
	}
}