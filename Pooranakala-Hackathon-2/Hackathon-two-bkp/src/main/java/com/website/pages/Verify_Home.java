package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Verify_Home {
WebDriver driver;
	
	public Verify_Home(WebDriver ldriver)
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
	@FindBy(xpath = "//*[@id=\"nav-tab-01\"]/a/span[1]")
	WebElement ceiling;
	@FindBy(xpath="//a[@title='LED Pendant Lights']")
	WebElement pendant;
	//@FindBy(xpath="//img[@title='Random II Pendant Light']")
	//WebElement firstImg;
	
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
		
		actions.moveToElement(ceiling).click().perform();
		System.out.println("ceiling mouse hoverd successfully");
		pendant.click();
		System.out.println("select pendant");
		//firstImg.click();
		//System.out.println("select first img");
		
		
		
}
}