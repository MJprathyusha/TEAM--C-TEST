package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.example.steps.StepsLibrary.Contact;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class TC6_ContactUs extends WebDriverTestCase {
	@QAFDataProvider(dataFile = "TestData/logeshwari.xls", sheetName = "UserDetail")
	@Test
	public void contact(Map<String, String> userData) throws InterruptedException  {
		get("/");
		getDriver().manage().window().maximize();

		Contact(userData.get("emailid"));
		
	}

}
