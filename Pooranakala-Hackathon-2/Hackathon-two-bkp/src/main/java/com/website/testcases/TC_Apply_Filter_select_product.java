package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Apply_Filter_select_product;
import com.website.pages.BaseClass;
import com.website.pages.Select_Ceiling;

public class TC_Apply_Filter_select_product extends BaseClass
{
	@Test
	public void apply_filter()
	{
		Apply_Filter_select_product af = PageFactory.initElements(driver, Apply_Filter_select_product.class);
		
	af.WebElements("spooranakala@gmail.com","Poorana@123","https://www.ylighting.com/b/large-chandelier");
	
	System.out.println("selected successfully");
	}


}
