package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class PutTest extends TestBase{

	public PutTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	
	
	
	@BeforeMethod
	public void setUp() throws IOException 
	{
		testBase=new TestBase();
		serviceUrl= prop.getProperty("url");
		apiUrl=prop.getProperty("serviceUrl");
		url=serviceUrl+apiUrl;
		
	}
	@Test
	public void getAPITest() throws ClientProtocolException, IOException
	{
		restClient = new RestClient();
		restClient.put(url);
	}

}
