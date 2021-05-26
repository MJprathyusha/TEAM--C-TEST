package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Apply_code;
import com.website.pages.BaseClass;
import com.website.pages.Zip_Code;

public class TC_Zip_code extends BaseClass{

	@Test
	public void apply() {

		Zip_Code zc = PageFactory.initElements(driver, Zip_Code.class);
		
		zc.WebElements("spooranakala@gmail.com","Poorana@123","https://www.ylighting.com/b/large-chandelier","123456");
		System.out.println("applied the zip code successfully");
		
	}
}
