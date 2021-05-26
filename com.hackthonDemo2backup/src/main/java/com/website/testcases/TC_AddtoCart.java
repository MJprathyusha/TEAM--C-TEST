package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Addtocart;
import com.website.pages.BaseClass;

public class TC_AddtoCart extends BaseClass {
	@Test
	public void Add() {
		Addtocart ac = PageFactory.initElements(driver, Addtocart.class);
		ac.WebElements("logeshwari@gmail.com", "Test@123");
	}

}
