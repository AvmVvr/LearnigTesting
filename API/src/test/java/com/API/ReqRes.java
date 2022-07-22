package com.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ReqRes {
	@Test
	public void post() {
		String jsonbody = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";
		RestAssured.given().body(jsonbody).when().post("https://reqres.in/api/users").then().statusCode(201);
	}

	@Test
	public void put() {
		String jsonbody = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}";
		RestAssured.given().body(jsonbody).when().put("https://reqres.in/api/users/2").then().statusCode(200);
	}

	@Test
	public void get() {
		RestAssured.given().when().get("https://reqres.in/api/users/2").then().statusCode(200);
	}

	@Test
	public void delete() {
		RestAssured.given().when().delete("https://reqres.in/api/users/2").then().statusCode(204);
	}

}
