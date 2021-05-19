package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.SelectCeiling;

public class TC_CeilingLights extends BaseClass {
	@Test
	public void Select()
	{
		SelectCeiling sc=PageFactory.initElements(driver,SelectCeiling.class);
		sc.WebElements("logeshwari@gmail.com", "Test@123");
	}

}
