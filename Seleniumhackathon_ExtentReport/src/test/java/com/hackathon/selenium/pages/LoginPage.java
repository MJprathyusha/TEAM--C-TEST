package com.hackathon.selenium.pages;

import com.hackathon.selenium.base.BasePage;
import com.hackathon.selenium.pageelements.IphonePageElements;
import com.hackathon.selenium.pageelements.LoginPageElements;
import com.hackathon.selenium.pageelements.OpencartHomePageElements;

public class LoginPage extends BasePage {
	
	public static void clickOnMyAccount() {
		driver.findElement(OpencartHomePageElements.OPENCART_MYACCOUNT).click();
	}

	public static void clickOnLogin() {
		driver.findElement(OpencartHomePageElements.OPENCART_LOGIN).click();
	}
	
	public static void enterEmail(String email) {
		driver.findElement(LoginPageElements.LOGIN_EMAIL).sendKeys(email);
	}
	
	public static void enterPassword(String password) {
		driver.findElement(LoginPageElements.LOGIN_PASSWORD).sendKeys(password);
	}
	
	public static void clickOnSubmit() {
		driver.findElement(LoginPageElements.LOGIN_SUBMIT).click();
	}
	
	public static void clickOnHomePage() {
		driver.findElement(LoginPageElements.HOME_BUTTON).click();
	}
    
	public static void clickOnEditAccount() {
		driver.findElement(LoginPageElements.EDIT_ACCOUNT).click();
	}
	
	public static void clearLastName() {
		driver.findElement(LoginPageElements.UPDATE_LASTNAME).clear();
	}
	
	public static void enterNewLastName() {
		driver.findElement(LoginPageElements.UPDATE_LASTNAME).sendKeys("Maheswari1");
	}
	
	public static void clickOnEditContinue() {
		driver.findElement(LoginPageElements.EDIT_CONTINUE).click();
	}
	
	public static void clickOnLogout() {
		driver.findElement(LoginPageElements.LOGOUT).click();
	}
	
	public static void clickOnLogoutContinue() {
		driver.findElement(LoginPageElements.LOGOUT_CONTINUE).click();
	}
	
	public static void enterSearchText() {
		driver.findElement(IphonePageElements.SEARCH).sendKeys("Iphone");
	}
	
	public static void clickOnSearchIcon() {
		
		driver.findElement(IphonePageElements.SEARCH_ICON).click();
	}
	
	public static void clickOnIphone() {
		driver.findElement(IphonePageElements.IPHONE).click();
	}
	
	public static void enterQuantity() {
		driver.findElement(IphonePageElements.QUANTITY).clear();
		driver.findElement(IphonePageElements.QUANTITY).sendKeys("2");
	}
	
	public static void clickOnAddToCart() {
		driver.findElement(IphonePageElements.ADD_TO_CART).click();
	}
	
	public static void clickOnShippingCart() {
		driver.findElement(IphonePageElements.SHIPPING_CART).click();
	}
	
	public static void clickOnCheckout() {
		driver.findElement(IphonePageElements.CHECKOUT).click();
	}
	
	

}
