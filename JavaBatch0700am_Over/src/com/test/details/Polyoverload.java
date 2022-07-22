package com.test.details;

public class Polyoverload {
	public void studetail(String s) {
		System.out.println("Student Name is "+s);
		// TODO Auto-generated method stub

	}
	public void studetail(int id, int a) {
		System.out.println("Student Roll no is"+" "+id);
		// TODO Auto-generated method stub
		System.out.println("Student age is "+a);

	}
	public void studetail(char c) {
		System.out.println("Student Gender is "+c);
		// TODO Auto-generated method stub

	}
	public void studetail(float f) {
		System.out.println("Student Height is" +" "+f);
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Polyoverload p = new Polyoverload();
		p.studetail("Ram");
		p.studetail(121,24);
		p.studetail('M');
		p.studetail(152.2f);
		
	}

}
