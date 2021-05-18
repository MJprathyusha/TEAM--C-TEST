package com.selenium.hackathon2.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.selenium.hackathon2.base.BasePage;
import com.selenium.hackathon2.pageelements.MyAccountPageElements;
import com.selenium.hackathon2.pageelements.YLightingPageElements;

public class HomePage  extends BasePage {
	
	public static void clickOnAccount() {
		driver.findElement(MyAccountPageElements.ACCOUNT).click();
	}
	
	public static void clickOnLOGO() {	
		driver.findElement(YLightingPageElements.LOGO).click();
	}

	public static void enterTextInSearch() {	
		driver.findElement(YLightingPageElements.SEARCH).sendKeys("Furniture");
	}
	
	public static void clickOnSearchIcon(){	
		driver.findElement(YLightingPageElements.SEARCH_ICON).click();
	} 
	
	
	public static void clickOnViewCart(){	
		driver.findElement(YLightingPageElements.VIEW_CART).click();
	} 
	
	public static void clickOnRemoveLink(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =  driver.findElement(YLightingPageElements.REMOVE_CART);
		js.executeScript("arguments[0].click()", Element);
		//driver.findElement(YLightingPageElements.REMOVE_CART).click();
	} 
	
	public static void enterCouponCode() {
		
		driver.findElement(YLightingPageElements.APPLY_COUPON).sendKeys("OUTDOOR");
	}
	
	public static void clickOnApply(){	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =  driver.findElement(YLightingPageElements.APPLY_ICON);
		js.executeScript("arguments[0].click()", Element);
	}
	
	public static void enterZipCode() {	
		driver.findElement(YLightingPageElements.ZIP_CODE).sendKeys("99950");
	}
	
	public static void clickOnZipGo(){	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =  driver.findElement(YLightingPageElements.ZIP_GO);
		js.executeScript("arguments[0].click()", Element);
		
	}
	
	
	public static void clickOnAddQuantity(){	
		driver.findElement(YLightingPageElements.VERIFY_QUANTITY).click();
	}
	
	public static void navigateToHomePage(){	
		driver.navigate().to("https://www.ylighting.com/");
	}
	
	public static void clickOnSignOut(){	
		driver.findElement(YLightingPageElements.SIGNOUT).click();
	}
	
	
	public static boolean verifyLogo(){	
		boolean logoFlag = driver.findElement(YLightingPageElements.LOGO).isDisplayed();
		return logoFlag;
	}
	
	
	
	
}
