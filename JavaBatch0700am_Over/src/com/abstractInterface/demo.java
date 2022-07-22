package com.abstractInterface;

public class demo extends Bank{
	public void bankName() {
	System.out.println("SBI");			
	}
	@Override
	public void bankLocation() {
		System.out.println("Chennai");		
	}
	public static void main(String[] args) {
		demo d = new demo();
		d.bankInfo();
		d.bankLocation();
		d.bankName();
	}
}
