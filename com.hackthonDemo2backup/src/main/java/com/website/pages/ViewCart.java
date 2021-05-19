package com.website.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ViewCart {
	WebDriver driver;

	public ViewCart(WebDriver ldriver) {
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
	@FindBy(xpath = "//*[@id=\"nav-tab-01\"]/ul/li/div[2]/a[1]")
	WebElement all_chandleirs;
	/*@FindBy(xpath = "//a[@title='Ceiling Lights']")
	WebElement ceiling*/;
	@FindBy(linkText="large chandelier") WebElement Large;
	@FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	WebElement close1;
	@FindBy(xpath="//span[@title='shop by']") WebElement Shop;
	@FindBy(linkText="Industrial Modern") WebElement ind;
	
	@FindBy(xpath = "//*[@id=\"refinement-YL_BestSellerScore\"]/div[2]/ul/li[1]/a/span[1]/input")
    WebElement ready;
	@FindBy(xpath="//img[@alt='Bluff City 14-Inch Pendant Light']") WebElement img;
	@FindBy(xpath="//*[@id=\"add-to-cart\"]")
    WebElement added;
    @FindBy(linkText="Checkout")
    WebElement checkout;
    @FindBy(xpath="//*[@id='mcBookMark']/span[2]")
    WebElement cart;
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
	      
			actions.moveToElement(Shop).click().perform();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		      System.out.println("shop clicked successfully");

			
			JavascriptExecutor javaScriptExecutor2 = (JavascriptExecutor)driver;
		      javaScriptExecutor2.executeScript("arguments[0].click()",ind);
			//ind.click();
		      System.out.println("Industrial modern clicked successfully");

		      JavascriptExecutor javaScriptExecutor3 = (JavascriptExecutor)driver;
		      javaScriptExecutor3.executeScript("arguments[0].click()",img);
		      System.out.println("image clicked successfully");
		      JavascriptExecutor javaScriptExecutor4 = (JavascriptExecutor)driver;
		      javaScriptExecutor4.executeScript("arguments[0].click()",added);
		     // added.click();
		      System.out.println("added Successfully");
		      checkout.click();
		      System.out.println("Checkout  Successfully");
		      cart.click();
		    System.out.println("Cart clicked successfully");

	      
		
	}
}
