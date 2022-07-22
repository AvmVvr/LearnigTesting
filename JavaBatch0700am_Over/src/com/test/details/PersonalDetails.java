package com.test.details;

//Child 1
public class PersonalDetails extends EmployeeDetails{

	
	public void address() {
		System.out.println("Address: Salem");
	}
	
	public void phoneNumber() {
		System.out.println("mobile no. is 1234567890");

	}
	public static void main(String[] args) {
		PersonalDetails pd = new PersonalDetails();
		pd.empID();
		pd.empDept();
		pd.empName();
		pd.address();
		pd.phoneNumber();
		
	}

}
