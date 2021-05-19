package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogOut_Page {
	WebDriver driver;

	public LogOut_Page(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	WebElement close;
	@FindBy(xpath = "//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/span")
	WebElement acc;
	@FindBy(xpath = "//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/div/div/a")
	WebElement sign;
	@FindBy(xpath = "//input[@id='dwfrm_login_username']")
	WebElement uname;
	@FindBy(xpath = "//input[@id='dwfrm_login_password']")
	WebElement pwd;
	@FindBy(xpath = "//*[@id=\"dwfrm_login\"]/fieldset/div[3]/div[2]/button/span")
	WebElement signin;
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/div/div/span/a")
	WebElement logout;
	
	public void WebElements(String uid,String pword)
	{
		close.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(acc).click().perform();
		
		System.out.println("acc mouse hovered");
		sign.click();
		uname.sendKeys(uid);
		pwd.sendKeys(pword);
		signin.click();	
		System.out.println("sigin successfully");
		actions.moveToElement(logout).click().perform();
		//logout.click();
		System.out.println("logout successfully");
	}
		
}
