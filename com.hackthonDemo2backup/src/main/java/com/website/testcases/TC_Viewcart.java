package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Addtocart;
import com.website.pages.BaseClass;

public class TC_Viewcart extends BaseClass{
	@Test
	public void Add() {
		Addtocart vc = PageFactory.initElements(driver, Addtocart.class);
		vc.WebElements("logeshwari@gmail.com", "Test@123");
	}
}
