package com.website.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.ZipCode;

public class TC_ZipCode extends BaseClass {
	@Test
	public void Zip() throws IOException {
		ZipCode cc = PageFactory.initElements(driver, ZipCode.class);
		cc.WebElements("logeshwari@gmail.com", "Test@123","123");
	}

}
