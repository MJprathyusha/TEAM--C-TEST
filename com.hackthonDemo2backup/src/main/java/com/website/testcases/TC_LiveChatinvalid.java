package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LiveChatinvalid;

public class TC_LiveChatinvalid extends BaseClass{

	 @Test
	    public void LiveChat() {

	 

		 LiveChatinvalid live = PageFactory.initElements(driver, LiveChatinvalid.class);
		 live.WebElements("Logesh","loge@gmail.com");
	        System.out.println("sign in successfully");
	        System.out.println("Live chat cannot done successfully");
	    }
}
