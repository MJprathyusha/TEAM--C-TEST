package com.selenium.hackathon2.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class AddQuantityTest extends HomePage {
	Logger log = Logger.getLogger("AddQuantityTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void VerifyAddQuantityTest() throws InterruptedException {
		
		SigninAccountUtil.signInFunctionality();

	
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     Thread.sleep(10000);
		
		HomePage.clickOnViewCart();
		HomePage.clickOnAddQuantity();
		log.info("AddQuantityTest" + "---"+ "Add quantity is Successful");
		
		
	}

}
