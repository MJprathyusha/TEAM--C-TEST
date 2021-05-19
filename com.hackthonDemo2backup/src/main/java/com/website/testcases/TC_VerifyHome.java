package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.VerifyHomepage;

public class TC_VerifyHome extends BaseClass{
	 @Test
	    public void Home()
	    {
		 VerifyHomepage bb = PageFactory.initElements(driver, VerifyHomepage.class);
		 bb.WebElements( "logeshwari@gmail.com", "Test@123");
		 
		 

	    driver.navigate().to("https://www.ylighting.com//");
	    System.out.println("Home page verified Successfully");

	 

	}

}
