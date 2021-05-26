package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.RemoveCart;

public class TC_RemoveCart extends BaseClass{
	@Test
	public void Remove()
	{
		RemoveCart rc = PageFactory.initElements(driver, RemoveCart.class);
		rc.WebElements("logeshwari@gmail.com", "Test@123");
	}

}
