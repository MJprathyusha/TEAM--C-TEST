package com.apitest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_05_Delete {
	@Test
public void GetTest() {
        


        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("name", "Logeshwari");
        json.put("job", "Automation_Test");
        request.body(json.toJSONString());
        Response response = request.delete("https://reqres.in/api/users/2");

 

        System.out.println("JSON format" + response.asString());
        int code = response.getStatusCode();
        System.out.println("Status Code is" + code);
        String line = response.getStatusLine();
        System.out.println("Line is: " + line);
        Assert.assertEquals(code, 204);

	}


}
