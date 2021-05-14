package com.hackathon.selenium.tests;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.hackathon.selenium.pages.LoginPage;
import com.hackathon.selenium.utilities.CaptureScreenshot;



public class ProductAvailabilityTest extends LoginUtil {
	Logger log = Logger.getLogger("ProductAvailabilityTest");
	@Test
	public void productAvailability() throws InterruptedException {
		
		LoginUtil.loginFunctionality();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.enterSearchText();
		LoginPage.clickOnSearchIcon();
		LoginPage.clickOnIphone();
		LoginPage.enterQuantity();
		LoginPage.clickOnAddToCart();
		LoginPage.clickOnShippingCart();
		LoginPage.clickOnCheckout();
		CaptureScreenshot.captureScreenshotnSave(driver, "Product_Out_Of_Stock");
		log.info("LoginTest" + "---"+ "Product availability is Successful");
	
	}

}
