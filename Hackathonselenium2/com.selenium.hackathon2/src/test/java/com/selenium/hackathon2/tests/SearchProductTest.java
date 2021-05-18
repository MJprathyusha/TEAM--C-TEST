package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class SearchProductTest extends HomePage {
	Logger log = Logger.getLogger("SearchProductTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void verifyProductSearch() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();
		
		Thread.sleep(5000);
		HomePage.enterTextInSearch();
		Thread.sleep(5000);
		HomePage.clickOnSearchIcon();
		
		log.info("SearchProductTest" + "---"+ "search product is Successful");
	}

}
