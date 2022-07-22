package com.variable;

public class Variableeee {
	int a = 100;
	static int p =500;

	public void methodone() {
		int a = 5;
		int b = 0 ;
		System.out.println("Methodone Varaiable a: "+a);
		System.out.println("Methodone Varaiable b: "+b); //0

	}
	public void methodtwo() {
		System.out.println("Methodtwo but Class Variable"+a);
	}
	
	public static void main(String[] args) {
		Variableeee v = new Variableeee();
		v.methodone();
		v.methodtwo();
		System.out.println("Static Variable: "+p);
		
}
}
