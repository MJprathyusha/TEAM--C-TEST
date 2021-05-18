package com.selenium.hackathon2.pages;

import com.selenium.hackathon2.base.BasePage;
import com.selenium.hackathon2.pageelements.LiveChatPageElements;
import com.selenium.hackathon2.pageelements.MyAccountPageElements;
import com.selenium.hackathon2.pageelements.SigninAccountPageElements;

public class LiveChatPage extends BasePage {
	
	public static void clickOnAccount() {	
		driver.findElement(MyAccountPageElements.ACCOUNT).click();
	}
	
	public static void closeAdvertiseWindow() {
		driver.findElement(SigninAccountPageElements.ADVERTISE_WINDOW).click();
	}
	
	public static void clickOnLiveChat() {
		driver.findElement(LiveChatPageElements.LIVE_CHAT).click();
	}
	
	public static void enterName() {
		driver.findElement(LiveChatPageElements.NAME).sendKeys("Uma Maheswari");
	}
	
	public static void enterEmail() {
		driver.findElement(LiveChatPageElements.EMAIL).clear();
		driver.findElement(LiveChatPageElements.EMAIL).sendKeys("j.umamaheswari9@gmail.com");
	}
	
	public static void enterInvalidEmail() {
		driver.findElement(LiveChatPageElements.EMAIL).sendKeys("xyz");
	}

	public static void clickOnSubmit() {
		driver.findElement(LiveChatPageElements.LV_SUBMIT).click();
	}
}
