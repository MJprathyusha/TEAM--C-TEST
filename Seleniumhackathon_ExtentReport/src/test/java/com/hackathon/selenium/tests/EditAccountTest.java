package com.hackathon.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.hackathon.selenium.pages.LoginPage;



public class EditAccountTest extends LoginUtil{
	Logger log = Logger.getLogger("EditAccountTest");
	
	//Verify the user is able to edit the existing login account
		@Test
		public void editAccountTest() throws InterruptedException {
			
			LoginUtil.loginFunctionality();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			LoginPage.clickOnEditAccount();
			LoginPage.clearLastName();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			LoginPage.enterNewLastName();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			LoginPage.clickOnEditContinue();
			LoginPage.clickOnLogout();
			LoginPage.clickOnLogoutContinue();
		System.out.println("Your Account has been Successfully Updated");
		log.info("editAccountTest" + "---"+ "Your Account has been Successfully Updated");
		
		
		}

}
