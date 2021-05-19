package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.VerifyQuantity;

public class TC_VerifyQuantity extends BaseClass {
	@Test
	public void Increase() {
		VerifyQuantity vq = PageFactory.initElements(driver, VerifyQuantity.class);
		vq.WebElements("logeshwari@gmail.com", "Test@123");
	}

}
