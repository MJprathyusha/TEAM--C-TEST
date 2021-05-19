package com.website.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Remove_from_cart {
	WebDriver driver;

	public Remove_from_cart(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	WebElement close;

	@FindBy(xpath = "//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/span")
	WebElement acc;
	@FindBy(xpath = "//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/div/div/a")
	WebElement sign;
	@FindBy(xpath = "//input[@id='dwfrm_login_username']")
	WebElement uname;
	@FindBy(xpath = "//input[@id='dwfrm_login_password']")
	WebElement pwd;
	@FindBy(xpath = "//*[@id=\"dwfrm_login\"]/fieldset/div[3]/div[2]/button/span")
	WebElement signin;
	@FindBy(xpath = "//*[@id=\"nav-tab-01\"]/a/span[1]")
	WebElement ceiling;
	@FindBy(xpath = "//a[@title='All Chandeliers']")
	WebElement all_chandleirs;
	@FindBy(xpath = "//span[@title='shop by']")
	WebElement shop;
	// @FindBy(xpath = "//a[@class=\"ltkpopup-close\"]")
	// WebElement close1;
	@FindBy(xpath = "//*[@id=\"nav-tab-11\"]/ul/li/div[2]/a[5]")
	WebElement modern;
	@FindBy(xpath = "//*[@id=\"refinement-YL_BestSellerScore\"]/div[2]/ul/li[1]/a/span[1]/input")
	WebElement ready;
	@FindBy(xpath = "//img[@alt='Vertigo Pendant Light']")
	WebElement img;
	@FindBy(xpath="//*[@id=\"add-to-cart\"]")
	WebElement added;
	@FindBy(linkText="Checkout")
	WebElement checkout;
	@FindBy(xpath="//*[@id=\"mcBookMark\"]/span[2]")
	WebElement cart;
	@FindBy(xpath="//*[@value=\"Remove\"]")
	WebElement remove;
	
	public void WebElements(String uid, String pword, String URL) {
		close.click();
		acc.click();
		sign.click();
		uname.sendKeys(uid);
		pwd.sendKeys(pword);
		signin.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(ceiling).click().perform();
		System.out.println("ceiling mouse hoverd successfully");

		all_chandleirs.click();
		System.out.println("clicked successfully");

		driver.navigate().to(URL);
		// large.click();
		System.out.println("large clicked");
		actions.moveToElement(shop).click().perform();
		System.out.println("shop mouse hovered");
		// close1.click();
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].click()", modern);

		System.out.println("modern selected");
		ready.click();
		System.out.println("ready to ship clicked");
		JavascriptExecutor javaScriptExecutor1 = (JavascriptExecutor) driver;
		javaScriptExecutor1.executeScript("arguments[0].click()", img);
		// img.click();
		System.out.println("image selected");
		added.click();
		System.out.println("add to cart clicked");
		checkout.click();
		System.out.println("checkout");
		cart.click();
		System.out.println("cart viewed");
		remove.click();
		System.out.println("remove clicked");
	}
}
