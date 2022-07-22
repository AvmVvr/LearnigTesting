package com.test.details;

public class child extends parent {
@Override
	public void boyname() {
		super.boyname();
		System.out.println("Kumar");
	}
public static void main(String[] args) {
	child m = new child();
	m.boyname();
}
}
