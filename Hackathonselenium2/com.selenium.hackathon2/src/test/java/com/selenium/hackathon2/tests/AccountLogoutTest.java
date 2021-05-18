package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class AccountLogoutTest extends HomePage {
	Logger log = Logger.getLogger("AccountLogoutTest");

	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void signInTest() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();
		
		Thread.sleep(5000);
		
		HomePage.clickOnAccount();
		HomePage.clickOnSignOut();
		log.info("AccountLogoutTest" + "---"+ "Your Logout to account is Successful");	
		
	}

}
