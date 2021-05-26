package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.CreateAcctPage;

public class TC_CreateAcc extends BaseClass {

	@Test
	public void CreateAcc() {
		CreateAcctPage cap = PageFactory.initElements(driver, CreateAcctPage.class);
		cap.WebElements("Poorna", "kala", "spooranakala@gmail.com", "spooranakala@gmail.com", "Poorana@123",
				"Poorana@123");
		System.out.println("Account created successfully");
	}
}
