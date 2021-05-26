package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Livechat_Invalid_credentials {
	WebDriver driver;

	public Livechat_Invalid_credentials(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy (xpath="//a[@class=\"ltkpopup-close\"]")
	WebElement close;
	@FindBy (xpath="//*[@class=\"LPMlabel\"]")
	WebElement livechatlink;
	@FindBy (xpath="//*[@id=\"txt_4167837\"]")
	WebElement nameField;
	@FindBy (xpath="//*[@id=\"txt_4167838\"]")
	WebElement emailField;
	@FindBy(xpath="//button[@class='lp_submit_button lpc_survey-area__submit-button lpc_desktop']")
	WebElement submit;
	
	public void WebElements(String name,String email)
	{
		close.click();
		
		livechatlink.click();
		
		System.out.println("live chat opened");
		nameField.sendKeys(name);
		emailField.sendKeys(email);
		submit.click();
		
		
	}
}
