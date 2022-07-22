package com.test.details;
public class ChildClaz extends ParentClaz {
	public void childname() {
		System.out.println("Child name is ABC");
	}
public static void main(String[] args) {
	ChildClaz cc = new ChildClaz();
	cc.gpproperty();
	cc.landinfo();
	cc.BusinessInfo();
	cc.childname();

	}
}