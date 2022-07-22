package com.test.details;

//Child 3
public class Health extends EmployeeDetails {
public void bloodGroup() {
	System.out.println("Blood group is O+ve");
}


public static void main(String[] args) {
	Health h = new Health();
	h.empID();
	h.empName();
	h.bloodGroup();
	
}

}
