package com.controlstatement;

public class ContinueStatement {
	public  void booking() {
		for (int seat = 50; seat <=75; seat++) {
			if(seat==65||seat==66||seat==67)
				continue;// skips the current iteration
			System.out.println(seat);
		}
	}
}