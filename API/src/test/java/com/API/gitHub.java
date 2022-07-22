package com.API;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class gitHub {
	@Test(priority = 0)
	public void post() {
		String JsonBody = "{\"name\": \"Hello-World\"}";
		RestAssured.given().body(JsonBody).headers("Authorization", "Bearer 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")
				.accept(ContentType.JSON).contentType(ContentType.JSON).when().post("https://api.github.com/user/repos")
				.then().statusCode(201).log().all();
	}

	@Test(priority = 1)
	public void put() {
		String JsonBody = "{\"names\":[\"octocat\",\"atom\",\"electron\",\"api\"]}";
		RestAssured.given().body(JsonBody).headers("authorization", "Bearer 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")
				.accept(ContentType.JSON).contentType(ContentType.JSON).when()
				.put("https://api.github.com/repos/AvmVvr/Hello-World/topics").then().statusCode(200).log().all();
	}

	@Test(priority = 2)
	public void get() {
		RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON).when()
				.get("https://api.github.com/repos/AvmVvr/Hello-World").then().statusCode(200).log().all();

	}

	@Test(priority = 3)
	public void delete() {
		RestAssured.given().headers("authorization", "Bearer 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")
				.accept(ContentType.JSON).when().delete("https://api.github.com/repos/AvmVvr/Hello-World").then()
				.statusCode(204).log().all();

	}

}
