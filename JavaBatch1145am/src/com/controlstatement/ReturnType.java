package com.controlstatement;

public class ReturnType {
	public boolean add() {
		int a = 10;
		int b = 20;
		if(a<b)
			return true;
		else
			return false;

	}
	public static void main(String[] args) {
		ReturnType rt = new ReturnType();
		System.out.println(rt.add());
	}

}
