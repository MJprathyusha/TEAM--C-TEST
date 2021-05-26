package com.qa.testCases;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;


public class GetRequest{
	@Test
	public void GetTest() {
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");

		int code = response.getStatusCode();
		System.out.println("code: " + response.getStatusCode());

		String line = response.getStatusLine();
		System.out.println("Line is: " + line);

		Assert.assertEquals(code, 200);
	}
}
