package com.rest.apimethods;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;



public class GetMethod {
	
	@Test
	public void testGetMethod() {
		
		int code=get("https://reqres.in/api/users").getStatusCode();
		System.out.println("Status code is"+code);
		Assert.assertEquals(code,200);
		
		 String statusLine = get("https://reqres.in/api/users").getStatusLine();
		 System.out.println(statusLine);
		 Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	
	
}
