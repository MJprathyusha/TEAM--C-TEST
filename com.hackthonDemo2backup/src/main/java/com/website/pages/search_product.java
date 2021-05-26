package com.website.pages;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class search_product {
    WebDriver driver;

 

    public search_product(WebDriver ldriver)
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
    @FindBy(xpath="//input[@name='q']")
    WebElement search;
    
    
    
    public void WebElements(String uid,String pword,String input)
    {
        close.click();
        acc.click();
        sign.click();
        uname.sendKeys(uid);
        pwd.sendKeys(pword);
        signin.click();
        
        search.sendKeys(input);
        search.sendKeys(Keys.ENTER);
    }
    }

 

    
