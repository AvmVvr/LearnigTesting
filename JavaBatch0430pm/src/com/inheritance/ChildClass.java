package com.inheritance;

class ChildClass extends ParentClass{
	public void jobDetail() {
		System.out.println("Hello i got a Job");
	}
public static void main(String[] args) {
	//ClassName objName = new ClassName();
	ChildClass cc = new ChildClass();
	System.out.println("-Parent Class Methods-");
	cc.bankBalance();
	cc.landDetail();
	System.out.println("-Child Class Method-");
	cc.jobDetail();
	cc.houseDetail();

}
}
