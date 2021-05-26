package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.Verify_Home;
import com.website.pages.Verify_Title;

public class TC_Verify_Home extends BaseClass{
	
	
    @Test
    public void Verify_Home_Page()
    {
    	Verify_Home vh = PageFactory.initElements(driver, Verify_Home.class);
    vh.WebElements("spooranakala@gmail.com","Poorana@123");
    
    driver.navigate().back();
    System.out.println("verify home page correctly");

}
    }
