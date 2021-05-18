package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.CaptureScreenshot;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class ZipCodeApplyTest extends HomePage {
	Logger log = Logger.getLogger("ZipCodeApplyTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void VerifyZipCodeApply() throws InterruptedException {
		
		

		SigninAccountUtil.signInFunctionality();
		 Thread.sleep(5000);
		HomePage.clickOnViewCart();
		HomePage.enterZipCode();
		HomePage.clickOnZipGo();
		CaptureScreenshot.captureScreenshotnSave(driver, "Zip_Code_Details");
		log.info("ZipCodeApplyTest" + "---"+ "Zip code validation is Successful");
		
	}

}
