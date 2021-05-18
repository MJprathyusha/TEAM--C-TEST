package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class RemoveProductFromCartTest extends HomePage {
	Logger log = Logger.getLogger("RemoveProductFromCartTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void VerifyRemoveProductFromCart() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();
		
		
		Thread.sleep(10000);
		
		HomePage.clickOnViewCart();
		HomePage.clickOnRemoveLink();
		
		log.info("RemoveProductFromCartTest" + "---"+ "Remove product from account is Successful");
		
		
	}

}
