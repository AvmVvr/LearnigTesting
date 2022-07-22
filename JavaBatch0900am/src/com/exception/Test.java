package com.exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java program that demonstrates the use of throw
public class Test
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		List<Integer> list = new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(90);
	    list.add(40);
	    list.add(10);
	    list.add(90);
	    list.add(20);

	int count10=Collections.frequency(list, 10);
	int count20=Collections.frequency(list, 20);
	int count40=Collections.frequency(list, 40);
	int count90=Collections.frequency(list, 90);
	System.out.println(count10);
	System.out.println(count20);
	System.out.println(count40);
	System.out.println(count90);
		
	}
}

