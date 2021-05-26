package com.website.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LiveChatPage;
import com.website.pages.Remove_from_cart;

public class TC_Remove extends BaseClass {

	@Test
	public void remove() {

		Remove_from_cart rc = PageFactory.initElements(driver, Remove_from_cart.class);
		
		rc.WebElements("spooranakala@gmail.com","Poorana@123","https://www.ylighting.com/b/large-chandelier");
		System.out.println("removed from  cart successfully");
		
	}

}
