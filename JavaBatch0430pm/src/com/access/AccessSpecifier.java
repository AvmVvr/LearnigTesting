package com.access;

public class AccessSpecifier {
	private void add() {
	System.out.println("This is Addition");
	}
	public void sub() {
		System.out.println("This is Subtraction");
	}
	protected void mul() {
		System.out.println("This is Multiplication");
	}
//	default void div() {
//		System.out.println("Division");
//	}
	public static void main(String[] args) {
		AccessSpecifier as  = new AccessSpecifier();
		as.add();
		as.sub();
		as.mul();
	}

}
