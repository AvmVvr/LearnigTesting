package com.constructor;

public class learn {
	public learn() {
		System.out.println("Hi this is Constructor Program");
	}
	public learn(String Name) {
		System.out.println("Hello World " + Name);
	}
	public static void main(String[] args) {
		learn L = new learn();
		learn L2 = new learn("Ashok");
	}
}