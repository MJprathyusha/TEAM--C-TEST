package com.rest.apimethods;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutMethodHeaders {
	
	
	@Test
	public void testPutmethodheaders() {
		
		RestAssured.baseURI ="https://reqres.in";
		 RequestSpecification request = RestAssured.given().contentType("application/json");
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("name", "Uma");
		 requestParams.put("job", "QA");
		 
		 request.body(requestParams.toJSONString());
		 Response response = request.put("/api/users/687");
		 
		 int statusCode = response.getStatusCode();
		 String data = response.prettyPrint();
		 System.out.println(statusCode);
		 Assert.assertEquals(statusCode, 200);
		 
		 String statusLine = response.getStatusLine();
		 System.out.println(response.getStatusLine());
		 Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		 
		 
		 Headers headersArray = response.getHeaders();
			
			HashMap<String,String> allHeaders =new HashMap<String,String>();
			
			for(io.restassured.http.Header header : headersArray) {
				allHeaders.put(header.getName(), header.getValue());
			}
			System.out.println("Headers Array --"+allHeaders);
		
	}

}
