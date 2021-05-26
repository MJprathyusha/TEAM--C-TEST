package com.apiclient;

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
	//1.Get method
		public void put(String url) throws ClientProtocolException, IOException
		{
			CloseableHttpClient httpclient=HttpClients.createDefault();
			HttpPut httpput= new HttpPut(url);
			CloseableHttpResponse closeableHttprespone = httpclient.execute(httpput);
			//a.StatusCode
			int statuscode = closeableHttprespone.getStatusLine().getStatusCode();
			System.out.println("Status Code--->" +statuscode);
			
			//b.JSon String:
			String responseString=EntityUtils.toString(closeableHttprespone.getEntity(), "UTF-8");
			JSONObject responseJson=new JSONObject(responseString);
	        responseJson.put("name", "Logeshwari");
	        responseJson.put("job", "Automation_engineer");
			System.out.println("Response JSON from API---->" +responseJson);
			
			//c.All Headers
			
			Header[] headerArray=closeableHttprespone.getAllHeaders();
			HashMap<String,String> allHeaders=new HashMap<String,String>();
			for(Header header:headerArray) {
				allHeaders.put(header.getName(), header.getValue());
				
			}
			System.out.println("Headers Array--->" +allHeaders);
			System.out.println("Headers Array--->" +allHeaders.size());

}
}
