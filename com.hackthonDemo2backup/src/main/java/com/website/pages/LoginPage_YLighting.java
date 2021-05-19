package com.website.pages;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class LoginPage_YLighting {
    
    WebDriver driver;

 

    public LoginPage_YLighting(WebDriver ldriver)
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
    
    
    public void WebElements(String uid,String pword)
    {
        close.click();
        acc.click();
        sign.click();
        uname.sendKeys(uid);
        pwd.sendKeys(pword);
        signin.click();
        
    }
}
 