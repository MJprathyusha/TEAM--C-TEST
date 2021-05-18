package com.selenium.hackathon2.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.selenium.hackathon2.base.BasePage;
import com.selenium.hackathon2.pageelements.MyAccountPageElements;
import com.selenium.hackathon2.pageelements.SigninAccountPageElements;

public class MyAccountPage extends BasePage{
	
	public static void clickOnAccount() {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; WebElement Element =
		 * driver.findElement(MyAccountPageElements.ACCOUNT);
		 * js.executeScript("arguments[0].click()", Element);
		 */
		driver.findElement(MyAccountPageElements.ACCOUNT).click();
	}
	
	public static void closeAdvertiseWindow() {
		driver.findElement(SigninAccountPageElements.ADVERTISE_WINDOW).click();
	}
	
	public static void clickOnMYAccount() {
		driver.findElement(MyAccountPageElements.MY_ACCOUNT_REGISTER).click();
	}
	
	public static void enterFirstName(String firstname) {
		driver.findElement(MyAccountPageElements.FIRST_NAME).sendKeys(firstname);
	}
	
	public static void enterLastName(String lastname) {
		driver.findElement(MyAccountPageElements.LAST_NAME).sendKeys(lastname);
	}
	
	public static void enterEmailAddress(String emailaddress) {
		driver.findElement(MyAccountPageElements.EMAIL_ADDRESS).sendKeys(emailaddress);
	}
	
	public static void enterConfirmEmailAddress(String confirmemailaddress) {
		driver.findElement(MyAccountPageElements.CONFIRM_EMAIL_ADDRESS).sendKeys(confirmemailaddress);
	}
	
	public static void enterPassword(String password) {
		driver.findElement(MyAccountPageElements.PASSWORD).sendKeys(password);
	}
	
	public static void enterConfirmPassword(String confirmpassword) {
		driver.findElement(MyAccountPageElements.CONFIRM_PASSWORD).sendKeys(confirmpassword);
	}
	
	public static void clickOnConfirmAccount() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =  driver.findElement(MyAccountPageElements.CONFIRM_ACCOUNT);
		js.executeScript("arguments[0].click()", Element);		
		
	}

}
