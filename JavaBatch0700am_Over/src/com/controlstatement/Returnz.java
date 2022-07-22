package com.controlstatement;

public class Returnz {
	public static void main(String[] args) {
		Returnz r = new Returnz();
		int Result = r.add();
		System.out.println(Result);
	}

	public int add() {
		int a = 5;
		int b = 6;
		return a+b;
	}

}
