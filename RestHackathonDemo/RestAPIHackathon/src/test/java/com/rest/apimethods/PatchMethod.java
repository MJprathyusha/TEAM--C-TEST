package com.rest.apimethods;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchMethod {
	
	
	@Test
	public void testPatchMethod() {
		
		RestAssured.baseURI ="https://reqres.in";
		 RequestSpecification request = RestAssured.given().contentType("application/json");
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("name", "Testing");
		 requestParams.put("job", "QA Test");
		 
		 request.body(requestParams.toJSONString());
		 Response response = request.patch("/api/users/687");
		 
		 int statusCode = response.getStatusCode();
		 String data = response.prettyPrint();
		 System.out.println(statusCode);
		 Assert.assertEquals(statusCode, 200);
		 
		 String statusLine = response.getStatusLine();
		 System.out.println(response.getStatusLine());
		 Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		 
		 
	}

}
