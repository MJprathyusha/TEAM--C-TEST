package com.rest.apimethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DeleteMethod {
	
	@Test
	public void testDeleteMethod() {
	
	 RestAssured.baseURI ="https://reqres.in";
	 RequestSpecification request = RestAssured.given().contentType("application/json");
	 
	       // Delete the request and check the response
	 Response response = request.delete("/api/users/4"); 
	 
	 int statusCode = response.getStatusCode();
	 System.out.println(statusCode);
	 Assert.assertEquals(statusCode, 204);
	 
	 String statusLine = response.getStatusLine();
	 System.out.println(response.getStatusLine());
	 Assert.assertEquals(statusLine, "HTTP/1.1 204 No Content");
	}

}
