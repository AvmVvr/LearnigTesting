package com.exception;

public class Throww {
	  static void checkPass(int mark) {
	    if (mark < 50) {
	      throw new ArithmeticException("You are fail - You must be score at least 50 to get pass");
	    }
	    else {
	      System.out.println("HI.. You got pass Mark!");
	    }
	  }

	  public static void main(String[] args) {
		  
	    checkPass(50); 
	  }
	}
