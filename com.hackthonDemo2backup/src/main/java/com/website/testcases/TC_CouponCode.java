package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.CouponCode;

public class TC_CouponCode extends BaseClass {
	@Test
	public void coupon() {
		CouponCode cc = PageFactory.initElements(driver, CouponCode.class);
		cc.WebElements("logeshwari@gmail.com", "Test@123","123");
	}

}
