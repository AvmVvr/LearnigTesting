package com.test.details;
public class ParentClaz extends GrandParen {
	public void landinfo() {
		System.out.println("Land Area owned by Parent");
	}
	public void BusinessInfo() {
		System.out.println("Business owned by Parent");
	}
	public static void main(String[] args) {
		// object Creation
		ParentClaz pc = new ParentClaz();
		pc.BusinessInfo();
		pc.landinfo();
	}
}