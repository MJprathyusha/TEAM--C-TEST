package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.pages.SigninAccountPage;
import com.selenium.hackathon2.utilities.CaptureScreenshot;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class VerifyHomePageLogoTest extends HomePage {
	Logger log = Logger.getLogger("VerifyHomePageLogoTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void VerifyHomePageTitle() throws InterruptedException {
	
		SigninAccountPage.closeAdvertiseWindow();
		boolean logoFlag = HomePage.verifyLogo();
		
		if (true == logoFlag) {
			System.out.println("Logo Displayed & Verified Successfully");
		} else {
			
			System.out.println("Logo verification failed");
		}
		CaptureScreenshot.captureScreenshotnSave(driver, "Logo Displayed");
		log.info("VerifyHomePageLogoTest" + "---"+ "Verify Logo is Successful");
	}
	
	

}
