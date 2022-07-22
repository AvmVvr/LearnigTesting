package com.polymorphism;

public class MethodOverloading {

	public void empDetailz(String Name, String Address,String country ) {
		System.out.println("Emp Name is :"+Name);
		System.out.println("Emp Address is : "+Address);
		System.out.println("Emp country is : "+country);
	}
	public void empDetailz(int id, String company ) {
		System.out.println(id);
		System.out.println(company);
	}
	public void empDetailz(String comlocation,int age) {
		System.out.println(age);
		System.out.println(comlocation);
	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.empDetailz(101, "Wipro");
		mo.empDetailz("Delhi",35);
		mo.empDetailz("Hema", "Chennai", "INdia");	
	}
}