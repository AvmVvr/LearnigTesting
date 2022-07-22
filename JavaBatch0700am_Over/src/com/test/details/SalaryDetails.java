package com.test.details;

//Child 2
public class SalaryDetails extends EmployeeDetails{

	
	public void Salary() {
		System.out.println("Salary is Rs. 50000");
	}
	
	private void bonus() {
		System.out.println("Bonus is 40000");

	}
	
	public static void main(String[] args) {
		// Classname obj.name = new Classname();
		
		
		SalaryDetails sd = new SalaryDetails();
		sd.empID();
		sd.empName();
		sd.empDept();
		sd.Salary();
		sd.bonus();
		
	}

}
