package com.website.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {
	WebDriver driver;
	public CreateAccountPage(WebDriver Lodriver)
	{
		this.driver=Lodriver;
		
	}
	@FindBy (xpath="//a[@class=\"ltkpopup-close\"]") WebElement close;
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div") WebElement acc;
	@FindBy(xpath="//a[@id=\"my_account_hdr_link\"]") WebElement myacc;
	@FindBy(xpath="//input[@id=\"dwfrm_profile_customer_firstname\"]") WebElement firstname;
	@FindBy(xpath="//input[@id=\"dwfrm_profile_customer_lastname\"]") WebElement lastname;
	@FindBy(xpath="//input[@id=\"dwfrm_profile_customer_email\"]") WebElement email;
	@FindBy(xpath="//input[@id=\"dwfrm_profile_customer_emailconfirm\"]") WebElement emailconfirm;
	@FindBy(xpath="//input[@id=\"dwfrm_profile_login_password\"]") WebElement pass;
	@FindBy(xpath="//input[@id=\"dwfrm_profile_login_passwordconfirm\"]") WebElement passconfirm;
	@FindBy (xpath="//button[@name='dwfrm_profile_confirm']") WebElement btn;
	
	public void CreateAccount(String frstname,String lstname,String email1,String email2,String passd,String passcon)
	{
		close.click();
		acc.click();
		myacc.click();
		firstname.sendKeys(frstname);
		lastname.sendKeys(lstname);
		email.sendKeys(email1);
		emailconfirm.sendKeys(email2);
		pass.sendKeys(passd);
		passconfirm.sendKeys(passcon);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
	      javaScriptExecutor.executeScript("arguments[0].click()",btn);
		/*btn.click();*/
		
		
		
	}
	

}


