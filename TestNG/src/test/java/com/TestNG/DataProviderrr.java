package com.TestNG;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderrr {
		
	@Test(dataProvider = "subdata")
	private void sub(int c,int d) {
		int e =c-d;
		System.out.println(e);//2//6//1
	}
	
	@DataProvider(name = "subdata")
	private Object kkkk() {

	Object a[][] = {{10,8},{12,6},{2,1}};
		return a;
	}
}
