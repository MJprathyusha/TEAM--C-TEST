package com.practice.restclient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class PutClient {
	
	private static String PUT_URL = "https://petstore.swagger.io/v2/pet";
	private static String REQUEST_PAYLOAD = "{\"id\":9223127516080563147,\"category\":{\"id\":0,\"name\":\"string\"},\"name\":\"doggie-snoopy\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"snoopyTag\"}],\"status\":\"available\"}";
	
	
	//PUT method to update the existing pet details (newly created by POST API)
	@Test
	private static void createPetPUT() throws IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPut httpput = new HttpPut(PUT_URL);
		
		httpput.setEntity(new StringEntity(REQUEST_PAYLOAD)); // for payload
		
		httpput.addHeader("Content-Type", "application/json");
		
		
		CloseableHttpResponse  closableHttpResponse = httpClient.execute(httpput);
		
		//printing the status code 
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Statuc code---->" + statusCode);

		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");

		System.out.println(responseString);

		JSONObject jsonObj = new JSONObject(responseString);

		//print response string in JSON format
		System.out.println("Response Json from API ---" + jsonObj.toString(4));
		
		
		

	}


}
