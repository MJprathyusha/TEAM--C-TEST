package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.example.steps.StepsLibrary.Order;


import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class TC4_Order extends WebDriverTestCase {
	@QAFDataProvider(dataFile = "TestData/logeshwari.xls", sheetName = "UserDetail")
	@Test
	public void order(Map<String, String> userData) throws InterruptedException  {
		get("/");
		getDriver().manage().window().maximize();
		Order(userData.get("emailid"),userData.get("password"));

}
}
