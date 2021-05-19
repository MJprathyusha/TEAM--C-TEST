package com.website.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class VerifyHomepage {
WebDriver driver;
    
    public VerifyHomepage(WebDriver ldriver)
    {
        this.driver=ldriver;
        
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
    
    @FindBy(xpath = "//*[@id=\"nav-tab-01\"]/a/span[1]")
    WebElement ceiling;
    @FindBy(xpath="//a[@title='All Pendant Lights']")
    WebElement pendant;
    @FindBy(xpath="//*[@id=\"main\"]/div[4]/div[2]/ul/li[1]/a/img")
    WebElement firstImg;
    
    public void WebElements(String uid,String pword)
    {
        close.click();
        Actions actions=new Actions(driver);
        actions.moveToElement(acc).click().perform();
        
        System.out.println("acc mouse hovered");
        sign.click();
        uname.sendKeys(uid);
        pwd.sendKeys(pword);
        signin.click();    
        System.out.println("sigin successfully");
        actions.moveToElement(ceiling).click().perform();
        System.out.println("ceiling mouse hoverd successfully");
        JavascriptExecutor javaScriptExecutor1 = (JavascriptExecutor)driver;
	      javaScriptExecutor1.executeScript("arguments[0].click()",pendant);
       // pendant.click();
        System.out.println("select pendant");
        JavascriptExecutor javaScriptExecutor2 = (JavascriptExecutor)driver;
	      javaScriptExecutor2.executeScript("arguments[0].click()",firstImg);
     //   firstImg.click();
        System.out.println("select first img");
        
        
        
}

}
