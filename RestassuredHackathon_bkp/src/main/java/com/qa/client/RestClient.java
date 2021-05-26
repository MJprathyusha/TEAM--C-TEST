package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	public void put(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpPut httpput=new HttpPut(url);
		CloseableHttpResponse closeableHttpResponse=httpClient.execute(httpput);
		
		int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("status code is: "+statusCode);
		
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		
		JSONObject responseJson = new JSONObject(responseString);
		responseJson.put("name", "Poorna");
		responseJson.put("job", "Automation_engineer");
		System.out.println("Json response from API is: "+responseJson);
		
		Header[] headersArray=closeableHttpResponse.getAllHeaders();
		
		HashMap<String,String> allHeaders= new HashMap<String,String>();
		for(Header header:headersArray)
		{
			allHeaders.put(header.getName(), header.getValue());
			
		}
		System.out.println("Headers Array: "+allHeaders);
		System.out.println(allHeaders.size());
	}
}

