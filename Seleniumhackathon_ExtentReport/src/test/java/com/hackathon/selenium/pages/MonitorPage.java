package com.hackathon.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hackathon.selenium.base.BasePage;
import com.hackathon.selenium.pageelements.AppleCinema30PageElements;
import com.hackathon.selenium.pageelements.LoginPageElements;
import com.hackathon.selenium.pageelements.MonitorPageElements;

public class MonitorPage extends BasePage{
	
	public static void mouseHoverComponents() {
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(MonitorPageElements.COMPONENTS_TAB);
		actions.moveToElement(target).perform();		
	}
	
	public static void clickOnMonitor() {
		driver.findElement(MonitorPageElements.MONITORS).click();
		
	}
	
	public static void clickOnAppleCinema30() {
		driver.findElement(MonitorPageElements.APPLE_CINEMA_30).click();
	}
	
	public static void enterCheckBox() {
		driver.findElement(AppleCinema30PageElements.CHECKBOX_1).click();
	}

	public static void enterText() {
		driver.findElement(AppleCinema30PageElements.TEXT).clear();
		driver.findElement(AppleCinema30PageElements.TEXT).sendKeys("Hackathon");
		
	}
	
	public static void selectDropdown() {
		Select dropdownColor = new Select(driver.findElement(By.id("input-option217")));
		dropdownColor.selectByVisibleText("Blue (+$3.60)");
	}
	
	public static void enterTextArea() {
		driver.findElement(AppleCinema30PageElements.TEXTAREA).clear();
		driver.findElement(AppleCinema30PageElements.TEXTAREA).sendKeys("Hackathon Demo");
	}
	
	public static void fileUpload() throws InterruptedException {
		
		/*
		 * driver.findElement(AppleCinema30PageElements.UPLOAD_FILE).click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * Thread.sleep(5000); driver.switchTo().activeElement().
		 * sendKeys("C:\\Users\\Vishwanth Reddy\\Desktop\\DataFiles\\doc\\newdoc.docx");
		 * Thread.sleep(5000);
		 * 
		 * driver.switchTo().activeElement().sendKeys(Keys.RETURN);
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * Thread.sleep(5000);
		 */
        
        driver.findElement(AppleCinema30PageElements.UPLOAD_FILE).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(10000);
		driver.findElement(AppleCinema30PageElements.UPLOAD_FILE).sendKeys("C:\\Users\\Vishwanth Reddy\\Desktop\\DataFiles\\doc\\newdoc.docx");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(AppleCinema30PageElements.UPLOAD_FILE).sendKeys(Keys.RETURN);
		
		
	}
	
	public  static void enterDate() {
		
		driver.findElement(AppleCinema30PageElements.DATE).clear();
		driver.findElement(AppleCinema30PageElements.TIME).clear();
		driver.findElement(AppleCinema30PageElements.DATE_TIME).clear();
		
		driver.findElement(AppleCinema30PageElements.DATE).sendKeys("2021-05-10");
		driver.findElement(AppleCinema30PageElements.TIME).sendKeys("13:45");
		driver.findElement(AppleCinema30PageElements.DATE_TIME).sendKeys("2021-05-10 13:45");
		
	}
	
	public  static void clickOnAddToCart() {
		driver.findElement(AppleCinema30PageElements.ADD_TO_CART).click();
	}
	
	
}
