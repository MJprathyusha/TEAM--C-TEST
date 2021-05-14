package com.hackathon.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.hackathon.selenium.pages.LoginPage;



public class VerifyHomePageTitleTest extends LoginUtil {
	Logger log = Logger.getLogger("VerifyHomePageTitleTest");
	//Verify the title of the application and report it in the log
	
		@Test
		public void verifyHomePagetitle() throws InterruptedException {

			LoginUtil.loginFunctionality();
			
			LoginPage.clickOnHomePage();
			//check whether actual title matches expected title
			
			String expectedTitle = "Your Store";
			String actualTitle = "";
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			actualTitle = driver.getTitle();
			
			//System.out.println(actualTitle);
			
			if (actualTitle.equals(expectedTitle))
			{
			System.out.println( "Verification Successfull - Title Matched") ;
			}
			else {
			System.out.println( "Verification Failed - Title Not Matched");
			}
			log.info("LoginTest" + "---"+ "Title Verification is Successful");
 
		}

}
