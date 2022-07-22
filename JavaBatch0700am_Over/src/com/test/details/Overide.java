package com.test.details;

public class Overide extends Prg1 {
@Override
public void empid() {
	// TODO Auto-generated method stub
	super.empid();
}
@Override
	public void empname() {
		// TODO Auto-generated method stub
		super.empname();
	}
public static void main(String[] args) {
	Overide o = new Overide();
	o.empid();
	o.empname();
}
}
