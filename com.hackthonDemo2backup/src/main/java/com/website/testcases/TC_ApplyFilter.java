package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.ApplyFilter;
import com.website.pages.BaseClass;


public class TC_ApplyFilter extends BaseClass{
	@Test
	public void Select()
	{
		ApplyFilter sc=PageFactory.initElements(driver,ApplyFilter.class);
		sc.WebElements("logeshwari@gmail.com", "Test@123");
	}


}
