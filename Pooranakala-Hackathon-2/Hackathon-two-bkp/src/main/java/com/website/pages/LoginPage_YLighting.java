package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_YLighting {
	
	WebDriver driver;

	public LoginPage_YLighting(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy (xpath="//a[@class=\"ltkpopup-close\"]")
	WebElement close;
	@FindBy (xpath="//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/span")
	WebElement acc;
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/div/div/a")
	WebElement sign;
	@FindBy (xpath="//input[@id='dwfrm_login_username']")
	WebElement uname;
	@FindBy (xpath="//input[@id='dwfrm_login_password']")
	WebElement pwd;
	@FindBy (xpath="//*[@id=\"dwfrm_login\"]/fieldset/div[3]/div[2]/button/span")
	WebElement signin;
	
	
	public void WebElements(String uid,String pword)
	{
		close.click();
		acc.click();
		sign.click();
		uname.sendKeys(uid);
		pwd.sendKeys(pword);
		signin.click();
		
	}
}
