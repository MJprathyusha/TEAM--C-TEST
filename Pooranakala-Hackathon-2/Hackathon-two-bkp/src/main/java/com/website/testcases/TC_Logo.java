package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.Increase_Quantity;
import com.website.pages.Logo_Visible;

public class TC_Logo extends BaseClass{
	 @Test
	    public void visible()
	    {
		 Logo_Visible ac = PageFactory.initElements(driver, Logo_Visible.class);
	    ac.WebElements();
	    System.out.println("logo is visible");
	    
}
}
