package com.website.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.search_product;

public class TC_search_product extends BaseClass
{

	@Test
	public void Test_Search_product()
	{
		search_product sac = PageFactory.initElements(driver, search_product.class);
		
		
		
		sac.WebElements("spooranakala@gmail.com", "Poorana@123", "mirror");
		System.out.println("mirror searched succesfully");
		System.out.println("mirror searched done successfully");
		
	}
}
