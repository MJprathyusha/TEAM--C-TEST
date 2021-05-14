package com.hackathon.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.hackathon.selenium.pages.RegisterAccountPage;
import com.hackathon.selenium.utilities.CaptureScreenshot;
import com.hackathon.selenium.utilities.ReadProperties;


public class RegisterAccountTest extends RegisterAccountPage {
	
	Logger log = Logger.getLogger("RegisterAccountTest");
	// Verify if user is able to register account in opencart application
	@Test(priority=0)
	public void registerAccount() throws InterruptedException {

		// reading registration details from property file
		ReadProperties rp = new ReadProperties();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RegisterAccountPage.clickOnMyAccount();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RegisterAccountPage.clickOnRegister();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RegisterAccountPage.enterFirstName(rp.firstName);
		RegisterAccountPage.enterLastName(rp.lastName);
		RegisterAccountPage.enterEmail(rp.email);
		RegisterAccountPage.enterTelephone(rp.telephone);
		RegisterAccountPage.enterPassword(rp.password);
		RegisterAccountPage.enterConfirmPassword(rp.confirmPassword);
		RegisterAccountPage.checkPrivacy();
		RegisterAccountPage.clickOnContinue();
		log.info("LoginTest" + "---"+ "Register Account Successful");
	}
	
	
	// Verify if user is not able to create an account when any of the required fields is missing
		@Test(priority=1)
		public void registerAccountInvalid() throws InterruptedException {

			// reading registration details from property file

			ReadProperties rp = new ReadProperties();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			RegisterAccountPage.clickOnMyAccount();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			RegisterAccountPage.clickOnRegister();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			RegisterAccountPage.enterFirstName(rp.firstName);
			RegisterAccountPage.enterLastName(rp.lastName);
			RegisterAccountPage.enterEmail(rp.email);
			// skip entering the telephone field by commenting the below code
			//super.enterTelephone(rp.telephone);
			RegisterAccountPage.enterPassword(rp.password);
			RegisterAccountPage.enterConfirmPassword(rp.confirmPassword);
			RegisterAccountPage.checkPrivacy();
			RegisterAccountPage.clickOnContinue();
			CaptureScreenshot.captureScreenshotnSave(driver, "Register_Missing_Required_Details");
			log.info("LoginTest" + "---"+ "Register Account Successful with invalid details");

		}
		
}
