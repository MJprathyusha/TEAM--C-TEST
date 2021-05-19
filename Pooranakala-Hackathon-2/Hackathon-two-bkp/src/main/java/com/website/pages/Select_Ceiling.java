package com.website.pages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Select_Ceiling {
	WebDriver driver;

	public Select_Ceiling(WebDriver ldriver)
	{
		this.driver=ldriver;
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
	@FindBy(xpath = "//*[@id=\"nav-tab-01\"]/a/span[1]")
	WebElement ceiling;
	@FindBy (xpath="//a[@title='All Chandeliers']")
	WebElement all_chandleirs;
	//@FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	//WebElement close1;
	//@FindBy(linkText="large chandelier")
	//WebElement large;
	
	
	
	public void WebElements(String uid,String pword,String URL)
	{
		close.click();
		acc.click();
		sign.click();
		uname.sendKeys(uid);
		pwd.sendKeys(pword);
		signin.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(ceiling).click().perform();
		System.out.println("ceiling mouse hoverd successfully");
		
		all_chandleirs.click();
		System.out.println("all chandliers clicked successfully");
		
		//close1.click();
			driver.navigate().to(URL);
		//JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
        //javaScriptExecutor.executeScript("arguments[0].click()",large);
		//large.click();
		System.out.println("large clicked");
	}
	
	
	
	
	
	
	
	
	
}
