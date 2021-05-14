package com.hackathon.selenium.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public String firstName;
	public String lastName;
	public String email;
	public String telephone;
	public String password;
	public String confirmPassword;

	public static void main(String[] args) {
		ReadProperties r = new ReadProperties();
		
		System.out.println(r.firstName);
		System.out.println(r.lastName);
		System.out.println(r.email);
		System.out.println(r.telephone);
		System.out.println(r.password);
		System.out.println(r.confirmPassword);

	}
	
	
	public ReadProperties() {
		
		FileReader reader;
		try {
			reader = new FileReader("C:\\Users\\Vishwanth Reddy\\Desktop\\DataFiles\\OPEN_CART\\RegisterDetails.properties");
		
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    firstName = p.getProperty("firstName");  
	    lastName = p.getProperty("lastName");  
	    email = p.getProperty("email");  
	    telephone = p.getProperty("telephone"); 
	    password = p.getProperty("password"); 
	    confirmPassword = p.getProperty("confirmPassword"); 
	    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
	}

}
