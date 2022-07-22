package com.constructor;
public class ConstrLearn {
	public ConstrLearn() { //Default Parameterized  / Non - Parameterized
		System.out.println("This is Constructor");
	}
	public ConstrLearn(String fruit,String color) { //Parameterized 
		System.out.println("Fruit Name is "+fruit);
		System.out.println("Color Name is "+color);
	}
	public ConstrLearn(int age) {
		//Parameterized 
		System.out.println("My Age is "+age);
	}
	public static void main(String[] args) {
		ConstrLearn c1 = new ConstrLearn();
		ConstrLearn c2 = new ConstrLearn("Orange","Red");
		ConstrLearn c3 = new ConstrLearn(24);
	}
}