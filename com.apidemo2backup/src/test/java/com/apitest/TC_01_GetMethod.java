package com.apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_01_GetMethod {

	@Test
	public void ResponseCode()
	{
		Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
		int code=resp.getStatusCode();
		System.out.println("Status Code is"+code);
        String line = resp.getStatusLine();
        System.out.println("Line is: " + line);
		Assert.assertEquals(code, 200);
	}
	@Test
	public void TestBody()
	{
		Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
		String data=resp.asString();
		System.out.println("Status Code is" +data);
		System.out.println("Response time" +resp.getTime());
	}
}
