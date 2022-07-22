package com.controlstatement;
/* Break & Continue
 * Break --- terminate the loop
 * Continue---> skip the specific iteration/condition
 */
public class JumpStatement {
public static void main(String[] args) {

	for(int i=1;i<=10;i++) {
		if(i==5)
			break;
		System.out.println(i);
	}
}
}
