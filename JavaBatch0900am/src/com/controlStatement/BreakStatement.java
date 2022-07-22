package com.controlStatement;

public class BreakStatement {
public static void main(String[] args) {
	for (int i = 1; i <= 300; i++) {
		if(i==290 || i==291 || i==292)
//			continue;
			break;
		System.out.println("Seat No."+i);
	}
	System.out.println("Show Full");
}
}
