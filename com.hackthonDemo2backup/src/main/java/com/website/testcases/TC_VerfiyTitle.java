package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.VerfiyTitle;

public class TC_VerfiyTitle extends BaseClass {
	@Test
	public void Title() {
		VerfiyTitle lp = PageFactory.initElements(driver, VerfiyTitle.class);
		lp.WebElements("logeshwari@gmail.com", "Test@123");
		System.out.println("Sigin successfully");
		driver.navigate().back();
		String expected = "YLighting | Best in Modern Lighting and Contemporary Design";
		String actual = driver.getTitle();

		if (actual.equalsIgnoreCase(expected)) {
			System.out.println("Pass: Your title is verified");
		} else {
			System.out.println("fail");
		}
		driver.close();
	}
}
