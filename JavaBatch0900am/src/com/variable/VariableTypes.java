package com.variable;
public class VariableTypes {
	int a = 100; // Class Variable
	static int b= 5; //static Variable
	int c; // Class Variable w/o assigning the value
	public void Method1() {
		int a = 10; //method Variable (or) Local Variable
		System.out.println(a); // Prints the local Variable(Highest goes to LV)//10
		System.out.println(c); // C is a Class Variable (life of CV is entire class)//0
	}
	public static void main(String[] args) {
		VariableTypes vt = new VariableTypes(); //object Creation
		vt.Method1(); //calling the local Variable(using object)
		System.out.println(vt.a); // printing the class Variable (using object)//100
		System.out.println(b); // printing the static Variable (without object)//5
	}
}