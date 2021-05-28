package com.practice.restclient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class GetClient {

	private static String GET_URL = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";
	
	private static String GET_URL1 = "https://petstore.swagger.io/v2/pet/";

	//get pet by status
	@Test
	public void getPetByStatus() throws ClientProtocolException, IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(GET_URL);
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpget);

		//printing the status code
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code---->" + statusCode);

		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");

		System.out.println(responseString);

		JSONArray jsonArr = new JSONArray(responseString);
		
		//print response string in JSON format
		System.out.println("Response Json from API ---" + jsonArr.toString(4));
		
		System.out.println("Total Pets : "+ jsonArr.length());

		
	}
	
	
	//get pet by id - validating the pet created by the post method
	
	@Test
	public void getPetByID() throws ClientProtocolException, IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		Properties prop = readPropertiesFile(System.getProperty("user.dir")+"/src/main/java/com/practice/restclient/jsondata/petPostData.properties");
		
		String pet_id = prop.getProperty("pet_id");
	    System.out.println("pet_id: "+ pet_id);
		
		HttpGet httpget = new HttpGet(GET_URL1 + pet_id);
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpget);

		//printing the status code
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code---->" + statusCode);

		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");

		System.out.println(responseString);

		JSONObject jsonObj = new JSONObject(responseString);

		//print response string in JSON format
		
		System.out.println("Response Json from API ---" + jsonObj.toString(4));
		
		System.out.println("Total Pets : "+ jsonObj.length());

	}
	
	//method to read properties from property file
	 public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }

}
