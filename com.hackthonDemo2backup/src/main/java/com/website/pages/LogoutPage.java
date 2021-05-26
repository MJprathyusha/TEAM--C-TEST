package com.website.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	  WebDriver driver;

	  

	    public LogoutPage(WebDriver ldriver)
	    {
	        this.driver=ldriver;
	    }
	    @FindBy (xpath="//a[@class=\"ltkpopup-close\"]")
	    WebElement close;
	    @FindBy (xpath="//button[contains(@class,\"btn account-btn\")]")
	    WebElement acc;
	    @FindBy(xpath="//a[@id='my_account_hdr_link']")
	    WebElement sign;
	    @FindBy (xpath="//input[@id='dwfrm_login_username']")
	    WebElement uname;
	    @FindBy (xpath="//input[@id='dwfrm_login_password']")
	    WebElement pwd;
	    @FindBy (xpath="//button[@name='check-migrated']")
	    WebElement signin;
	    @FindBy (xpath="//button[contains(@class,\"btn account-btn\")]")
	    WebElement acc1;
	    @FindBy(xpath="//a[@class='logout']") WebElement signout;
	    
	    public void WebElements(String uid,String pword)
	    {
	        close.click();
	        acc.click();
	        sign.click();
	        uname.sendKeys(uid);
	        pwd.sendKeys(pword);
	        signin.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        Actions actions=new Actions(driver);
	        actions.moveToElement(acc1).perform();
	        
	        System.out.println("acc mouse hovered");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        actions.moveToElement(signout).click().perform();

}
}