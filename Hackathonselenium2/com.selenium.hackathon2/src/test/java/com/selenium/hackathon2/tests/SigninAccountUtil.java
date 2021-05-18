package com.selenium.hackathon2.tests;

import com.selenium.hackathon2.pages.SigninAccountPage;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class SigninAccountUtil extends SigninAccountPage {

	

	public static void signInFunctionality() throws InterruptedException {
		
		ReadPropertyExcel rpExcel = new ReadPropertyExcel();

		
		SigninAccountPage.closeAdvertiseWindow();
		SigninAccountPage.clickOnAccount();
		SigninAccountPage.clickOnSignIn();
		Thread.sleep(5000);
		SigninAccountPage.enterEmail(rpExcel.email);
		SigninAccountPage.enterPassword(rpExcel.password);
		SigninAccountPage.clickOnSubmitSignIn();
		
	}

}
