package com.qa.testCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PutRequest {
	
	@Test
	public void putTest()
    
    {
        RequestSpecification request=RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json=new JSONObject();
        json.put("name", "Poorna");
        json.put("job", "Automation_Testing");
        request.body(json.toJSONString());
        Response response=request.put("https://reqres.in/api/users/2");
       
        System.out.println("JSON format"+response.asString());
        int code=response.getStatusCode();
        System.out.println("Status Code is"+response.getStatusCode());
        String line = response.getStatusLine();
        System.out.println("Line is: " + line);
        Assert.assertEquals(code, 200);
        
    }
}
