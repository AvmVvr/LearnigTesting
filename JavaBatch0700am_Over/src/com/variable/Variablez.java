package com.variable;

public class Variablez {
	int a = 5; // class Variable // Global Variable
	int b; // unassigned variable
	static int c = 20; // Static Variable

	public void addition() {
		int a = 15; // Local Variable // Method Variable
		System.out.println(a = a + c); // 35
	}

	public static void main(String[] args) {
		Variablez v = new Variablez(); // object Creation
		v.addition(); // calling the method(addition) using obj.reference
		System.out.println(v.b); // printing the CV (unassigned Variable)
		System.out.println(v.a); // printing the CV (assigned Variable)
		System.out.println(c); // Printing the Static variable
	}
}
