package com.test.details;

public class Banking {
	public void custdetail(String type) {
		System.out.println("Acc type is " + type);
	}

	public void custdetail(String Name, int custid) {
		System.out.println("Customer name is " + Name);
		System.out.println("Customer id is " + custid);
	}

	public void custdetail(int accno, int custids, int mobile) {
		System.out.println("cust. Acc. No. is " + accno);
		System.out.println("cust. id. is " + custids);
		System.out.println("mobile no is " + mobile);
	}

	public static void main(String[] args) {
		Banking b = new Banking();
		b.custdetail("Saving Account");
		b.custdetail("Pavi", 784512);
		b.custdetail(123456789, 784512, 9876543);
	}
}
