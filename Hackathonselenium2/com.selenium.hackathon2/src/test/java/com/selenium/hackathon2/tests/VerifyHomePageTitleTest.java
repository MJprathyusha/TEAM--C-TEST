package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class VerifyHomePageTitleTest extends HomePage {
	Logger log = Logger.getLogger("VerifyHomePageTitleTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void VerifyHomePageTitle() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();
		
		String expectedTitle = "YLighting | Best in Modern Lighting and Contemporary Design";
		String actualTitle = "";
		
		actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle))
		{
		System.out.println( "Verification Successfull - Title Matched") ;
		}
		else {
		System.out.println( "Verification Failed - Title Not Matched");
		}
		log.info("VerifyHomePageTitleTest" + "---"+ "Verify Homepage title is Successful");
	}

}
