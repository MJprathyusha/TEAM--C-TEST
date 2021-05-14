package com.hackathon.selenium.pages;

import com.hackathon.selenium.base.BasePage;
import com.hackathon.selenium.pageelements.OpencartHomePageElements;
import com.hackathon.selenium.pageelements.RegisterAccountPageElements;

public class RegisterAccountPage extends BasePage {

	public static void clickOnMyAccount() {
		driver.findElement(OpencartHomePageElements.OPENCART_MYACCOUNT).click();
	}

	public static void clickOnRegister() {
		driver.findElement(OpencartHomePageElements.OPENCART_REGISTER).click();
	}

	public static void enterFirstName(String firstName) {
		driver.findElement(RegisterAccountPageElements.FIRST_NAME).sendKeys(firstName);
	}	

	public static void enterLastName(String lastName) {
		driver.findElement(RegisterAccountPageElements.LAST_NAME).sendKeys(lastName);
	}

	public static void enterEmail(String email) {
		driver.findElement(RegisterAccountPageElements.EMAIL).sendKeys(email);
	}

	public static void enterTelephone(String telephone) {
		driver.findElement(RegisterAccountPageElements.TELEPHONE).sendKeys(telephone);
	}

	public static void enterPassword(String password) {
		driver.findElement(RegisterAccountPageElements.PASSWORD).sendKeys(password);
	}

	public static void enterConfirmPassword(String confirmPassword) {
		driver.findElement(RegisterAccountPageElements.PASSWORD_CONFIRM).sendKeys(confirmPassword);
	}

	public static void checkPrivacy() {
		driver.findElement(RegisterAccountPageElements.PRIVACY_CHECK).click();
	}

	public static void clickOnContinue() {
		driver.findElement(RegisterAccountPageElements.CONTINUE).click();
	}

}
