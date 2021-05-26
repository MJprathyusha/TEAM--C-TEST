package com.apitest;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC_04_1_PutHeader {
@Test
public void putt() {
	Response response=RestAssured.put("https://reqres.in/api/users/2");
      Headers obj=response.getHeaders();
      HashMap<String, String> allheaders=new HashMap<String, String>();
      for(Header header :obj)
      {
          allheaders.put(header.getName(), header.getValue());
         
      }
      System.out.println("Headers are"+allheaders);
 
     
  }
}

