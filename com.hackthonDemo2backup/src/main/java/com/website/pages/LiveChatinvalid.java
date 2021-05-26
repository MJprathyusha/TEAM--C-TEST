package com.website.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveChatinvalid {
	 WebDriver driver;

	 

	    public LiveChatinvalid(WebDriver ldriver)
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
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	        JavascriptExecutor javaScriptExecutor1 = (JavascriptExecutor)driver;

	        javaScriptExecutor1.executeScript("arguments[0].click()",livechatlink);
		      System.out.println("Livechat clicked successfully");
	        
	        System.out.println("live chat opened");
	        
	        nameField.sendKeys(name);
	        emailField.sendKeys(email);
	        submit.click();
	        
	        
	    }
}
