package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.Remove_from_cart;
import com.website.pages.Scroll_UP_down;

public class TC_Scroll_up_down extends BaseClass {

	@Test
	public void scroll() {

		Scroll_UP_down sc = PageFactory.initElements(driver, Scroll_UP_down.class);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sc.WebElements("spooranakala@gmail.com","Poorana@123");
		System.out.println("scrolled up and down successfully");
		
	}

}
