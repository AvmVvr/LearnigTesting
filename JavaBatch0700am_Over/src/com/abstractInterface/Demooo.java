package com.abstractInterface;

public class Demooo implements Dummy {

	public void add() {
		System.out.println("This is Addition");
	}
	public void sub() {
		System.out.println("This is subtract");
	}
	public void mul() {
		System.out.println("This is multiply");
	}
	public static void main(String[] args) {
		Demooo dd = new Demooo();
		dd.add();
		dd.sub();
		dd.mul();
	}
}