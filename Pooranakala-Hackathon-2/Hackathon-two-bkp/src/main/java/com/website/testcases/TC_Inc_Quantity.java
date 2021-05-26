package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Apply_code;
import com.website.pages.BaseClass;
import com.website.pages.Increase_Quantity;
import com.website.pages.View_Cart;

public class TC_Inc_Quantity extends BaseClass{
	
	
	@Test
	public void increase() {

		Increase_Quantity iq = PageFactory.initElements(driver, Increase_Quantity.class);

		iq.WebElements("spooranakala@gmail.com", "Poorana@123", "https://www.ylighting.com/b/large-chandelier");

		System.out.println("increased the quantity successfully");
	
}

}
