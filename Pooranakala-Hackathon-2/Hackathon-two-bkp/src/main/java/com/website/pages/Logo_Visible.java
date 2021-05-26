package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logo_Visible {

	WebDriver driver;

	public Logo_Visible(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	WebElement close;
	@FindBy(xpath="//a[@class='logo-link lu-sprite']")
	WebElement logo;
	
	public void WebElements()
	{
		close.click();
		logo.click();
		if (logo.isDisplayed())
        {
             System.out.println("Image is displayed.");
        }
        else
        {
            System.out.println("Image is not displayed.");
        }
	}
}
