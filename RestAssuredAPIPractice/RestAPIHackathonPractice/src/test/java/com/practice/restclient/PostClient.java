package com.practice.restclient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostClient {
	
	private static String POST_URL = "https://petstore.swagger.io/v2/pet";
	
	private static String REQUEST_PAYLOAD = "{\"id\": 0,\"category\": {\"id\": 0,\"name\": \"string\"},\"name\": \"doggie-snoopy\",\"photoUrls\": [\"string\"],\"tags\": [{\"id\": 0,\"name\": \"tagName\"}],\"status\": \"available\"}";
	
	
	//post method to create a new pet
	@Test
	private static void createPetPOST() throws IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(POST_URL);
		
		httppost.setEntity(new StringEntity(REQUEST_PAYLOAD)); // for payload
		
		httppost.addHeader("Content-Type", "application/json");
		CloseableHttpResponse  closableHttpResponse = httpClient.execute(httppost);
		
		//printing the status code
		
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code---->" + statusCode);

		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");

		System.out.println(responseString);

		JSONObject jsonObj = new JSONObject(responseString);

		//print response string in JSON format
		System.out.println("Response Json from API ---" + jsonObj.toString(4));

		System.out.println(jsonObj.getLong("id"));
		
		//Storing petID to text file
		
		String pet_id = jsonObj.getLong("id") + "";
		
		
		 Properties props = new Properties();
	      props.put("pet_id", pet_id);

	    		  ;
	      FileOutputStream outputStrem = new FileOutputStream(System.getProperty("user.dir")+"/src/main/java/com/practice/restclient/jsondata/petPostData.properties");
	      //Storing the properties file
	      props.store(outputStrem, "Pet Post Data Properties file");
	      System.out.println("Properties file created......");

	}


}
