package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Add_To_cart;
import com.website.pages.BaseClass;
import com.website.pages.View_Cart;

public class TC_View_cart extends BaseClass {

	@Test
	public void viewed() {

		View_Cart vc = PageFactory.initElements(driver, View_Cart.class);

		vc.WebElements("spooranakala@gmail.com", "Poorana@123", "https://www.ylighting.com/b/large-chandelier");

		System.out.println("view the cart successfully");
	}

}
