package com.inheritance;

public class ChildClass1 extends ParentClass {
	private void job() {
		System.out.println("salary paid");
	}
public static void main(String[] args) {
	ChildClass1 c1 = new ChildClass1();
	c1.jobDetail();
	c1.landDetail();
	c1.job();
	c1.Bankbalance();

}
}
