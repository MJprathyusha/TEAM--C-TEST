package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LogoPage;

public class TC_Logo extends BaseClass {
	@Test
    public void Logo() {
		 LogoPage lp = PageFactory.initElements(driver, LogoPage.class);
	        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        lp.WebElements();
 
	}

}
