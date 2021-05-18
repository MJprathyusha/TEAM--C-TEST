package com.selenium.hackathon2.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public String firstName;
	public String lastName;
	public String emailAddress;
	public String confirmEmailAddress;
	public String password;
	public String confirmPassword;

	public static void main(String[] args) {
ReadProperties r = new ReadProperties();
		
		System.out.println(r.firstName);
		System.out.println(r.lastName);
		System.out.println(r.emailAddress);
		System.out.println(r.confirmEmailAddress);
		System.out.println(r.password);
		System.out.println(r.confirmPassword);

	}
	
	
	public ReadProperties() {
		
		FileReader reader;
		try {
			reader = new FileReader("C:\\Users\\Vishwanth Reddy\\Desktop\\DataFiles\\YLihtingRegister.properties");
		
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    firstName = p.getProperty("firstName");  
	    lastName = p.getProperty("lastName");  
	    emailAddress = p.getProperty("emailAddress");  
	    confirmEmailAddress = p.getProperty("confirmEmailAddress"); 
	    password = p.getProperty("password"); 
	    confirmPassword = p.getProperty("confirmPassword"); 
	    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
	}

}
