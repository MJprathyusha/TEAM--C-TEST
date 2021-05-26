package com.qa.testCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostRequest {

	@Test
	public void postTest()
		    
		    {
		        RequestSpecification request=RestAssured.given();
		        request.header("Content-Type","application/json");
		        JSONObject json=new JSONObject();
		        json.put("name", "Poorna");
		        json.put("job", "Automation");
		        request.body(json.toJSONString());
		        Response response=request.post("https://reqres.in/api/users");
		       
		        System.out.println("JSON format"+response.asString());
		        int code=response.getStatusCode();
		        System.out.println("Status Code is"+response.getStatusCode());
		        String line = response.getStatusLine();
		        System.out.println("Line is: " + line);
		        Assert.assertEquals(code, 201);
		        
		    }
		
		
	}
	
		
	
