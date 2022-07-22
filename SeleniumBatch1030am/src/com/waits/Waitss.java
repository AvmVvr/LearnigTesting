package com.waits;

public class Waitss {
//	Static Wait ---> Thread.Sleep(long Mills) 1000ms - 1sec
	
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(2);
		Thread.sleep(5000);
		System.out.print(3);
	}
}