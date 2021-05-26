package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LogOut_Page;
import com.website.pages.Remove_from_cart;

public class TC_Logout extends BaseClass {

	@Test
	public void logout() {

		LogOut_Page rc = PageFactory.initElements(driver, LogOut_Page.class);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rc.WebElements("spooranakala@gmail.com","Poorana@123");
		System.out.println("logout successfully");
		
	}

}
