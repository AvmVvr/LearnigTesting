package com.test.details;

public class ChildClass extends ParentClass {
	public void clubName() {
		System.out.println("club name: RED");
	}

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		
		cc.stdName();
		cc.stdId();
		cc.clubName();
	}
}
