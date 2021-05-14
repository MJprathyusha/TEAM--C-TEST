package com.hackathon.selenium.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class LoginTest extends LoginUtil{
	Logger log = Logger.getLogger("LoginTest");
	 
	//Verify if user is able to login to the open cart application successfully
	@Test
	public void loginTest() throws InterruptedException {
		LoginUtil.loginFunctionality();
		
		log.info("LoginTest" + "---"+ "Login Account Successful");
  }
	
}
