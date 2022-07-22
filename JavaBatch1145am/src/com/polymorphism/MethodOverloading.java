package com.polymorphism;

public class MethodOverloading {
public void empDetail(String Name,String eComName,int Salary) {
	System.out.println("Emp Name is "+Name);
	System.out.println("Emp eComName is "+eComName);
	System.out.println("Emp Salary is "+Salary);
}
 public void empDetail(int age,String empId,String comPlace) {
	System.out.println("Emp Age is "+age);
	System.out.println("Emp id is  "+empId);
	System.out.println("Emp company place is  "+comPlace);
}
public static void main(String[] args) {
	MethodOverloading mo = new MethodOverloading(); //object Creation
	mo.empDetail(25, "TCS001", "Chennai");
	mo.empDetail("Vinoth", "TCS", 50000);
}
}