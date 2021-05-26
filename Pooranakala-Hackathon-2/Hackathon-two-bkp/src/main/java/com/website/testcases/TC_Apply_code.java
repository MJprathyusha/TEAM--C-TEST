package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Apply_code;
import com.website.pages.BaseClass;
import com.website.pages.Remove_from_cart;
import com.website.pages.Verify_Home;

public class TC_Apply_code extends BaseClass{
	
	
	@Test
	public void apply() {

		Apply_code ac = PageFactory.initElements(driver, Apply_code.class);
		
		ac.WebElements("spooranakala@gmail.com","Poorana@123","https://www.ylighting.com/b/large-chandelier","123456");
		System.out.println("applied the code successfully");
		
	}


}
