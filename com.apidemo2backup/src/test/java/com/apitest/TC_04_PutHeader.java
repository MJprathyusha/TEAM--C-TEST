package com.apitest;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.apibase.BaseClass;
import com.apiclient.RestClient;



public class TC_04_PutHeader extends BaseClass {
	BaseClass testbase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restclient;
	
	@BeforeMethod
	public void Setup()
	{
		testbase=new BaseClass();
		serviceurl=prop.getProperty("URL");
		apiurl=prop.getProperty("serviceurl");
		url=serviceurl+apiurl;
		
	}
	@Test
	public void GetTest() throws ClientProtocolException, IOException
	{
		 restclient=new RestClient();
		restclient.put(url);
	}
	
		
}
