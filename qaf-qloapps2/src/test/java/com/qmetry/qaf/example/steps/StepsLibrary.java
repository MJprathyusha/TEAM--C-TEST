package com.qmetry.qaf.example.steps;
import com.qmetry.qaf.automation.step.QAFTestStep;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;

public class StepsLibrary
{
	
	@QAFTestStep(description = "register")
	public static void Register(String FirstName,String LastName,String demoemail,String password) throws InterruptedException 
	{
		click("click_sign_in");
		sendKeys(demoemail,"enter_emailtocreate");
		click("click_create_account");
		sendKeys(FirstName,"customer_firstname");
		sendKeys(LastName,"customer_lastname");
		Thread.sleep(2000);
		clear("email_toregister");
		sendKeys(demoemail,"email_toregister");
		sendKeys(password,"passwd_toregister");
		Thread.sleep(2000);
		new SelectBox("days").sendKeys("7");
		new SelectBox("months").sendKeys("July");
		new SelectBox("years").sendKeys("1997");
		Thread.sleep(2000);
		click("submit_toregister");
		Thread.sleep(4000);
	}
	
	@QAFTestStep(description = "login")
	public static void loginFor(String email, String password)throws InterruptedException 
			
	{
		click("click_sign_in");
		Thread.sleep(2000);
		clear("Enter_EmailToLogin");
		sendKeys("divyaprakashnelluri@gmail.com","Enter_EmailToLogin");
		clear("Enter_PasswordToLogin");
		sendKeys(password,"Enter_PasswordToLogin");
		click("submit_tologin");
		Thread.sleep(4000);
	}
	
	
	@QAFTestStep(description = "adding address")
	public static void addAddress(String company,String address, String city,String other)
			throws InterruptedException 
	{
		
		click("add_address");
		Thread.sleep(2000);
		sendKeys(company,"enter_company");
		sendKeys(address,"enter_address");
		Thread.sleep(2000);
	    sendKeys(city,"enter_city");
		new SelectBox("enter_state").sendKeys("Alabama");
		Thread.sleep(2000);
		sendKeys("10001","enter_zipcode");
		Thread.sleep(2000);
		//new SelectBox("enter_country").sendKeys("India");
		Thread.sleep(2000);
		sendKeys("9640661588","enter_homephone");
		sendKeys("9948928801","enter_mobilephone");
		Thread.sleep(2000);
		sendKeys(other,"enter_additional_info");
		click("click_save_address");
		Thread.sleep(4000);
		
	}
	
	
	
}
