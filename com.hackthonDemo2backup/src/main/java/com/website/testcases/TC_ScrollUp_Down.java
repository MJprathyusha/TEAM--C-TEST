package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.Scroll_UP_down;

public class TC_ScrollUp_Down extends BaseClass{
	@Test
    public void scroll() {

 

        Scroll_UP_down sd = PageFactory.initElements(driver, Scroll_UP_down.class);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        sd.WebElements("logeshwari@gmail.com","Test@123");
        System.out.println("scrolled up and down successfully");
        
    }

}
