package com.API;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonParsing {
	@Test
	public void jsonExecution() {
		
		// 1. Print the no of employees returned by API
		JsonPath js = new JsonPath(Payload.employeeinfo());
		int no_of_employees = js.getInt("employeeDetails.size()");
		System.out.println("Number of Employees are " + no_of_employees);

		// 2. print total salary
		int TotalSalary = js.getInt("dashBoard.totalSalary");
		System.out.println("Total salary is "+TotalSalary);
		
		//3. Print the name of the first employee
		Object name_of_the_first_employee = js.get("employeeDetails.name[0]");
		System.out.println("name of the first employee is " +name_of_the_first_employee);
		
		//4. Print years of experience of John
		int YOE = js.getInt("employeeDetails.exp[1]");
		System.out.println("years of experience of John is "+YOE);
	}

}
