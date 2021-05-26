package com.qa.testCases;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PutReqWithHeader {

	@Test
	public void putTest()
    
    {
       /* RequestSpecification request=RestAssured.given();
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
        
        
		Headers allHeaders = response.getHeaders();
		for(io.restassured.http.Header header : allHeaders)
		{
			System.out.print(header.getName() +" : ");
			System.out.println(header.getValue());
		}
		
		System.out.println("Value of Header Content-Type : "+response.getHeader("Content-Type"));*/
		Response resp=RestAssured.put("https://reqres.in/api/users");
		Headers obj=resp.getHeaders();
		HashMap<String, String> allheaders=new HashMap<String, String>();
		for(Header header :obj)
		{
		allheaders.put(header.getName(), header.getValue());

		}
		System.out.println("Headers are"+allheaders);


		}
		
	}	
	


    

