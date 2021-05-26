package com.qa.postRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostReqJson {

	@Test
	public void PostRequest() {

		RequestSpecification request = RestAssured.given();
		Response response = request.post("https://reqres.in/api/users");
		JSONObject requestParams = new JSONObject();
		requestParams.put("Name", "Poorna"); 
		requestParams.put("job", "Automation_engineer");

		request.body(requestParams.toJSONString());

		
		String body = response.getBody().asString();
		String jsondata = requestParams.toJSONString();
		System.out.println("json  data is:" + jsondata);
		System.out.println("Data is: " + body);
		int statusCode = response.getStatusCode();
		String Line = response.getStatusLine();
		Assert.assertEquals(statusCode, 201);
		System.out.println("code is: " + statusCode);
		System.out.println("Line is: " + Line);

	}
}
