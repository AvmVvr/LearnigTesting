package org.emp1;
public class Employee {
	public void empId() {
		System.out.println("Emp. id is 101");
	}
	public void empName() {
		System.out.println("Emp name is Vinothraj");
	}
	public void empDob() {
		System.out.println("Emp DOB is 24-01-2022");
	}
	public void empPhone() {
		System.out.println("Emp mobile is 9876543210");
	}
	public void empEmail() {
		System.out.println("Emp mail is 123@gmail.com");
	}
	public void empAddress() {
		System.out.println("Emp Address is Chennai");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}
