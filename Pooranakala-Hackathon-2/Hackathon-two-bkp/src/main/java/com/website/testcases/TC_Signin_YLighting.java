package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LoginPage_YLighting;

public class TC_Signin_YLighting extends BaseClass
{
	@Test
	public void SigninTest()
	{
	LoginPage_YLighting lp = PageFactory.initElements(driver, LoginPage_YLighting.class);
	lp.WebElements("spooranakala@gmail.com","Poorana@123");
	System.out.println("Sigin successfully");
	}
}
