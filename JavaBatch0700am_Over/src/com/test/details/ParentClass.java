package com.test.details;

public class ParentClass extends GrandParent {
	public void stdName() {
		System.out.println("Student name is RAM");
	}

	public void stdId() {
		System.out.println("Student ID is 02052022");
	}

	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.stdName();
		pc.stdId();
	}

}
