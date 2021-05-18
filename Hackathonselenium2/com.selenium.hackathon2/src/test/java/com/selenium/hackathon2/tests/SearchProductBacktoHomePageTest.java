package com.selenium.hackathon2.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class SearchProductBacktoHomePageTest extends HomePage {
	Logger log = Logger.getLogger("SearchProductBacktoHomePageTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void verifyProductSearchBackToHomePage() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();
		
		Thread.sleep(5000);
		HomePage.enterTextInSearch();
		HomePage.clickOnSearchIcon();
		HomePage.navigateToHomePage();
		//check whether actual title matches expected title
		
		String expectedTitle = "YLighting | Best in Modern Lighting and Contemporary Design";
		String actualTitle = "";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle))
		{
		System.out.println( "Navigated Back & Verification Successfull - Title Matched") ;
		}
		else {
		System.out.println( "Verification Failed - Title Not Matched");
		}
		log.info("SearchProductBacktoHomePageTest" + "---"+ "search product and navigate backis Successful");
	}

}
