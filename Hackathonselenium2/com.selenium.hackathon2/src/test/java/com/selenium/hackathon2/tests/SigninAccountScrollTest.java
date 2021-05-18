package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.pages.SigninAccountPage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class SigninAccountScrollTest extends SigninAccountPage {
	Logger log = Logger.getLogger("SigninAccountScrollTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void signInTest() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		SigninAccountUtil.signInFunctionality();
		HomePage.navigateToHomePage();

		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,-1000)");

		log.info("SigninAccountScrollTest" + "---"+ "Scroll is Successful");
	}

}
