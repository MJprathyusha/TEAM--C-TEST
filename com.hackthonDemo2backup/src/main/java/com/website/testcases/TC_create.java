package com.website.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.CreateAccountPage;

public class TC_create extends BaseClass{
	@Test
public void create()
{
		CreateAccountPage CreateAccountPage=PageFactory.initElements(driver,CreateAccountPage.class);
		CreateAccountPage.CreateAccount("logesh", "ramesh", "logeshwari@gmail.com", "logeshwari@gmail.com", "Test@123", "Test@123");
}

}
