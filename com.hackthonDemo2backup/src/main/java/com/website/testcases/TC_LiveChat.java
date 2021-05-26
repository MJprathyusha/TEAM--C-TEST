package com.website.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LiveChatPage;

public class TC_LiveChat extends BaseClass {

	

		    @Test
		    public void LiveChat() {

		 

		        LiveChatPage lp = PageFactory.initElements(driver, LiveChatPage.class);
		        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        lp.WebElements("Logesh","logeshwari@gmail.com");
		        System.out.println("sign in successfully");
		        System.out.println("Live chat done successfully");
    }
		}

