package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LogoutPage;

public class TC_Logout extends BaseClass
{
	@Test
	public void Logout()
	{
		LogoutPage lp=PageFactory.initElements(driver, LogoutPage.class);
		lp.WebElements("logeshwari@gmail.com", "Test@123");
		System.out.println("Logout Successfully");
		
	}

}
