package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoPage {
	   WebDriver driver;

	   

	    public LogoPage(WebDriver ldriver) {
	        this.driver = ldriver;

	 

	    }

	 

	    @FindBy (xpath="//a[@class=\"ltkpopup-close\"]")
	    WebElement close;
	    @FindBy(xpath="//a[@class='logo-link lu-sprite']") WebElement Logo;
	    
	    public void WebElements()
	    {
	    	close.click();
	    	Logo.click();
	    	if(Logo.isDisplayed())
	    	{
	    		System.out.println("Logo is verified");
	    	}
	    	else
	    	{
	    		System.out.println("Logo not verified");
	    	}
	    }
}
