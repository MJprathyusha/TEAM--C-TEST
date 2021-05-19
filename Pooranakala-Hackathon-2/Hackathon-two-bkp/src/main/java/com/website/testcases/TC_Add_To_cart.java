package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.Add_To_cart;
import com.website.pages.BaseClass;
import com.website.pages.LiveChatPage;

public class TC_Add_To_cart extends BaseClass {
	@Test
	public void added() {

		Add_To_cart ac = PageFactory.initElements(driver, Add_To_cart.class);

		ac.WebElements("spooranakala@gmail.com","Poorana@123","https://www.ylighting.com/b/large-chandelier");

		System.out.println("added to cart successfully");
	}
}
