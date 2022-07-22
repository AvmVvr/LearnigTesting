package com.controlstatement;

public class BreakStatement {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if(i==5)
				break;// loop terminate
			System.out.println(i);
		}
	}

}
