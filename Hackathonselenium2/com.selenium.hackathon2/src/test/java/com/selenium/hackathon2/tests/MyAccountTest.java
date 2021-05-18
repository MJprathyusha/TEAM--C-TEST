package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.MyAccountPage;
import com.selenium.hackathon2.utilities.ReadProperties;

public class MyAccountTest extends MyAccountPage{
	Logger log = Logger.getLogger("MyAccountTest");
	@Test
	public void MyAccountRegister() throws InterruptedException {
		
		ReadProperties rp = new ReadProperties();
		
		
		MyAccountPage.closeAdvertiseWindow();
		MyAccountPage.clickOnAccount();
		MyAccountPage.clickOnMYAccount();
		MyAccountPage.enterFirstName(rp.firstName);
		MyAccountPage.enterLastName(rp.lastName);
		MyAccountPage.enterEmailAddress(rp.emailAddress);
		MyAccountPage.enterConfirmEmailAddress(rp.confirmEmailAddress);
		MyAccountPage.enterPassword(rp.password);
		MyAccountPage.enterConfirmPassword(rp.confirmPassword);
		
		MyAccountPage.clickOnConfirmAccount();		
		log.info("MyAccountTest" + "---"+ "Creation of account is Successful");
	}

}
