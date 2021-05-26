package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.website.pages.BaseClass;
import com.website.pages.Select_Ceiling;

public class TC_Select_Ceiling extends BaseClass
{
	@Test
	public void Select_Test()
	{
		Select_Ceiling ac = PageFactory.initElements(driver, Select_Ceiling.class);
		
	ac.WebElements("spooranakala@gmail.com","Poorana@123","https://www.ylighting.com/b/large-chandelier");
	
	System.out.println("selected successfully");
	}

}
