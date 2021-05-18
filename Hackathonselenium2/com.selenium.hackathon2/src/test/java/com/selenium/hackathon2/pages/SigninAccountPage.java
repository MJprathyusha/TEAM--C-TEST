package com.selenium.hackathon2.pages;

import com.selenium.hackathon2.base.BasePage;
import com.selenium.hackathon2.pageelements.MyAccountPageElements;
import com.selenium.hackathon2.pageelements.SigninAccountPageElements;

public class SigninAccountPage  extends BasePage {
	
	public static void clickOnAccount() {	
		driver.findElement(MyAccountPageElements.ACCOUNT).click();
	}
	
	public static void closeAdvertiseWindow() {
		driver.findElement(SigninAccountPageElements.ADVERTISE_WINDOW).click();
	}
	
	public static void clickOnSignIn() {
		driver.findElement(SigninAccountPageElements.SIGN_IN).click();
	}
	
	public static void enterEmail(String email) {
		driver.findElement(SigninAccountPageElements.EMAIL).sendKeys(email);
	}
	
	public static void enterPassword(String password) {
		driver.findElement(SigninAccountPageElements.PASSWORD).sendKeys(password);
	}
    
	public static void clickOnSubmitSignIn() {
		driver.findElement(SigninAccountPageElements.SIGN_IN_SUBMIT).click();
	}
}
