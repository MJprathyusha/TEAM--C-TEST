package com.hackathon.selenium.tests;

import java.util.concurrent.TimeUnit;

import com.hackathon.selenium.pages.LoginPage;
import com.hackathon.selenium.utilities.ReadpropertyExcel;

public class LoginUtil extends LoginPage{
	
	public static void loginFunctionality() {
		// reading Login details from Excel file

		ReadpropertyExcel rpExcel = new ReadpropertyExcel();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		LoginPage.clickOnMyAccount();
		LoginPage.clickOnLogin();
		LoginPage.enterEmail(rpExcel.email);
		LoginPage.enterPassword(rpExcel.password);
		LoginPage.clickOnSubmit();
	}
		
}
