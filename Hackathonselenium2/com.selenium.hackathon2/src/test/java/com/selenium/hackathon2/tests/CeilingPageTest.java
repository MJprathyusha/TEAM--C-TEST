package com.selenium.hackathon2.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.CeilingPage;

public class CeilingPageTest extends CeilingPage {
	Logger log = Logger.getLogger("SigninAccountTest");
	@Test(priority=0)
	public void CeilingPageTest1() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();

		Thread.sleep(5000);

		CeilingPage.navigateToHomePage();

		CeilingPage.clickOnCeilingLights();
		CeilingPage.clickOnChandeliers();

		log.info("CeilingPageTest" + "---"+ "Ceiling Test 1 is Successful");

	}

	@Test(priority=1)
	public void CeilingPageTest2() throws InterruptedException {
		

		SigninAccountUtil.signInFunctionality();

		
		CeilingPage.navigateToHomePage();
		CeilingPage.clickOnCeilingLights();
		CeilingPage.clickOnChandeliers();	
		CeilingPage.clickOnLargeChandeliers();
		CeilingPage.clickOnIntegartedLedFilter();
		CeilingPage.clickOnDaleychandelier();
		log.info("CeilingPageTest" + "---"+ "Ceiling Test 2 is Successful");
}

@Test(priority=2)
  public void CeilingPageTest3() throws InterruptedException {

	SigninAccountUtil.signInFunctionality();

	
	CeilingPage.navigateToHomePage();
	CeilingPage.clickOnCeilingLights();
	CeilingPage.clickOnChandeliers();	
	CeilingPage.clickOnLargeChandeliers();
	CeilingPage.clickOnIntegartedLedFilter();
	CeilingPage.clickOnDaleychandelier();
	CeilingPage.clickOnAddToCart();
	CeilingPage.clickOnCheckOut();
	log.info("CeilingPageTest" + "---"+ "Ceiling Test 3 is Successful");
}
  @Test(priority=3)
 public void CeilingPageTest4() throws InterruptedException {
	  SigninAccountUtil.signInFunctionality();

		
		CeilingPage.navigateToHomePage();
		CeilingPage.clickOnCeilingLights();
		CeilingPage.clickOnChandeliers();	
		CeilingPage.clickOnLargeChandeliers();
		CeilingPage.clickOnIntegartedLedFilter();
		CeilingPage.clickOnDaleychandelier();
		CeilingPage.clickOnAddToCart();
		CeilingPage.clickOnCheckOut();
		CeilingPage.mouseHoverOnViewCart();
		log.info("CeilingPageTest" + "---"+ "Ceiling Test 4 is Successful");
  }
 
  }
 