package com.website.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SelectCeiling {
	WebDriver driver;

	public SelectCeiling(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	WebElement close;
	@FindBy(xpath = "//button[contains(@class,\"btn account-btn\")]")
	WebElement acc;
	@FindBy(xpath = "//a[@id='my_account_hdr_link']")
	WebElement sign;
	@FindBy(xpath = "//input[@id='dwfrm_login_username']")
	WebElement uname;
	@FindBy(xpath = "//input[@id='dwfrm_login_password']")
	WebElement pwd;
	@FindBy(xpath = "//button[@name='check-migrated']")
	WebElement signin;
	@FindBy(xpath = "//*[@id='nav-tab-01']/a/span[1]")
	WebElement ceil;
	@FindBy(xpath = "//*[@id='nav-tab-01']/ul/li/div[2]/a[1]")
	WebElement all_chandleirs;
	/*@FindBy(xpath = "//a[@title='Ceiling Lights']")
	WebElement ceiling*/;
	@FindBy(linkText="large chandelier") WebElement Large;
	@FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	WebElement close1;
	public void WebElements(String uid, String pword) {
		close.click();
		acc.click();
		sign.click();
		uname.sendKeys(uid);
		pwd.sendKeys(pword);
		signin.click();

		System.out.println("Sigin Successfully");
		Actions actions = new Actions(driver);
		actions.moveToElement(ceil).click().perform();
		System.out.println("ceiling mouse hoverd successfully");
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
	      javaScriptExecutor.executeScript("arguments[0].click()",all_chandleirs);
		//all_chandleirs.click();
		System.out.println("All Chandeliers clicked Successfully");
		JavascriptExecutor javaScriptExecutor1 = (JavascriptExecutor)driver;
	      javaScriptExecutor1.executeScript("arguments[0].click()",Large);
	      System.out.println("Large Chandelier clicked successfully");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	      close1.click();
	      
		/*ceiling.click();
		System.out.println("Ceiling lights clicked");*/

	}
}
