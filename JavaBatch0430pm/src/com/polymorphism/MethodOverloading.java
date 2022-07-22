package com.polymorphism;

public class MethodOverloading {
	
	public void empDetail(String Name,int age,int pincode) {
		System.out.println("Emp Name is "+Name);	
		System.out.println("Emp Age is "+age);
		System.out.println("Emp pincode is "+pincode);
	}
	
	public void empDetail(int salary,int bouns,String panNo) {
		System.out.println("Emp Salary is "+salary);
		System.out.println("Emp Bouns is "+bouns);
		System.out.println("Emp Pan no is "+panNo);
	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.empDetail("Vinothraj", 30, 600001);
		mo.empDetail(15000, 100, "AVMPV1547");

	}

}
