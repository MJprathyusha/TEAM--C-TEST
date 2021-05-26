package com.website.pages;

 

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

 

public class Scroll_UP_down {
    WebDriver driver;

 

    public Scroll_UP_down(WebDriver ldriver) {
        this.driver = ldriver;

 

    }

 

    @FindBy (xpath="//a[@class=\"ltkpopup-close\"]")
    WebElement close;
    @FindBy (xpath="//button[contains(@class,\"btn account-btn\")]")
    WebElement acc;
    @FindBy(xpath="//a[@id='my_account_hdr_link']")
    WebElement sign;
    @FindBy (xpath="//input[@id='dwfrm_login_username']")
    WebElement uname;
    @FindBy (xpath="//input[@id='dwfrm_login_password']")
    WebElement pwd;
    @FindBy (xpath="//button[@name='check-migrated']")
    WebElement signin;
    
    public void WebElements(String uid,String pword)
    {
        close.click();
        Actions actions=new Actions(driver);
        actions.moveToElement(acc).click().perform();
        //acc.click();
        sign.click();
        uname.sendKeys(uid);
        pwd.sendKeys(pword);
        signin.click();
        System.out.println("sigin successfully");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }
    
}
 