package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.LiveChatPage;

public class LiveChatTest extends LiveChatPage{
	Logger log = Logger.getLogger("LiveChatwithValidCredentials");
	@Test
	public void LiveChatwithValidCredentials() throws InterruptedException {
		
		
		LiveChatPage.closeAdvertiseWindow();
		Thread.sleep(10000);
		LiveChatPage.clickOnLiveChat();
		Thread.sleep(10000);
		LiveChatPage.enterName();
		LiveChatPage.enterEmail();
		LiveChatPage.clickOnSubmit();
		log.info("LiveChatwithValidCredentials" + "---"+ "Live Chat with valid details is Successful");
	}
	
	@Test
	public void LiveChatwithInValidCredentials() throws InterruptedException {
		
		
		LiveChatPage.closeAdvertiseWindow();
		Thread.sleep(10000);
		LiveChatPage.clickOnLiveChat();
		Thread.sleep(10000);
		LiveChatPage.enterName();
		LiveChatPage.enterInvalidEmail();
		LiveChatPage.clickOnSubmit();
		LiveChatPage.enterEmail();
		LiveChatPage.clickOnSubmit();
		log.info("LiveChatwithInValidCredentials" + "---"+ "Live Chat with In valid details is Successful");
	}

}
