package com.selenium.hackathon2.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.hackathon2.base.BasePage;
import com.selenium.hackathon2.pageelements.CeilingPageElements;
import com.selenium.hackathon2.pageelements.MyAccountPageElements;
import com.selenium.hackathon2.pageelements.YLightingPageElements;

public class CeilingPage extends BasePage {
	
	
	public static void navigateToHomePage(){	
		driver.navigate().to("https://www.ylighting.com/");
	}
	
	public static void clickOnCeilingLights() {	
		driver.findElement(CeilingPageElements.CEILING).click();
	}
	
	public static void clickOnChandeliers() {	
		driver.findElement(CeilingPageElements.CHANDELIERS).click();
	}
	
	public static void clickOnLargeChandeliers() {	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =  driver.findElement(CeilingPageElements.LARGE_CHANDELIERS);
		js.executeScript("arguments[0].click()", Element);
	}
		
	public static void clickOnIntegartedLedFilter() {
		driver.findElement(CeilingPageElements.INTEGRATED_LED_FILTER).click();
	}
	
	public static void clickOnDaleychandelier() {
		driver.findElement(CeilingPageElements.DALEY_CHANDELIER).click();
	}
	
	
	public static void clickOnAddToCart() {	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =  driver.findElement(CeilingPageElements.ADD_TO_CART);
		js.executeScript("arguments[0].click()", Element);
		//driver.findElement(CeilingPageElements.ADD_TO_CART).click();
	}
	
	public static void clickOnCheckOut() {	
		driver.findElement(CeilingPageElements.CHECK_OUT).click();
	}
	
	
	public static void mouseHoverOnViewCart() {	
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(YLightingPageElements.VIEW_CART);
		actions.moveToElement(target).perform();
	}
	
		
	

}
