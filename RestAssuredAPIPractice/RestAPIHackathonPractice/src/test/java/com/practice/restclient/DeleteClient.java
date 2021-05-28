package com.practice.restclient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class DeleteClient {
	
	private static String DELETE_URL = "https://petstore.swagger.io/v2/pet/";
	
	
	//Delete Pet API by using ID
	@Test
	public void deletePetByID() throws ClientProtocolException, IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		// Reading the existing ID created from POST API and passing it as a parameter in the URL
		Properties prop = readPropertiesFile(System.getProperty("user.dir")+"/src/main/java/com/practice/restclient/jsondata/petPostData.properties");
		
		String pet_id = prop.getProperty("pet_id");
	    System.out.println("pet_id: "+ pet_id);
		
		HttpDelete httpdelete = new HttpDelete(DELETE_URL + pet_id);
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpdelete);

		//printing the status code
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Statuc code---->" + statusCode);

		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");

		System.out.println(responseString);

		//print response string in JSON format
		JSONObject jsonObj = new JSONObject(responseString);

		System.out.println("Response Json from API ---" + jsonObj.toString(4));

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
