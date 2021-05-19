package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAcctPage extends BaseClass {
	
	WebDriver driver;

	public  CreateAcctPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy (xpath="//a[@class=\"ltkpopup-close\"]")
	WebElement close;
	@FindBy (xpath="//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/span")
	WebElement acc;
	@FindBy (xpath="//a[@id='my_account_hdr_link']")
	WebElement myacc;
	@FindBy (xpath="//input[@id='dwfrm_profile_customer_firstname']")
	WebElement firstName;
	@FindBy (xpath="//input[@id='dwfrm_profile_customer_lastname']")
	WebElement lastName;
	@FindBy (xpath="//input[@id='dwfrm_profile_customer_email']")
	WebElement email;
	@FindBy (xpath="//input[@id='dwfrm_profile_customer_emailconfirm']")
	WebElement confirmEmail;
	@FindBy (xpath="//input[@id='dwfrm_profile_login_password']")
	WebElement pass;
	@FindBy (xpath="//input[@id='dwfrm_profile_login_passwordconfirm']")
	WebElement confirmpass;
	@FindBy (xpath="//*[@id=\"RegistrationForm\"]/fieldset/div[4]/button/span")
	WebElement createAcc;
	
	public void WebElements(String firstname,String lastname,String uid,String confirm,String pwd,String conpwd)
	{
		close.click();
		acc.click();
		myacc.click();
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email.sendKeys(uid);
		confirmEmail.sendKeys(confirm);
		pass.sendKeys(pwd);
		confirmpass.sendKeys(conpwd);
		createAcc.click();
	}
}
