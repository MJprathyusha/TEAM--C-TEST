package com.website.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class search_product {
	WebDriver driver;

	public search_product(WebDriver ldriver)
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
	@FindBy(xpath="//input[@name='q']")
	WebElement search;
	
	
	
	public void WebElements(String uid,String pword,String input)
	{
		close.click();
		acc.click();
		sign.click();
		uname.sendKeys(uid);
		pwd.sendKeys(pword);
		signin.click();
		
		search.sendKeys(input);
		search.sendKeys(Keys.ENTER);
		
	}

	
}
